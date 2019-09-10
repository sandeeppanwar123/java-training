package DS.MyDS;

import java.util.Deque;

/*
 *
 *
 *
 */
public class MyQueue<E>{

    private int front, rear , size;
    private Object[] arr;

    public MyQueue(int size) {
        this.size = size;
        arr = new Object[size];
        front = size -1;
        rear = front;
    }
    public boolean enqueue(E e)
    {
        if(!isFull()) {
            arr[rear] = e;
            rear = rear - 1;
        return true;
        }
        return false;
    }
    public boolean dequeue()
    {
        if(!isEmpty())
        {
            arr[front] = null;
            front = front - 1;
            return true;
        }
        return false;
    }

    public E peek()
    {
        if(!isEmpty()) {
            return (E) arr[front];
        }
        return null;
    }

    public boolean isEmpty()
    {
        if(front == -1)
        {
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if(rear == -1)
        {return true;}
        return false;
    }



}