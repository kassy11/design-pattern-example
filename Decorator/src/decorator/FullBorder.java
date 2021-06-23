package decorator;

public class FullBorder extends Border {
  public FullBorder(Display display) {
    super(display);
  }

  @Override
  public int getColumns() {
    return 1 + display.getColumns() + 1;
  }

  // 行数は中身の行数に上下1文字ずつを加えたもの
  @Override
  public int getRows() {
    return 1 + display.getRows() + 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0) { // 枠の上端
      return "+" + makeLine('-', display.getColumns()) + "+";
    } else if (row == display.getRows() + 1) { // 枠の下端
      return "+" + makeLine('-', display.getColumns()) + "+";
    } else { // それ以外
      return "|" + display.getRowText(row - 1) + "|";
    }
  }

  private String makeLine(char ch, int count) {
    StringBuffer buf = new StringBuffer();
    buf.append(String.valueOf(ch).repeat(Math.max(0, count)));
    return buf.toString();
  }
}
