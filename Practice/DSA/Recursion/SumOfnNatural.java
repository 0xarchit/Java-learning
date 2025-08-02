package DSA.Recursion;
// https://www.geeksforgeeks.org/problems/sum-of-series2811/1
public class SumOfnNatural {
    public static void main(String[] args) {
        System.out.println(prnt(12));
    }
    static int prnt(int n){
        if(n == 0) return 0;
        return n + prnt(n-1);
    }
}
