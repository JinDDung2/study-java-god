package algorithm;

import java.util.*;

public class Main {
    public void testList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("list.get(0) = " + list.get(0));
        list.remove(list.size()-1);
        System.out.println("list = " + list);
        System.out.println("list.indexOf(1) = " + list.indexOf(20)); // value에 대한 index
        System.out.println("list.contains(20) = " + list.contains(30)); // 값이 있는지 check
    }

    public void testSet() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println("set = " + set);
        System.out.println("set.contains(20) = " + set.contains(20));
        set.remove(30);
        System.out.println("set.contains(30) = " + set.contains(30));
    }

    public void testDeque() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.add(20);
        deque.add(30);
        System.out.println("deque = " + deque);
        System.out.println("deque.peek() = " + deque.peek()); // 없으면 null
        System.out.println("deque.peekLast() = " + deque.peekLast());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque = " + deque);
    }

    public void testPriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 역순
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(50);
        priorityQueue.add(15);
        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("priorityQueue.peek() = " + priorityQueue.peek());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue = " + priorityQueue);
    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.testList();
//        main.testSet();
        main.testDeque();
//        main.testPriorityQueue();
    }
}
