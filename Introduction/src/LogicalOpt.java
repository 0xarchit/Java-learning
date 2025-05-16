package src;
import java.util.Scanner;

public class LogicalOpt {
    public static void main(String [] args){
        // &&, ||, !

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Temperature (℃)");
        double temp = scanner.nextDouble();
        System.out.println(("Enter Sunny: "));
        boolean isSunny = scanner.nextBoolean();

        if(temp <= 40 && temp >= 0 && isSunny){
            System.out.println("Better Weather");
        } else{
            System.out.println("Wew");
        }
    }
}