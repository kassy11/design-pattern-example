package iterator;

// forにおけるループ変数iのような役割を果たすインタフェース
// メソッドの種類は用途によって異なる
public interface Iterator {
  public abstract boolean hasNext();

  public abstract Object next();
}
