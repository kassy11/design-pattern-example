package iterator;

// 一つのConcreteAgreegateに対して、複数のConceteIteratorが持てる例
public class BookShelfIteratorFromLast implements Iterator {
  private BookShelf bookShelf;
  private int lastIndex;

  public BookShelfIteratorFromLast(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.lastIndex = bookShelf.getLength();
  }

  @Override
  public boolean hasNext() {
    if (lastIndex > 0) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public Object next() {
    Book book = bookShelf.getBookAt(lastIndex - 1);
    lastIndex--;
    return book;
  }
}
