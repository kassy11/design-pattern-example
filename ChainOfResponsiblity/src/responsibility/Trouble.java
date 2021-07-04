package responsibility;

// 発生したトラブルを表現するクラス
public class Trouble {
  private final Integer number;

  public Trouble(Integer number) {
    this.number = number;
  }

  public Integer getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return "Trouble{" + "number=" + number + '}';
  }
}
