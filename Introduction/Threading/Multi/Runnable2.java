package Threading.Multi;

public class Runnable2 implements Runnable{
    private final String text;
    private final Integer duration;

    Runnable2(String text, int duration){
        this.text = text;
        this.duration = duration;
    }
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(duration);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}