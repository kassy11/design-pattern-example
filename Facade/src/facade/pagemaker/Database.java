package facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// データベース名を指定して、それに対応したPropertiesを作成する
class Database {
  private Database() {}

  public static Properties getProperties(String dbname) {
    String filename = dbname + ".txt";
    Properties prop = new Properties();
    try {
      prop.load(new FileInputStream(filename));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println(filename + "is not found.");
    }
    return prop;
  }
}
