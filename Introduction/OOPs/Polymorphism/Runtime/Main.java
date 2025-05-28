package OOPs.Polymorphism.Runtime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("1. Cat or 2. Dog? ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Cat();
            animal.speak();
        } else if (choice == 2) {
            animal = new Dog();
            animal.speak();
        }else{
            System.out.println("Invalid Choice");
        }


    }
}
