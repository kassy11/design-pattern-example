package problem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
  private FileOutputStream out = null;

  @Override
  public void readFromFile(String filename) throws IOException {
    load(new FileInputStream(filename));
  }

  @Override
  public void writeToFile(String filename) throws IOException {
    out = new FileOutputStream(filename);
    store(out, "written by FileProperties");
  }

  @Override
  public void setValue(String key, String value) throws IOException {
    setProperty(key, value);
  }

  @Override
  public String getValue(String key) {
    return getProperty(key);
  }
}
