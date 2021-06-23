package composite;

public class Main {
  public static void main(String... args) {
    try {
      System.out.println("Making root entries...");
      Directory rootdir = new Directory("root");
      Directory bindir = new Directory("bin");
      rootdir.add(bindir);
      bindir.add(new File("test.txt", 2000));
      rootdir.printList();
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
