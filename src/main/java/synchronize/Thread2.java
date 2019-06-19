package synchronize;

public class Thread2 implements Runnable {

    SharedObject sharedObject;
    public Thread2(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        try {
            sharedObject.process(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }





    }


