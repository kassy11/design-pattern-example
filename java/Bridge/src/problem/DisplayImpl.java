package problem;

// 実装のクラス階層の最上位（Displayへの操作は実質こいつへの操作になる）
public abstract class DisplayImpl {
  public abstract void rawOpen();

  public abstract void rawPrint();

  public abstract void rawClose();
}
