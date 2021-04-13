package problem;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    FileIO f = new FileProperties();
    try {
      f.readFromFile("src/problem/file.txt");
      f.setValue("year", "2004");
      f.setValue("month", "4");
      f.setValue("day", "21");
      f.writeToFile("src/problem/newfile.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(f.getValue("year"));
    System.out.println(f.getValue("month"));
    System.out.println(f.getValue("day"));
  }
}
