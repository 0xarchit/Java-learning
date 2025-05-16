package src;
import java.util.Scanner;

public class Switch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day: ");
        String day = sc.nextLine();
        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Not a standard day");
        }
    }
}