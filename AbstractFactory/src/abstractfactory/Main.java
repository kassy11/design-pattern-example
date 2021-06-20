package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Main class.name.of.ConcreteFactory");
      System.exit(0);
    }
    Factory factory = Factory.getFactory(args[0]);
    Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
    Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

    Tray traynews = factory.createTray("新聞");
    traynews.add(asahi);
    traynews.add(yomiuri);

    Page page = factory.createPage("Link", "君島みお");
    page.add(traynews);
    page.output();
  }
}
