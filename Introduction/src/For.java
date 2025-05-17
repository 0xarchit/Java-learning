package src;

import java.util.Scanner;

public class For {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 11; i++){
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 10; i+=3){
//            System.out.println(i);
//        }
//        for (int i = 10; i > 0; i -= 3){
//            System.out.println(i);
//        }

        System.out.print("Enter Loops: ");
        int max = scanner.nextInt();

        for(int i = 0; i <= max; i ++){
            System.out.println(i);
        }

        scanner.close();
    }
}
