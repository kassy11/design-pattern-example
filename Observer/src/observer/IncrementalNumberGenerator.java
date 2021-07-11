package observer;

public class IncrementalNumberGenerator extends NumberGenerator {
  private final Integer startNum;
  private final Integer endNum;
  private final Integer step;
  private Integer nowNum;

  public IncrementalNumberGenerator(Integer startNum, Integer endNum, Integer step) {
    this.startNum = startNum;
    this.endNum = endNum;
    this.step = step;
    nowNum = startNum;
  }

  @Override
  public int getNumber() {
    return nowNum;
  }

  @Override
  public void execute() {
    for (int i = startNum; i < endNum; i++) {
      nowNum += step;
      notifyObservers();
    }
  }
}
