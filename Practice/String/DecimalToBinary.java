package String;

public class DecimalToBinary {
    public static void main(String[] args){
        d2s(10);
    }
    static void d2s(int n){
        String s = "";

        while(n>0) {
            s = (n%2) + s;
            n =n/2;
        }
        System.out.println(s);
    }
}
