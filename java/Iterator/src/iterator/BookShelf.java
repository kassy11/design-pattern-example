package iterator;
// ConcreteAggregate
public class BookShelf implements Aggregate {
  private Book[] books;
  private int last = 0;

  public BookShelf(int maxsize) {
    this.books = new Book[maxsize];
  }

  public Book getBookAt(int index) {
    return books[index];
  }

  public void appendBook(Book book) {
    this.books[last] = book;
    last++;
  }

  public int getLength() {
    return last;
  }

  // Aggregateインタフェースを実装する
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
