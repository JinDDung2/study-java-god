package practice;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class StaticTest {
    public static void main(String[] args) {
        Account.setMoney(10000);
        final int numOfThread = 100;
        CountDownLatch countDownLatch = new CountDownLatch(numOfThread);
        ExecutorService executorService = Executors.newFixedThreadPool(numOfThread);

        IntStream.range(0, 100)
                .forEach(i -> executorService.submit(() -> {
                    try {
                        Integer money = Account.getMoney();
                        Account.setMoney(money+1);
                    } finally {
                        countDownLatch.countDown();
                    }
                }));
        System.out.println("Account.getMoney() = " + Account.getMoney()); // 10095 -> thread-safe 하지 않음
    }
}
