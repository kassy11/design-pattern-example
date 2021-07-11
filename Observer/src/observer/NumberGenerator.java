package observer;

import java.util.ArrayList;

// 数を生成する、観察される側
public abstract class NumberGenerator {
  private final ArrayList<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void deleteObserver(Observer observer) {
    observers.remove(observer);
  }

  // 個々のobserver全員に対して更新通知をする
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }

  public abstract int getNumber();

  public abstract void execute();
}
