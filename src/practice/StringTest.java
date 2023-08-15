package practice;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StringTest {

    private void testTryWittResource(File file) {
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8); BufferedReader br = new BufferedReader(fr)) {
            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String testCatchReturn() {
        int a = 10;
        int b = 0;
        try {
            System.out.println("testCatchReturn 메서드 실행");
            System.out.println("in try test ago.");
            System.out.println("test output = " + a / b);
            System.out.println("in try test after");
        } catch (ArithmeticException e) {
            System.out.println("분모는 0이 될 수 없습니다.");
            return "catch 구문 return 실행 완료";
        } finally {
            System.out.println("무조건 실행해되는 finally 구문");
        }
        return "정상적인 return 실행 완료";
    }

    private String testCatchFinallyReturn() {
        int[] arr = new int[5];
        try {
            System.out.println("testCatchFinallyReturn 메서드 실행");
            System.out.println(arr[6]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열 길이를 초과했습니다.");
            return "catch 구문 return 실행 완료";
        } finally {
            System.out.println("무조건 실행해되는 finally 구문");
            return "finally 구문 return 실행 완료";
        }
    }
    public static void main(String[] args) {
        String a = "abc";
        String b = "123";
        System.out.println(a.compareTo(b));
        StringTest stringTest = new StringTest();
        System.out.println("stringTest.testMethod() = " + stringTest.testCatchReturn());
        System.out.println("------------------------------");
        System.out.println("stringTest.testCatchFinallyReturn() = " + stringTest.testCatchFinallyReturn());
        System.out.println("------------------------------");
        File file = new File("/Users/jinhyuck/Desktop/testFile.pages");
        stringTest.testTryWittResource(file);
    }
}
