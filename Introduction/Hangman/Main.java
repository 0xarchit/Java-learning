package Hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String path = "Introduction/Hangman/words.txt";
        String word;
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Couldn't find file!");
        }
        catch (IOException e) {
            System.out.println("Something went wrong!");;
        }


        Random random = new Random();
        word = words.get(random.nextInt(words.size()));


        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrong = 0;
        for (int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("Welcome to Hangman!");
        while(wrong < 6){
            System.out.println(getHangmanArt(wrong));
            System.out.println("Chance remaining: " + (6 - wrong));

            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.print("Correct Guess\n");
                for (int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if (!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrong));
                    System.out.println("You won!");
                    System.out.println("The word was " + word);
                    break;

                }
            }else {
                System.out.println("Wrong guess");
                wrong++;
            }
        }
        if (wrong >= 6){
            System.out.println(getHangmanArt(wrong));
            System.out.println("Game Over");
            System.out.println("The word was " + word);
        }




        scanner.close();

    }
    static String getHangmanArt(int wrong){
        return switch (wrong){
          case 1 -> """
                   O
                   
                   
                  """;
          case 2 -> """
                   O
                   |
                   
                  """;
          case 3 -> """
                   O
                  /|
                   
                  """;
          case 4 -> """
                   O
                  /|\\
                   
                  """;
          case 5 -> """
                   O
                  /|\\
                  /
                  """;
          case 6 -> """
                   O
                  /|\\
                  /`\\
                  """;
          default -> "";
        };
    }
}
