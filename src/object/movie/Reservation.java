package object.movie;

public class Reservation {
    private User user;
    private Screen screen;
    private Money fee;
    private int audienceCount;

    public Reservation() {}

    public Reservation(User user, Screen screen, Money fee, int audienceCount) {
        this.user = user;
        this.screen = screen;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
