package iterator;

// ConcreteIterator
public class BookShelfIterator implements Iterator {
  private BookShelf bookShelf;
  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  // Iteratorインタフェースを実装する
  public boolean hasNext() { // 次にnext()を読んで大丈夫か調べる
    if (index < bookShelf.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  public Object next() { // 現在注目しているインスタンスを返し、次に進める
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
