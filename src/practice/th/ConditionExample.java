package practice.th;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionExample {
    private static final ReentrantLock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();
    private static boolean isReady = false;

    public static void main(String[] args) {
        Thread producerThread = new Thread(() -> {
            lock.lock();
            try {
                while (!isReady) {
                    condition.await();
                }
                System.out.println("producer: ready!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread consumerThread = new Thread(() -> {
            lock.lock();
            try {
                isReady = true;
                System.out.println("consumer: signal ready!");
                condition.signal();
            } finally {
                lock.unlock();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
