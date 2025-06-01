package src;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n == 0){
            isPrime = false;
        }

        for(int i = 2; i * i <= n; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        System.out.println((isPrime) ? "True" : "False");
    }
}