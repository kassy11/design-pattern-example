package problem.makeinterface;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      usage();
      System.exit(0);
    }

    if (args[0].equals("plain")) {
      TextBuilder textBuilder = new TextBuilder();
      Director director = new Director(textBuilder);
      director.construct();
      String result = textBuilder.getResult();
      System.out.println(result);
    }
  }

  public static void usage() {
    System.out.println("Usage: java Main plain   プレーンテキストで文書作成");
  }
}
