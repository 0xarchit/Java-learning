package PracticePrograms;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char opt;
        double result;

        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter Operation to Perform (+,-,*,/,%): ");
        opt = scanner.next().charAt(0);

        switch (opt){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            default -> result = 0;
        }

        System.out.println("result: " + result);
        scanner.close();
    }
}
