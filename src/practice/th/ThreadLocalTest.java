package practice.th;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {
    // 스레드 생성 및 관리를 ExecutorService에게 위임
    private final ExecutorService executorService = Executors.newFixedThreadPool(3);
    private final int MAX_CHECK = 3;
    private int checkIdx = 0;
    static class TestThread extends Thread{
        public static final ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "testName");
        private final String name;

        public TestThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.printf("%s start. ThreadLocal: %s%n", name, threadLocal.get());
            threadLocal.set(name);
            System.out.printf("%s finish. ThreadLocal: %s%n", name, threadLocal.get());
            threadLocal.remove();
        }
    }

    public void runTest() {
        for (int i = 1; i <= 5; i++) {
            TestThread thread = new TestThread("thread-" + i);
            executorService.execute(thread);
        }

        // 스레드 풀 종료
        executorService.shutdown();

        // 스레드 풀 종료 대기
        while (checkIdx < MAX_CHECK) {
            try {
                if (executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                    break;
                }
            } catch (InterruptedException e) {
                // 로깅과 함께 활용해야 하지만 print문으로 대체
                System.err.println("Error: " + e);
                // 활동중인 스레드 모두 종료 -> 비정상적인 결과 초래할 가능성 있음
                executorService.shutdownNow();
            }
        }
        System.out.println("All thread are finished");
    }

    public static void main(String[] args) {
        new ThreadLocalTest().runTest();
    }
}
