package prototype;

import prototype.framework.Product;

// Productインターフェースを実装してさえいれば、そのインスタンスを複製できる
public class MessageBox implements Product {
  private char decochar;

  public MessageBox(char decochar) {
    this.decochar = decochar;
  }

  @Override
  public void use(String s) {
    int length = s.getBytes().length;
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println("");
    System.out.println(decochar + " " + s + " " + decochar);
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println(decochar);
  }

  @Override
  public Product createClone() {
    Product p = null;
    try {
      // clone()はJavaの言語仕様で規定された、自分自身を複製するメソッド
      p = (Product) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }
}
