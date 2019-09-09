package data.structure.test;

import data.structure.MyQueue;

public class MyQueueTest {


    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue(4);

        myQueue.enqueue(4);
        myQueue.enqueue(2);
        myQueue.enqueue(6);
        myQueue.enqueue(9);

        for (int i = 0; i < 4; i++) {
        System.out.println("Initially peek is : "+myQueue.peek());
            System.out.println("Is Full ? " + myQueue.isFull());
            myQueue.dequeue();
            System.out.println("Is empty ? " + myQueue.isEmpty());
            System.out.println("After dequeue peek is : "+myQueue.peek());

        }


    }
}
