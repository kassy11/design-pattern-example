package builder;

// 文書を構成するためのメソッドを定義する
public abstract class Builder {
  public abstract void makeTitle(String title);

  public abstract void makeString(String str);

  public abstract void makeItems(String[] items);

  public abstract void close();
}
