package composite;

public class File extends Entry {
  private final String name;
  private final int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  protected void printList(String prefix) {
    // 文字列とオブジェクトを加えると自動的にオブジェクトのtoStringが呼び出される
    System.out.println(prefix + "/" + this);
  }
}
