package DSA.BasicMath;

// https://www.geeksforgeeks.org/problems/prime-number2314/1

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(99));
        System.out.println(isPrime(13));
    }
    static boolean isPrime(int n){
        if (n == 0 || n == 1) return false;

        int cnt = 0;

        for(int i = 1; i * i <= n; i++){
            if(n%i == 0){
                cnt++;
                if(n/i != i) cnt++;
            }
        }

        return cnt <= 2;
    }
}
