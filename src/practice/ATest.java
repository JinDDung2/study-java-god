package practice;

import practice.week.Item;

import java.util.ArrayList;
import java.util.List;

public class ATest {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3};
        int[] arr2 = new int[3];
        int idx = 1;
        System.arraycopy(arr, idx+1, arr2, idx, arr.length-2);
        for (int i =0; i<arr2.length; i++) {
            System.out.println(i + " = " + arr2[i]);
        }

        List<Integer> lst = new ArrayList<>();
        for (int i =0; i<10; i++) {
            lst.add(i*2);
        }

        System.out.println("lst = " + lst);
        lst.remove(5);
        System.out.println("lst = " + lst);

        List<Item> items = new ArrayList<>();
        items.add(new Item(10000));
        items.add(new Item(20000));
        items.add(new Item(30000));
        int sum = items.stream().mapToInt(Item::getPrice).sum();
        System.out.println("sum = " + sum);
    }
}
