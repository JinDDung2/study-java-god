package object.movie;

public class AmountDiscountPolicy extends DiscountPolicy{
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }
    @Override
    protected Money getDiscountMoney(Screen screen) {
        return discountAmount;
    }
}
