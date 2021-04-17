package problem;

// 問題9-3
public class CharDsiplay extends DisplayImpl {
  private char head;
  private char body;
  private char foot;

  public CharDsiplay(char head, char body, char foot) {
    this.head = head;
    this.body = body;
    this.foot = foot;
  }

  @Override
  public void rawOpen() {
    System.out.print(head);
  }

  @Override
  public void rawPrint() {
    System.out.print(body);
  }

  @Override
  public void rawClose() {
    System.out.println(foot);
  }
}
