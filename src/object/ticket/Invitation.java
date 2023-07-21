package object.ticket;

import java.time.LocalDateTime;

public class Invitation {
    private LocalDateTime createdAt;

    public Invitation() {}

    public Invitation(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "createdAt=" + createdAt +
                '}';
    }
}
