package abstractfactory.factory;

// List, Trayのスーパークラス
public abstract class Item {
  protected String caption;

  public Item(String caption) {
    this.caption = caption;
  }

  public abstract String makeHTML();
}
