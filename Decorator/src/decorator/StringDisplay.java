package decorator;

// 一行の文字列を表示するクラス
public class StringDisplay extends Display {
  private String string;

  public StringDisplay(String string) {
    this.string = string;
  }

  @Override
  public int getColumns() {
    return string.getBytes().length;
  }

  // 行数は常に1
  @Override
  public int getRows() {
    return 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0) {
      return string;
    } else {
      return null;
    }
  }
}
