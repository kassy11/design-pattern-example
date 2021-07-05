package facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// DatabaseをHtmlWriterを組み合わせてページを作成するクラス
public class PageMaker {
  private PageMaker() {}

  // 外部にはここだけが公開されている（窓口になっている）
  public static void makeWelcomePage(String mailaddr, String filename) {
    try {
      Properties mailprop = Database.getProperties("maildata");
      String username = mailprop.getProperty(mailaddr);
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
      writer.title("welcome to " + username + " page");
      writer.paragraph(username + "のページです");
      writer.paragraph("メールください");
      writer.mailto(mailaddr, username);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
