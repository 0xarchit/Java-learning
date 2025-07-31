package pattern2;

public class starRectangle {
    public static void main(String[] args) {
        int n= 3;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    /*
    public class Solution {
    public static void nNumberTriangle(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n-i+1; j++){
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
     */