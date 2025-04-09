package src;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        System.out.println("Learning Input");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine(); //also use next for first word only

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent){
            System.out.println("You are enrolled");
        }
        else{
            System.out.println("Not enrolled");
        }

        System.out.println("Hello " + name + " Age: " + age + " with Cgpa: " + cgpa);

        scanner.close();


    }
}
// 42:31