package src;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter name to wish: ");
//        String name = scanner.next();
//
//        System.out.print("Enter number of times: ");
//        int times = scanner.nextInt();
//
//        happyBirthday(name, times);
        System.out.print("Enter Digit to Get: ");
        int number = scanner.nextInt();
        System.out.printf("Square is %.2f and cube is %.2f", square(number), cube(number));

    }
    static void happyBirthday(String name, int times){
        for(int i = 1; i <= times; i++) {
            System.out.printf("Happy Birthday To %s", name);
        }
    }
    static double square(int digit){
        return digit * digit;
    }
    static double cube(int digit){
        return digit * digit * digit;
    }

}
