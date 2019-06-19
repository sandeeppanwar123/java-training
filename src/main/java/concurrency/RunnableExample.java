package concurrency;


public class RunnableExample implements Runnable {


    public static void main(String[] args) {
        RunnableExample runnableExample = new RunnableExample();
        Thread thread = new Thread(runnableExample);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("I am in thread");
    }
}
