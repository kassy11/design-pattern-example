package prototype.framework;

// java.lang.Cloneableインタフェースを継承するインタフェース
// Managerクラスと他の具象クラスの仲介役
public interface Product extends Cloneable {
  public abstract void use(String s);

  public abstract Product createClone();
}
