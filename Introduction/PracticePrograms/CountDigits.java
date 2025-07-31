package PracticePrograms;

public class CountDigits {
    public static void main(String[] args) {
        int n = 21783;
        int cnt = (int) Math.log10(n) + 1;
        System.out.println(cnt);
        cnt(n);
    }

    static void cnt(int n){
        int digit = 0;
        int cnt = 0;
        while(n>0){
//            digit = n % 10; // extract number
            cnt++;
            n /= 10;
        }
        System.out.println(cnt);
    }
}

// or
