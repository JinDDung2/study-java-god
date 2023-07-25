package object.movie;

public class SequenceCondition implements DiscountCondition{
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screen screen) {
        return screen.isSequence(sequence);
    }

    @Override
    public String toString() {
        return "SequenceCondition{" +
                "sequence=" + sequence +
                '}';
    }
}
