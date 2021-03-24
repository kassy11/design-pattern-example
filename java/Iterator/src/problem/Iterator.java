package problem;

// forにおけるループ変数iのような役割を果たすインタフェース
public interface Iterator {
  public abstract boolean hasNext();

  public abstract Object next();
}
