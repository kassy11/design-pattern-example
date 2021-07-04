package responsibility;

// 奇数番号の問題を処理するクラス
public class OddSupport extends Support {
  public OddSupport(String name) {
    super(name);
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return trouble.getNumber() % 2 == 1;
  }
}
