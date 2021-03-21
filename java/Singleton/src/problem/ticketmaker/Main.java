package problem.ticketmaker;


public class Main {
    public static void main(String[] args){
        TicketMaker t1 = TicketMaker.getInstance();
        t1.getNextTicketNumber();
        TicketMaker t2 = TicketMaker.getInstance();
        t2.getNextTicketNumber();
        t1.showTickeNumber();
        t2.showTickeNumber();
        System.out.println(t1 == t2);
    }
}
