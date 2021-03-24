package problem.ticketmaker;

public class TicketMaker {
  private int ticket = 1000;
  private static TicketMaker maker = new TicketMaker();

  private TicketMaker() {}

  public static TicketMaker getInstance() {
    return maker;
  }

  public void getNextTicketNumber() {
    ticket++;
  }

  public void showTickeNumber() {
    System.out.println(this.ticket);
  }
}
