package object.movie;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition{
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition() {}

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screen screen) {
        return screen.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screen.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo(screen.getStartTime().toLocalTime()) >= 0;
    }

    @Override
    public String toString() {
        return "PeriodCondition{" +
                "dayOfWeek=" + dayOfWeek +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
