package responsibility;

// 「自分は何も問題を処理しない」というクラス
public class NoSupport extends Support {
  public NoSupport(String name) {
    super(name);
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return false;
  }
}
