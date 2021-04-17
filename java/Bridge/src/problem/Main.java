package problem;

public class Main {
  public static void main(String[] args) {
    // 機能のクラスを作って操作する→実際の処理は実装のクラス通りに行われる
    Display d1 = new Display(new StringDisplayImpl("Hello, Japan"));
    Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
    RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Random"));
    Display d5 = new Display(new FileDisplayImpl("test.txt"));
    IncreaseDisplay d6 = new IncreaseDisplay(new CharDsiplay('<', '*', '>'), 10);

    d1.display();
    d2.display();
    d3.display();
    d3.multiDisplay(5);
    d4.randomTimes(10);
    d5.display();
    d6.increaseDisplay(5);
  }
}
