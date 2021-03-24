package iterator;

public class Main {
  public static void main(String[] args) {
    iterator.BookShelf bookShelf = new iterator.BookShelf(4);
    bookShelf.appendBook(new Book("ドラえもん１"));
    bookShelf.appendBook(new Book("ドラえもん２"));
    bookShelf.appendBook(new Book("ドラえもん３"));
    bookShelf.appendBook(new Book("ドラえもん４"));

    // BookShelfの実装に関係なくループを回せる
    Iterator it = bookShelf.iterator(); // BookShelfIteratorではなくIteratorに代入
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}
