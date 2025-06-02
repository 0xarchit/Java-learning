package src;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n);
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeFactors(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
    }
}
