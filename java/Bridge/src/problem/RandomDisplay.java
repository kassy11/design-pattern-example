package problem;

// 問題9-1
public class RandomDisplay extends CountDisplay {
  public RandomDisplay(DisplayImpl impl) {
    super(impl);
  }

  public void randomTimes(int times) {
    super.multiDisplay(times);
  }
}
