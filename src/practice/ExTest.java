package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExTest {
    public void printBeforeEx() {
        System.out.println("예외 터지기 전에 출력합니다.");
    }

    public void printAfterEx() {
        System.out.println("예외 터진 후에 출력합니다.");
    }

    public void printAfterTryCatch() {
        System.out.println("try-catch 구문 후를 출력합니다.");
    }

    public int getParticipants(String participantFile){
        Scanner contents = null;
        try {
            contents = new Scanner(new File(participantFile));
        } catch (FileNotFoundException e) {
            System.out.printf("logging = %s", "File not found, resetting score.");
            e.printStackTrace();
        } finally {
            if (contents == null) {
                assert false;
                contents.close();
            }
        }
        return Integer.parseInt(contents.nextLine());
    }
    public static void main(String[] args) {
        ExTest ex = new ExTest();
        int zeroNum = 0;
        try {
            ex.printBeforeEx();
            System.out.println(10 / zeroNum);
            ex.printAfterEx();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        ex.printAfterTryCatch();
        ex.getParticipants("participants");
    }
}
