package object.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buyTicket(ticketOffice.getTicket()));
    }

    @Override
    public String toString() {
        return "TicketSeller{" +
                "ticketOffice=" + ticketOffice +
                '}';
    }
}