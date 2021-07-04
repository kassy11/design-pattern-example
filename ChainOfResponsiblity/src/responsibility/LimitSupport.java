package responsibility;

// limitで指定した番号未満の問題を解決するクラス
public class LimitSupport extends Support {
  private final Integer limit;

  public LimitSupport(String name, Integer limit) {
    super(name);
    this.limit = limit;
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return trouble.getNumber() < limit;
  }
}
