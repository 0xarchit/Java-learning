package Array;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class InpToArr {
    public static void main(String[] args){
//        foods[0] = "Pizza";
//        foods[1] = "Burger";
//        foods[2] = "Cold Drink";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of items you want to add: ");
        int num = scanner.nextInt();
        String[] foods = new String[num];
        for(int i = 0; i < num; i++){
            System.out.printf("Enter Item %d: ", i+1);
            String item = scanner.next();
            foods[i] = item;
        }
        System.out.println("Your Items are: ");
        for(String food : foods){
            System.out.print(food + " ");
            scanner.close();
        }
    }
}
