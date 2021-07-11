package observer;

// 観察した数を「数字」で表示するためのクラス
public class DigitObserver implements Observer {
  @Override
  public void update(NumberGenerator generator) {
    System.out.println(getClass().getSimpleName() + ":" + generator.getNumber());
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
