package factory.framework;

// TemplateMethodパターンを使っている
public abstract class Factory {
  // Productのインスタンスを生成する
  public final Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
  }

  protected abstract Product createProduct(String owner);

  protected abstract void registerProduct(Product product);
}
