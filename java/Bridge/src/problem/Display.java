package problem;

// 機能のクラス階層の最上位
public class Display {
  private final DisplayImpl impl;

  // Displayへの操作が全てImplへの操作になる（DisplayImplに委譲している）
  // 2つの階層をimplが橋渡ししていることに成る
  public Display(DisplayImpl impl) {
    this.impl = impl;
  }

  public void open() {
    impl.rawOpen();
  }

  public void print() {
    impl.rawPrint();
  }

  public void close() {
    impl.rawClose();
  }

  public void display() {
    open();
    print();
    close();
  }
}
