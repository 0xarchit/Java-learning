package Timertasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int cnt = 3;
            @Override
            public void run() {
                System.out.println("Task!");
                cnt--;
                if(cnt <= 0){
                    System.out.println("Task Complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);
    }
}
