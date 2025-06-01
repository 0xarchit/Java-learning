package src;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int p = a * b;
        int m = Math.max(a, b);
        int c = m;

        for(int i = m; i<p; i++){
            if(i%a == 0 && i%b == 0){
                c = i;
                break;
            }
        }
        System.out.println(c);
    }
}
