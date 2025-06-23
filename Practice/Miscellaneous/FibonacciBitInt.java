package Miscellaneous;
import java.math.BigInteger;

public class FibonacciBitInt {
    public static void main(String[] args){
        System.out.println(fib(30));
    }
    public static BigInteger fib(int n) {
        BigInteger n1 = BigInteger.ONE;
        BigInteger n2 = BigInteger.ONE;

        if(n == 1 || n == 2) return BigInteger.ONE;

        for(int i = 3; i <= n; i++){
            BigInteger n3 = n2.add(n1);
            n1 = n2;
            n2 = n3;
        }

        return n2;
    }
}
