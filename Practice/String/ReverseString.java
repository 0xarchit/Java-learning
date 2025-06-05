package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder st = new StringBuilder(sc.next());
        System.out.println(st.reverse());
    }
}
