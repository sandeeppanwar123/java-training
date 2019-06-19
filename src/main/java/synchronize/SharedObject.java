package synchronize;

public class SharedObject {

////synchronize the method
//    synchronized public  void process(int n) throws InterruptedException {
//        for(int i = 1; i<=5; i++)
//        {
//            System.out.println(i*n);
//            Thread.sleep(400);
//        }
//    }

    //static synchronize the method
    synchronized public static  void process(int n) throws InterruptedException {
        for(int i = 1; i<=5; i++)
        {
            System.out.println(i*n);
            Thread.sleep(400);
        }
    }
//    //synchronize block
//     public  void process(int n) throws InterruptedException {
//        synchronized (this) {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(i * n);
//                Thread.sleep(400);
//            }
//        }
//    }
}
