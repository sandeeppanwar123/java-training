package synchronize;

public class ThreadExecute {
    public static void main(String[] args) {
        SharedObject sharedObject1 = new SharedObject();
        SharedObject sharedObject2 = new SharedObject();

        Thread1 thread1 = new Thread1(sharedObject1);
        Thread2 thread2 = new Thread2(sharedObject2);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();


    }
}
