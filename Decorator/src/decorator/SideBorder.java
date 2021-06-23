package decorator;

// 文字列の左右に文字で飾りをつけるクラス
public class SideBorder extends Border {
  private final char borderChar;

  public SideBorder(Display display, char ch) {
    super(display);
    this.borderChar = ch;
  }

  // 左右1文字ぶんずつだけ文字数が増える
  @Override
  public int getColumns() {
    return 1 + display.getColumns() + 1;
  }

  @Override
  public int getRows() {
    return display.getRows();
  }

  @Override
  public String getRowText(int row) {
    return borderChar + display.getRowText(row) + borderChar;
  }
}
