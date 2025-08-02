package DSA.Recursion;
// https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
public class n2one {
    public static void main(String[] args) {
        prnt(10);
    }
    static void prnt(int n){
        if(n==0) return;
        System.out.print(n + " ");
        prnt(n-1);
    }
}
