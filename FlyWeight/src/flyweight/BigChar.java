package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 引数で与えられた数字文字を大きな文字バージョンに書き換える
public class BigChar {
  private char charname;
  private String fontdate;

  public BigChar(char charname) {
    this.charname = charname;
    try (BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".txt"))) {
      String line;
      StringBuffer buf = new StringBuffer();
      while ((line = reader.readLine()) != null) {
        buf.append(line);
        buf.append("\n");
      }
      this.fontdate = buf.toString();
    } catch (IOException e) {
      this.fontdate = charname + "?";
      e.printStackTrace();
    }
  }

  public void print() {
    System.out.println(fontdate);
  }
}
