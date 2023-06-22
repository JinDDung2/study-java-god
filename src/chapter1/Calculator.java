package chapter1;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public Long add(long num1, long num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public Long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("분모는 0이 될 수 없습니다.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.divide(12, 23);
        System.out.println("result = " + result);
    }
}
