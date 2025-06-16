package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder st = new StringBuilder(sc.next());
        System.out.println(st.reverse());

        System.out.println("2nd Methods String");
        System.out.println(reverseString(sc.next()));
    }
// other method
    public static String reverseString(String s) {
        int n = s.length()-1;
        String str = "";

        for(int i = n; i>=0; i--){
            str += s.charAt(i);
        }
        return str;
    }
}
