package algorithm;

import java.util.Optional;

public class JustTest {
    public static void main(String[] args) {
        /*System.out.println(1 / 2);
        System.out.println(Math.floor(1 / 2));
        }*/
        Optional<String> optional1 = Optional.ofNullable("hello");
        System.out.println(optional1.orElse(test()));
        System.out.println(optional1.orElseGet(() -> test()));

        System.out.println();

        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional2.orElse(test()));
        System.out.println(optional2.orElseGet(() -> test()));
        System.out.println();
    }
    private static String test(){
        System.out.println("sout test");
        return "test";
    }

}
