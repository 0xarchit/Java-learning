package PracticePrograms;

import java.util.Scanner;

public class BankNew {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;
    public static void main(String[] args){

        boolean run = true;
        int choice;
        double deposit = 0;
        while(run) {
            System.out.print("""
                    \n***************
                    BANKING PROGRAM
                    ***************
                    1. Show Balance
                    2. Deposit
                    3. Withdraw
                    4. Exit
                    ***************
                    Enter your choice (1-4):""");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    balance += deposit();
                    System.out.print("New Balance: ₹" + balance);
                }
                case 3 -> {
                    balance -= withdraw();
                    System.out.print("New Balance: ₹" + balance);
                }
                case 4 -> run = false;
                default -> System.out.print("Invalid Choice");
            }
        }
    }

    static void showBalance(double balance){
        System.out.printf("₹%.2f\n", balance);
    }

    static double deposit(){
        double amount;
        System.out.print("Enter deposit amount: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.print("Invalid amount\n");
            return 0;
        }else {
            return amount;
        }
    }

    static double withdraw(){
        double amount;
        System.out.print("Enter Withdraw amount: ");
        amount = scanner.nextDouble();

        if(amount > 0 && amount <= balance){
            return amount;
        }else{
            System.out.print("invalid amount\n");
            return 0;
        }
    }


}
