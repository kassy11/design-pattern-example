package iterator;

// 集合体を表現するインタフェース
public interface Aggregate {
  // 集合体を走査するためのメソッドを定義する
  public abstract Iterator iterator();
}
