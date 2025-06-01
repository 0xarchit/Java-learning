package src;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int m = Math.min(a, b);
        int d = 0;
        for(int i = 1; i <= m; i++){
            if(a%i == 0 && b%i ==0){
                d = i;
            }
        }
        System.out.println(d);
    }
}
