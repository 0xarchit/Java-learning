package src;
import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isFemale;
        double price = 999;

        System.out.print("Are You A Student? (true/false): ");
        isStudent = scanner.nextBoolean();
        System.out.print("Are You A Female? (true/false): ");
        isFemale = scanner.nextBoolean();

        if(isStudent){
            if(isFemale) {
                System.out.println("You get 20% off for student");
                System.out.println("You get 10% off for female");
                price *= 0.7;
            }else{
                System.out.println("You get 10% off");
                price *= 0.9;
            }
        }else if (isFemale) {
            System.out.println("You get 10% off for female");
            price *= 0.9;
        }
        else{
            System.out.println("No discount for you");
            price *= 1;
        }

        System.out.printf("Final price: ₹%.2f", price);
    }
}
