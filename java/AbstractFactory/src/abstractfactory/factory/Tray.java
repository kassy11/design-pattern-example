package abstractfactory.factory;

import java.util.ArrayList;

// 複数のLink, Trayを集めて管理するクラス
public abstract class Tray extends Item {
  protected ArrayList tray = new ArrayList();

  public Tray(String caption) {
    super(caption);
  }

  public void add(Item item) {
    tray.add(item);
  }
}
