package src;
import java.util.*;

public class DigitCount {
    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        while(a != 0){
            a /= 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}