package Miscellaneous;
import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");
        }
}

// testcase:
/*
case 1:
hello 0
hackerrank 65
java 10
out 1:
================================
java           100
cpp            065
python         050
================================

case 2:
java 100
cpp 65
python 50
out 2:
================================
hello          000
hackerrank     065
java           010
================================
*/