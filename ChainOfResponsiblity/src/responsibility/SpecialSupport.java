package responsibility;

// 指定した番号のトラブルを処理するクラス
public class SpecialSupport extends Support {
  private final Integer number;

  public SpecialSupport(String name, Integer number) {
    super(name);
    this.number = number;
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return trouble.getNumber().equals(number);
  }
}
