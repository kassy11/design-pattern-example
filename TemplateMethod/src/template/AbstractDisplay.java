package template;

// テンプレートクラス
// インタフェースだと処理の大枠が書けないので抽象クラスを使う
// インタフェースのdefaultメソッドを使っても、上書きされたらテンプレートの意味がなくなるのでダメ
public abstract class AbstractDisplay {
  public abstract void open();

  public abstract void print();

  public abstract void close();
  // 上記３つのメソッドを実装するのはサブクラスなので、display()が具体的に何をするかは分からない
  // 処理の流れだけを記述しておく
  public final void display() {
    open();
    for (int i = 0; i < 5; i++) {
      print();
    }
    close();
  }
}
