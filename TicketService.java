import java.util.Date;
import java.util.Map;

public class TicketService {
    public static void main(String[] args) {

        //creation of an empty ticket object
        Ticket emptyTicket = new Ticket();
        System.out.println(emptyTicket);

        //creation of a full ticket object
        Ticket fullTicket = new Ticket("congr hall", "123", true, 'A', 100.5);
        System.out.println(fullTicket);

        //creation of a limited ticket object
        Ticket limitedTicket = new Ticket("good hall", "456");
        System.out.println(limitedTicket);

        //retrieving creation times
        for (Map.Entry<String, Date> entry : Ticket.getTicketCreatedTimes().entrySet()) {
            System.out.println("Creation time for ticket with ID '" + entry.getKey() + "' is '" + entry.getValue() + "'");
        }
    }
}
