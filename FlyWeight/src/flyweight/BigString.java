package flyweight;

// 大きな文字を管理するクラス
public class BigString {

  private BigChar[] bigChars;
  private boolean shared = true;

  public BigString(String str) {
    bigChars = new BigChar[str.length()];
    BigCharFactory factory = BigCharFactory.getInstance();
    for (int i = 0; i < bigChars.length; i++) {
      bigChars[i] = factory.getBigChar(str.charAt(i));
    }
  }

  public void print() {
    for (BigChar bigChar : bigChars) {
      bigChar.print();
    }
  }
}
