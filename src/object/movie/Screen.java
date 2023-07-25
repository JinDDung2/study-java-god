package object.movie;

import practice.coffee.Customer;

import java.time.LocalDateTime;

public class Screen {
    private Movie movie;
    private int sequence;
    private LocalDateTime startTime;

    public Screen() {}

    public Screen(Movie movie, int sequence, LocalDateTime startTime) {
        this.movie = movie;
        this.sequence = sequence;
        this.startTime = startTime;
    }

    public Reservation reserve(User user, int audienceCount) {
        return new Reservation(user, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
