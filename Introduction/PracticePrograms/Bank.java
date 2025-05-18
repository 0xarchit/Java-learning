package PracticePrograms;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        double balance = 0;
        double deposit = 0;
        double withdraw = 0;

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.println("""
                    ***************
                    BANKING PROGRAM
                    ***************
                    1. Show Balance
                    2. Deposit
                    3. Withdraw
                    4. Exit
                    ***************
                    Enter your choice (1-4):
                    """);
            String inp = scanner.next();
            switch (inp){
                case "1" -> System.out.print("Your Balance is: ₹" + balance);
                case "2" -> {
                    System.out.print("Enter amount to deposit: ");
                    deposit = scanner.nextDouble();
                    if(deposit > 0){
                        balance += deposit;
                        System.out.println("Your New Balance: ₹" + balance);
                    }else {
                        System.out.print("Invalid Amount to Deposit!");
                    }
                }
                case "3" -> {
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = scanner.nextDouble();
                    if(withdraw > 0 && withdraw <= balance){
                        balance -= withdraw;
                        System.out.println("Your New Balance: ₹" + balance);
                    }else {
                        System.out.print("Insufficient amount");
                    }
                }
                case "4" -> {
                    System.out.print("Exiting");
                    run = false;
                }
                default -> System.out.print("invalid");
            }
        }
    }
}
