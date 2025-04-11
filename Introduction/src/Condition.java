package src;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        if(age > 18){
            System.out.println("Over 18");
        } else if (age == 18) {
            System.out.println("Exact 18");
        } else if (age < 0) {
            System.out.println("Invalid");
        } else{
            System.out.println("Under 18");
        }
    }
}
