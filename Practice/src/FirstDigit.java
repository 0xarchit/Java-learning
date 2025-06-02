package src;

import java.util.Scanner;

public class FirstDigit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if(n < 0){
                n = -n;
            }else if(n == 0){
                System.out.println(0);
            }
            while(n >= 10){
                n /= 10;
            }
            System.out.println(n);
        }
}
