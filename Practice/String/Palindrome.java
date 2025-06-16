package String;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPal("TenEt"));
    }
    static boolean isPal(String s){
        s = s.toLowerCase();
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
