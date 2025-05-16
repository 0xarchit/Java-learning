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

        scanner.close();
    }
}
