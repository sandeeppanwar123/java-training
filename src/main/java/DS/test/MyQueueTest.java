package DS.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueueTest {

    public static void main(String[] args) {
        Deque<String> deque =  new ArrayDeque<String>();

        deque.add("s");
        deque.add("d");
        deque.addFirst("k");
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());
        System.out.println("Element: " + deque.element());
        System.out.println("Peak: " + deque.peek());
        deque.remove();
        System.out.println("Peak: " + deque);


    }
}
