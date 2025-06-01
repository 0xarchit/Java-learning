package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.abs(sc.nextInt()%10));
    }
}
