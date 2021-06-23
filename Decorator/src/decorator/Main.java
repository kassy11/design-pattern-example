package decorator;

public class Main {
  public static void main(String[] args) {
    Display b1 = new StringDisplay("hello, world!");
    Display b2 = new SideBorder(b1, '#');
    Display b3 = new FullBorder(b2);
    b1.show();
    b2.show();
    b3.show();

    // 何重にも飾りをつけることができる

    Display b4 =
        new SideBorder(
            new FullBorder(
                new FullBorder(new SideBorder(new FullBorder(new StringDisplay("こんにちは")), '*'))),
            '/');
    b4.show();

    Display b5 = new UpDownBorder(b1, '$');
    b5.show();
  }
}
