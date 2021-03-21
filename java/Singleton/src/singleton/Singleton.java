package singleton;

public class Singleton {
    // ここだけでインスタンスを生成するようにする
    // staticフィールドの初期化がはじめに行われることを利用している
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
