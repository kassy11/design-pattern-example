package problem;
public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("ドラえもん１"));
        bookShelf.appendBook(new Book("ドラえもん２"));
        bookShelf.appendBook(new Book("ドラえもん３"));
        bookShelf.appendBook(new Book("ドラえもん４"));
        bookShelf.appendBook(new Book("ドラえもん５"));

        // BookShelfの実装に関係なくループを回せる
        Iterator it = bookShelf.iterator(); // BookShelfIteratorではなくIteratorに代入
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
