package Miscellaneous;

import java.util.ArrayList;

import java.util.ArrayList;

public class numberToList {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        int n = 987654321;
        int len = (int) Math.log10(n) + 1;

        while (len > 0) {
            int pow = (int) Math.pow(10, len - 1);
            int d = n / pow;
            lst.add(d);
            n = n % pow;
            len--;
        }

        System.out.println(lst);
    }
}
