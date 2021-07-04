package visitor;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println("Making root entries....");
      Directory rootDir = new Directory("root");
      Directory binDir = new Directory("bin");
      rootDir.add(binDir);
      binDir.add(new File("test.txt", 1000));
      rootDir.accept(new ListVisitor());
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
