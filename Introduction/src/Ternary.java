package src;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your score: ");
//        int score = sc.nextInt();
//        String chk = (score >= 60) ? "Pass" : "Fail";
//        System.out.println(chk);

        int num = sc.nextInt();
        System.out.print("Enter a number: ");
        String eveOdd = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(eveOdd);

    }
}
