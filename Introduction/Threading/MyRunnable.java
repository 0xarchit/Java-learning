package Threading;

public class MyRunnable implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            if (i == 5){
                System.out.println("Time's Up!");
                System.exit(0);
            }
        }
    }
}
