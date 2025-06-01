package src;

import java.util.*;

public class NextPrimeNumber {
    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n+1; i <= 500; i++){
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
        }

    }
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}