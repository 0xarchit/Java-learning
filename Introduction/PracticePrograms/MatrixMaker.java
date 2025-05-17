package PracticePrograms;

import java.util.Scanner;

public class MatrixMaker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbols;

        System.out.print("Enter number of rows in matrix: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns in matrix: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol of which you want shape of matrix");
        symbols = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbols);
            }
            System.out.println();
        }
    }
}
