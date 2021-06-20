package abstractfactory.factory;

// 抽象的な工場
public abstract class Factory {
  // 抽象的な工場を作成する
  public static Factory getFactory(String classname) {
    Factory factory = null;
    try {
      // クラスを動的に読み込んで、インスタンスをつくる
      factory = (Factory) Class.forName(classname).newInstance();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return factory;
  }

  public abstract Link createLink(String caption, String url);

  public abstract Tray createTray(String caption);

  public abstract Page createPage(String title, String author);
}
