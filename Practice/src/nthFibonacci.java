package src;

import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;

        if(n == 1){
            System.out.println(a);
        }else if(n == 2){
            System.out.println(b);
        }else{
            for(int i = 3; i <= n; i++){
                c = a+b;
                a = b;
                b = c;
            }
            System.out.print(b);
        }
    }
}
