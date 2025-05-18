package PracticePrograms;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice = 0;
        int total = 0;
        System.out.print("Enter number of dice: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                die(roll);
                System.out.println("""
⬛️⬜️⬛️
⬜️⬜️⬜️
⬛️⬜️⬛️
                        """);
                total += roll;
            }
            System.out.println("Total: " + total);
        }else {
            System.out.print("invalid choice");
        }
    }
    static void die(int roll){
        switch (roll){
            case 1 -> System.out.println("""
⬜️⬜️⬜️⬜️⬜️
⬜️⬜️⬜️⬜️⬜️
⬜️⬜️⬛️⬜️⬜️
⬜️⬜️⬜️⬜️⬜️
⬜️⬜️⬜️⬜️⬜️
                    """);
            case 2 -> System.out.println("""
⬜️⬜️⬜️⬜️⬜️
⬜️⬛️⬜️⬜️⬜️
⬜️⬜️⬜️⬜️⬜️
⬜️⬜️⬜️⬛️⬜️
⬜️⬜️⬜️⬜️⬜️
                    """);
            case 3 -> System.out.println("""
⬜️⬜️⬜️⬜️⬜️
⬜️⬛️⬜️⬜️⬜️
⬜️⬜️⬜️⬛️⬜️
⬜️⬛️⬜️⬜️⬜️
⬜️⬜️⬜️⬜️⬜️
                    """);
            case 4 -> System.out.println("""
⬜️⬜️⬜️⬜️⬜️
⬜️⬛️⬜️⬛️⬜️
⬜️⬜️⬜️⬜️⬜️
⬜️⬛️⬜️⬛️⬜️
⬜️⬜️⬜️⬜️⬜️
                    """);
            case 5 -> System.out.println("""
⬜️⬜️⬜️⬜️⬜️
⬜️⬛️⬜️⬛️⬜️
⬜️⬜️⬛️⬜️⬜️
⬜️⬛️⬜️⬛️⬜️
⬜️⬜️⬜️⬜️⬜️
                    """);
            case 6 -> System.out.println("""
⬜️⬜️⬜️⬜️⬜️
⬜️⬛️⬜️⬛️⬜️
⬜️⬛️⬜️⬛️⬜️
⬜️⬛️⬜️⬛️⬜️
⬜️⬜️⬜️⬜️⬜️
                    """);
        }
    }
}
