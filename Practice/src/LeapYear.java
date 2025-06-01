package src;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
