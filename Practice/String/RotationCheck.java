package String;

public class RotationCheck {
    public static void main(String[] args){
        System.out.println(areRotations("abcd", "cdab"));
        System.out.println(areRotations("abcd", "adbc"));

        System.out.println(areRotations2("abcd", "cdab"));
        System.out.println(areRotations2("abcd", "adbc"));
    }
    static boolean areRotations(String s1, String s2) {

        if(s1.length() != s2.length()) return false;
        String comb = s1.concat(s1);
        return comb.contains(s2);
    }

    static boolean areRotations2(String s1, String s2){
        int n = s1.length();

        for(int i = 0; i<n; i++){
            if(s1.equals(s2)){
                return true;
            }
            char last = s1.charAt(n - 1);
            s1 = last + s1.substring(0, n-1);
        }
        return false;
    }
}
