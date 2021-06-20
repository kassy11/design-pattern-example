package problem.makeinterface;

public class TextBuilder implements Builder {
  private StringBuffer buf = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    buf.append("------------\n");
    buf.append("[" + title + "] \n");
    buf.append("\n");
  }

  @Override
  public void makeString(String str) {
    buf.append(' ' + str + '\n');
    buf.append("\n");
  }

  @Override
  public void makeItems(String[] items) {
    for (int i = 0; i < items.length; i++) {
      buf.append(" " + items[i] + "\n");
    }
    buf.append("\n");
  }

  @Override
  public void close() {
    buf.append("+++++++++++++++++++++\n");
  }

  public String getResult() {
    return buf.toString();
  }
}
