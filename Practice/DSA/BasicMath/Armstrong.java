package DSA.BasicMath;

// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

public class Armstrong {
    public static void main(String[] args) {
//        int n = 153;
        int n = 123;
        int org = n;
        int len = (int) Math.log10(n) + 1;
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            n /= 10;
            sum += Math.pow(digit, len);
        }
        System.out.println(sum==org);
    }
}
