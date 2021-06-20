package factory.framework;

// TemplateMethodパターンでのスーパークラスの役割→
public abstract class Factory {
  // Productのインスタンスを生成する
  public final Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
  }

  // 個々の実装方法は複数通りある
  // 1. 今みたいに抽象メソッドのままにしておく
  // 2. デフォルトのインスタンス生成の実装を用意する
  // 3. デフォルトの実装を例外を投げるようにする→サブクラスで実装していないことを検出できる
  protected abstract Product createProduct(String owner);

  protected abstract void registerProduct(Product product);
}
