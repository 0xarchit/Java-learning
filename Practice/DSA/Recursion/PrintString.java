package DSA.Recursion;
// https://www.geeksforgeeks.org/problems/print-gfg-n-times/1
public class PrintString {
    public static void main(String[] args) {
        arcPrint(10);
    }
    static void arcPrint(int n){
        if(n>=0){
            System.out.print("Arc ");
            arcPrint(n-1);
        }
    }
}
