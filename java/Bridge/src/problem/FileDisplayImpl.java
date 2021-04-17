package problem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 問題9-2
public class FileDisplayImpl extends DisplayImpl {
  private final String filename;
  private BufferedReader reader;

  public FileDisplayImpl(String filename) {
    this.filename = filename;
  }

  @Override
  public void rawOpen() {
    try {
      reader = new BufferedReader(new FileReader(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void rawPrint() {
    System.out.println("-------file start--------");
    String line = "";
    try {
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("-------file end--------");
  }

  @Override
  public void rawClose() {
    try {
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
