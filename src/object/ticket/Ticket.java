package object.ticket;

public class Ticket {
    private Long fee;

    public Ticket() {}

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return this.fee;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fee=" + fee +
                '}';
    }
}
