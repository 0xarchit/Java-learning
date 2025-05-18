package PracticePrograms;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"r", "p", "s"};
        String play = "y";

        do {
            System.out.print("Rock Paper or Scissors? (r,p,s): ");
            String choice = scanner.nextLine().toLowerCase();

            if(!choice.equals("r") && !choice.equals("p") && !choice.equals("s")){
                System.out.println("Invalid choice");
                continue;
            }
            String system = choices[rand.nextInt(choices.length)];
            System.out.printf("Your Choice: %s\nSystem choice: %s", choice, system);
            if(choice.equals(system)){
                System.out.println("\nTie!");
            } else if (choice.equals("r") && system.equals("s") ||
                    choice.equals("p") && system.equals("r") ||
                    choice.equals("s") && system.equals("p")) {
                System.out.println("\nYou win!");
            }else{
                System.out.println("\nYou lose!");
            }
            System.out.print("play again? (y/n): ");
            play = scanner.nextLine().toLowerCase();
        }while(play.equals("y"));

        System.out.println("Thanks for playing");

        scanner.close();


    }
}
