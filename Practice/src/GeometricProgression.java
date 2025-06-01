package src;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        int r = 2;
        System.out.println(a*(int)Math.pow(r, n-1));
    }
}
