package PracticePrograms;
import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter Length: ");
        double length = scanner.nextDouble();

        double area = width * length;
        System.out.println("Area of Rectangle is: " + area + "cm²");
    }
}
