package DSA.Recursion;
// https://leetcode.com/problems/fibonacci-number/description/
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        if (n>=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
