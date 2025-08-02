package DSA.Recursion;
// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class one2n {
    public static void main(String[] args) {
        prnt(10);
    }
    static void prnt(int n){
        if(n==0) return;
        prnt(n-1);
        System.out.print(n + " ");
    }
}
