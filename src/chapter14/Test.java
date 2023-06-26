package chapter14;

public class Test {
    public static void main(String[] args) {
        int[] intArr = new int[3];
        try {
            System.out.println("before ArrayIndexOutOfBoundsException");
            System.out.println(intArr[3]);
            System.out.println("after ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("after try-cacth");
    }
}
