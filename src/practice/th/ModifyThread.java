package practice.th;

public class ModifyThread extends Thread{
    private final AmountThread amountThread;
    private boolean flag;

    public ModifyThread(AmountThread amountThread, boolean flag) {
        this.amountThread = amountThread;
        this.flag = flag;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++) {
            if (flag) {
                amountThread.plus(1);
            } else {
                amountThread.minus(1);
            }
        }
    }
}
