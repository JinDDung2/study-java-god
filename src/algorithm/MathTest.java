package algorithm;

public class MathTest {
    public static void main(String[] args) {
        long num = 0;
        for (int i = 0; i<5; i++) {
            double x = Math.sqrt(i);
            num += (Math.floor(x) + 1L) / 2;
            System.out.println("num = " + num);
        }

        int a = -10;
        int b = 100;
        int c = 3;
        System.out.println("divide a/c = " + a / c);
        System.out.println("divide a/c = " + Math.floor(a / c));
        System.out.println("divide b/c = " + b / c);
        System.out.println("Math.floorDiv(a, c) = " + Math.floorDiv(a, c));
        System.out.println("Math.floorDiv(b, c) = " + Math.floorDiv(b, c));
    }
}
