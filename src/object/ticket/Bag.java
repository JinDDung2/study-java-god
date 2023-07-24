package object.ticket;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            minusAmount(ticket.getFee());
            setTicket(ticket);
            return ticket.getFee();
        }
    }

    public Long getAmount() {
        return this.amount;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "amount=" + amount +
                ", invitation=" + invitation +
                ", ticket=" + ticket +
                '}';
    }
}
