package adapter.extend;

public class Main {
  public static void main(String[] args) {
    // Printインタフェースを使ってプログラミングしている
    // Bannerクラスは隠されている
    Print p = new PrintBanner("Hello");
    p.printStrong();
    ;
    p.printWeek();
  }
}
