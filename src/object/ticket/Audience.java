package object.ticket;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buyTicket(Ticket ticket) {
        return bag.hold(ticket);
    }

    @Override
    public String toString() {
        return "Audience{" +
                "bag=" + bag +
                '}';
    }
}
