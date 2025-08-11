package Miscellaneous;

public class PowerOf2 {
    public static void main(String[] args) {
//        int n = 16;
        int n = 536870912;
        int r = 0;
        if (n <= 0) System.out.println(false);
        while (n > 1) {
            r = n % 2;
            if (r == 0) {
                n = n >> 1;
            }else System.out.println(false);
        }
        System.out.println(true);
        System.out.println(method2(n));
        System.out.println(method3(n));
        System.out.println(method4(n));
    }

    static boolean method2(int n){
        if(n<=0) return false;
        return ((n&(n-1)) == 0);
    }

    static boolean method3(int n){
        double k = Math.log(n)/Math.log(2);
        k *= 10;
        return (k%10 == 0);
    }
    static boolean method4(int n){
        double k = Math.log(n)/Math.log(2);
        return Math.pow(2, Math.round(k)) == n;
    }
}