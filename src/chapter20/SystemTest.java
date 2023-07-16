package chapter20;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        System.out.println("now=" + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("now=" + (System.nanoTime() - startNanoTime) + "ns");
    }
}
