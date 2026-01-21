package recursion;

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
        if(idx ==arr.length) return 0;
        return arr[idx]+sumArray(arr, idx +1);
    }
    static int fib(int n){
        if(n==0 || n == 1) return n;
        return fib(n-1)+fib(n-2);
    }
}
