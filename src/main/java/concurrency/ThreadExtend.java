package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExtend extends Thread {
String shared;
static int count = 0;

    public static void main(String[] args)  {
        Thread thread=  new Thread();
        ExecutorService executorService =  Executors.newFixedThreadPool(5);
        for(int i=0; i<5; i++) {
            executorService.execute(new ThreadExtend());

        }
        executorService.shutdown();



    }


    @Override
    public void run() {

         shared = Thread.currentThread().getName();
            System.out.println("Hello, shared object has name "+shared);
        count++;
        System.out.println(count);



    }
}

