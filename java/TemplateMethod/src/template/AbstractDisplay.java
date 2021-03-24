package template;

public abstract class AbstractDisplay {
  public abstract void open();

  public abstract void print();

  public abstract void close();
  // 上記３つのメソッドを実装するのはサブクラスなので、display()が具体的kに何をするかは分からない
  public final void display() {
    open();
    for (int i = 0; i < 5; i++) {
      print();
    }
    close();
  }
}
