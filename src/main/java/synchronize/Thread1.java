package synchronize;

public class Thread1 implements Runnable {

    SharedObject sharedObject;
    public Thread1(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        try {
            sharedObject.process(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
