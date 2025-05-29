package OOPs.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // exception handling => try, catch, finally
        // finally always executes, ensure automatic resource clean up

//        try{
//            System.out.println(1/0);
//        }catch (ArithmeticException e){
//            System.out.println("No division with zero");
//        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.print(num);
        } catch (InputMismatchException e){
            System.out.println("Not a Number");
        } catch (Exception e){
            System.out.println("Somthing went wrong\n" + e);
        } finally {
            System.out.println("Program completes but has some problem!");
        }



        scanner.close();

    }
}
