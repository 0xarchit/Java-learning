package src;
import java.util.Scanner;

public class While {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String name = "";
        while(name.isEmpty()){
            System.out.print("Enter Name: ");
            name = scanner.nextLine();
        }

        System.out.println("Name: " + name);


        int number = 0;
        do{
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            System.out.println("number: " + number);
        } while(number < 1 || number > 100);

        scanner.close();
    }
}
