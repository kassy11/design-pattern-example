package problem;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("ドラえもん１"));
    bookShelf.appendBook(new Book("ドラえもん２"));
    bookShelf.appendBook(new Book("ドラえもん３"));
    bookShelf.appendBook(new Book("ドラえもん４"));
    bookShelf.appendBook(new Book("ドラえもん５"));
    bookShelf.appendBook(new Book("クレヨンしんちゃん2"));

    // BookShelfの実装に関係なくループを回せる
    // BookShelfIteratorではなくIteratorに代入することで、BookShelfIteratorへの依存をなくす
    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}
