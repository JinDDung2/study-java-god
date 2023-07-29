package object.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screen screen) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screen)) {
                return getDiscountMoney(screen);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountMoney(Screen screen);

    @Override
    public String toString() {
        return "DiscountPolicy{" +
                "conditions=" + conditions +
                '}';
    }
}
