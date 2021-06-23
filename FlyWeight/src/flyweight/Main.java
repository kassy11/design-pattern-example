package flyweight;

public class Main {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("USage: java Main digits");
      System.out.println("Example: java Main 121212121");
      System.exit(0);
    }

    BigString bs1 = new BigString(args[0]);
    bs1.print();
  }
}
