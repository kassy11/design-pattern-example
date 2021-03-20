package problem;

// 集合体を表現するインタフェース
public interface Aggregate {
    // 集合体を走査するためのメソッド
    public abstract Iterator iterator();
}