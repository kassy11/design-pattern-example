package decorator;

// 複数行からなる文字列を表示するための抽象クラス
public abstract class Display {
  // 文字数
  public abstract int getColumns();

  // 行数
  public abstract int getRows();

  public abstract String getRowText(int row);

  public final void show() {
    for (int i = 0; i < getRows(); i++) {
      System.out.println(getRowText(i));
    }
  }
}
