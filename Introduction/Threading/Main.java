package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // threading allow program to run multiple task simultaneously

        // 1. extend thread class 2. implement runnable interface

        Scanner scanner = new Scanner(System.in);

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 second to answer this question!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}
