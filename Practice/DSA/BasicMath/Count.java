package DSA.BasicMath;

// https://www.geeksforgeeks.org/problems/count-digits5716/1

public class Count {
    public static void main(String[] args) {
//        int n = 43;
//        int n = 12;
        int n = 20;
        int cnt = 0;
        int org = n;
        while(n>0){
            int digit = n%10;
            if(digit>0){
                if(org%digit == 0) cnt++;
            }
            n /= 10;
        }
        System.out.println(cnt);
    }
}
