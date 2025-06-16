package String;


import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(b2d(sc.next()));
    }
    static int b2d(String s){
        return Integer.parseInt(s, 2);
    }
}
