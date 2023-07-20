package practice.th;

import java.util.concurrent.Semaphore;

public class DeadLockExample {

    private static final Semaphore semaphoreA = new Semaphore(1);
    private static final Semaphore semaphoreB = new Semaphore(1);

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            try {
                semaphoreA.acquire();
                Thread.sleep(1000);
                semaphoreB.acquire();

                System.out.println("Thread A running!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphoreA.release();
                System.out.println("semaphore A in Thread A is released");
                semaphoreB.release();
                System.out.println("semaphore B in Thread A is released");
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                semaphoreB.acquire();
                Thread.sleep(1000);
                semaphoreA.acquire();

                System.out.println("Thread B running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphoreB.release();
                System.out.println("semaphore B in Thread A is released");
                semaphoreA.release();
                System.out.println("semaphore A in Thread A is released");
            }
        });

        threadA.start();
        threadB.start();
    }

}
