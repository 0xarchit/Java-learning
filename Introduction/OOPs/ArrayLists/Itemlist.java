package OOPs.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Itemlist {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        boolean isContinue = true;

        while (isContinue){
            System.out.println("Enter\n1 to add item\n2 to see list\n0 to exit\nyour choice: ");
            int inp = scanner.nextInt();
            switch (inp){
                case 1 -> {
                    System.out.print("Enter Item To Add: ");
                    String item = scanner.next();
                    list.add(item);
                }
                case 2 -> {
                    if (!list.isEmpty()){
                    for(String i : list){
                        System.out.printf("%d. %s\n", list.indexOf(i) + 1, i);
                    }
                    }else {
                        System.out.println("List is empty");
                    }
                }
                case 0 -> isContinue = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        scanner.close();
    }
}
