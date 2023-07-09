package practice.th;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        long startTime = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            runSync.runCalculate();
        }
        long endTime = System.currentTimeMillis();
        // 1,000,000 (sync) -> 406330 ms
        // 1,000,000 -> 125767 ms
        // 5 (sync) -> 41ms
        // 5 -> 34ms

        System.out.printf("time = %d ms\n", endTime - startTime);
    }

    private void runCalculate() {
        AmountThread amountThread = new AmountThread();
        ModifyThread thread1 = new ModifyThread(amountThread, true);
        ModifyThread thread2 = new ModifyThread(amountThread, true);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            System.out.printf("Final value = %d \n", amountThread.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
