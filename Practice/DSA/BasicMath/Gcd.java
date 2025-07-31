package DSA.BasicMath;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(20, 40));
    }
    static int gcd(int a, int b){
        // bruteforce
        /* int gcd = 0;
        for(int i = 1; i <= Math.min(a, b); i++){
            if(a%i == 0 && b%i == 0) gcd = i;
        }
        return gcd; */

        // Euclidean algo
        /* while(a>0 && b>0){
            if(a>b) a %= b;
            else b %= a;
        }
        return (a == 0) ? b : a; */

        // Euclidean algo with recursion
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
