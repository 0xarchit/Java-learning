package Threading.Multi;

public class Main {
    public static void main(String[] args){
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        Thread thread3 = new Thread(new MyRunnable());
        Thread thread4 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
