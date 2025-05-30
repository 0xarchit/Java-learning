package Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // enums = enumerations a special kind of class that represents a fixed
        // of constants.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String inp = scanner.nextLine().toUpperCase();

//        System.out.println(day);
//        System.out.println(day.getDayNumber());

        try{
            Day day = Day.valueOf(inp);
            switch (day){
                case MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY -> System.out.println("Weekday");
                case SATURDAY, SUNDAY -> System.out.println("Weekend");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid day");
        } catch (Exception e) {
            System.out.println("Unknown error");
        }

        scanner.close();
    }
}
