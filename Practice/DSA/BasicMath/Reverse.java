package DSA.BasicMath;

// https://leetcode.com/problems/reverse-integer/description/
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));

    }
    public static int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev = rev*10+digit;
        }
        return rev;
    }
}
