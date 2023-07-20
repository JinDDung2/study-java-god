package practice.th;

import java.util.concurrent.Semaphore;

public class NoDeadLockExample {

    private static final Semaphore semaphoreA = new Semaphore(1);
    private static final Semaphore semaphoreB = new Semaphore(1);

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            try {
                semaphoreA.acquire();
                Thread.sleep(1000);
                semaphoreB.acquire();

                System.out.println("Thread A running!");

                semaphoreB.release();
                System.out.println("semaphore B in Thread A is released");
                semaphoreA.release();
                System.out.println("semaphore A in Thread A is released");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                semaphoreA.acquire();
                Thread.sleep(1000);
                semaphoreB.acquire();

                System.out.println("Thread B running");

                semaphoreB.release();
                System.out.println("semaphore B in Thread A is released");
                semaphoreA.release();
                System.out.println("semaphore A in Thread A is released");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadA.start();
        threadB.start();
    }

}
