package practice.th;

public class AmountThread {
    private int amount;

    public AmountThread() {
        this.amount = 0;
    }

    public void plus(int num) {
        synchronized (this) {
            amount += num;
        }
    }

    public void minus(int num) {
        synchronized (this) {
            amount -= num;
        }
    }

    public int getAmount() {
        return this.amount;
    }
}
