package practice;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for(int i = 0; i<10; i++) {
            double random = Math.random() * 100;
            int num = (int) random;
            System.out.printf("num = %s%n", num);
            hashSet.add(num);
            treeSet.add(num);
            linkedHashSet.add(num);
        }

        System.out.println("hashSet = " + hashSet);
        System.out.println("treeSet = " + treeSet);
        System.out.println("linkedHashSet = " + linkedHashSet);
    }
}
