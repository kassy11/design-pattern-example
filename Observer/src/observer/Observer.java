package observer;

// 観察する側ではあるが、能動的に観察するのではなく、通知を待つ
public interface Observer {
  // 観察される側がObserverに対して通知をするためのメソッド
  public abstract void update(NumberGenerator generator);
}
