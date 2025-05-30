package Timertasks;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter timer value in seconds: ");
        int inp = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int cnt = inp;

            @Override
            public void run() {
                System.out.println(cnt);
                cnt--;
                if (cnt <= 0){
                    System.out.println("Times up");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
