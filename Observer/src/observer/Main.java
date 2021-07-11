package observer;

public class Main {
  public static void main(String... args) {
    NumberGenerator randomGenerator = new RandomNumberGenerator();
    Observer digitObserver = new DigitObserver();
    Observer graphObserver = new GraphObserver();
    randomGenerator.addObserver(digitObserver);
    randomGenerator.addObserver(graphObserver);
    randomGenerator.execute();

    NumberGenerator incrementalNumberGenerator = new IncrementalNumberGenerator(1, 100, 3);
    incrementalNumberGenerator.addObserver(digitObserver);
    incrementalNumberGenerator.addObserver(graphObserver);
    incrementalNumberGenerator.execute();
  }
}
