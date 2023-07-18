package practice.th;

import java.util.concurrent.locks.ReentrantLock;

public class InterruptLockExample {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                lock.lockInterruptibly(); // 인터럽트 가능한 락 획득 시도
                try {
                    // 락을 획득한 후 수행할 작업
                    System.out.println("Thread 1 acquired the lock");
                    Thread.sleep(2000);
                } finally {
                    lock.unlock(); // 락 해제
                    System.out.println("Thread 1 released the lock");
                }
            } catch (InterruptedException e) {
                // 인터럽트가 발생하여 락을 획득하지 못한 경우
                System.out.println("Thread 1 interrupted while acquiring the lock");
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                // 일정 시간 후 인터럽트를 발생시킴
                Thread.sleep(1000);
                thread1.interrupt(); // Thread 1을 인터럽트하여 락 획득 대기 상태에서 벗어나도록 함
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
