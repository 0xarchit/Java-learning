package Threading.Multi;

public class PinPong {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable2("Ping", 1000));
        Thread thread2 = new Thread(new Runnable2("Pong", 1000));

        System.out.println("Start");
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("Finish");
    }
}
