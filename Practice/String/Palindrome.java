package String;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPal("nitin"));
    }
    static boolean isPal(String s){
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
