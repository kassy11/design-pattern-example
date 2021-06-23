package decorator;

public class UpDownBorder extends Border{
    private final char borderChar;
    public UpDownBorder(Display display, char borderChar){
        super(display);
        this.borderChar = borderChar;
    }
    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() -1){
            return makeLine(borderChar, getColumns());
        }else {
            return display.getRowText(row -1);
        }
    }

    private String makeLine(char ch, int count){
        StringBuffer buffer = new StringBuffer();
        buffer.append(String.valueOf(ch).repeat(Math.max(0, count)));
        return buffer.toString();
    }
}
