package PracticePrograms;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter temperature: ");
        temp = sc.nextDouble();

        System.out.print("convert to? (C or F): ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) * 32;

        System.out.printf("%.1f°%s", newTemp, unit);

        sc.close();
    }
}
