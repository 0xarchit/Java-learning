package src;

import java.util.Scanner;

public class SumOfFirstNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println((n/2) * (n+1));
        }else{
            System.out.println(n * (n+1)/2);
        }
    }
}
