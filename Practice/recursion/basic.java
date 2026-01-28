package recursion;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        one2ten(1);
        ten2one(1);
        System.out.println();
        System.out.println(sum(5));
        System.out.println(fact(5));
        System.out.println(sumOfDigits(145));
        System.out.println(cntDigit(12345));
        System.out.println(evenDigitSum(12345));
        System.out.println(sumArray(new int[] {1,2,3,4,5,6}, 0));
        System.out.println(fib(7));
        System.out.println(pow(3, 4));
        System.out.println(powOf2(1));
        reverseStr("0xarc", 0);
        System.out.println();
        System.out.println(subsets(new int[] {1,2,3}, 0));
        subsetString("abcd", 0, "");
        subsetsArray(new int[] {1,2,3,4}, 0, new ArrayList<>());
    }
    static void one2ten(int n){
        if(n==11) return;
        System.out.print(n + " ");
        one2ten(n+1);
    }
    static void ten2one(int n){
        if(n==11) return;
        ten2one(n+1);
        System.out.print(n + " ");
    }
    static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    static int sumOfDigits(int n){
        if(n==0) return 0;
        return n%10+sumOfDigits(n/10);
    }
    static int cntDigit(int n){
        if(n==0) return 0;
        return 1+cntDigit(n/10);
    }
    static int evenDigitSum(int n){
        if(n==0) return 0;
        int last = n%10;
        if(last%2==0) return last+evenDigitSum(n/10);
        return evenDigitSum(n / 10);
    }
    static int sumArray(int[] arr, int idx){
        if(idx == arr.length) return 0;
        return arr[idx]+sumArray(arr, idx +1);
    }
    static int fib(int n){
        if(n == 0 || n == 1) return n;
        return fib(n-1)+fib(n-2);
    }
    static int pow(int a, int b){
        if(b==0) return 1;
        return a*pow(a, b-1);
    }
    static boolean powOf2(int n){
        if(n==0) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        return powOf2(n/2);
    }
    static void reverseStr(String s, int idx){
        if(idx==s.length()) return;
        reverseStr(s,idx+1);
        System.out.print(s.charAt(idx));
    }
    static int subsets(int[] arr, int idx){
        if(idx == arr.length) return 1;
        int take = subsets(arr, idx+1);
        int notTake = subsets(arr, idx+1);
        return take+notTake;
    }
    static void subsetsArray(int[] arr, int idx, ArrayList<Integer> list){
        if(idx == arr.length){
            System.out.print(list + " | ");
            return;
        }
        list.add(arr[idx]);
        subsetsArray(arr, idx+1, list);
        list.removeLast();
        subsetsArray(arr, idx+1, list);
    }
    static void subsetString(String str, int idx, String tmp){
        if(idx == str.length()){
            System.out.println(tmp);
            return;
        }
        subsetString(str, idx+1, tmp+str.charAt(idx));
        subsetString(str, idx+1, tmp);
    }
}
