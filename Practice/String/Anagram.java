package String;

//import java.util.Arrays;
//
public class Anagram {
    public static void main(String[] args){
        System.out.println(isAnagram("Archit", "Rachit"));
    }
//    static boolean isAnagram(String s1, String s2){
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//        if(s1.length() != s2.length()){
//            return false;
//        }
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//
//        return Arrays.equals(c1, c2);
//    }

// new method

    public static boolean isAnagram(String s1, String s2) {
        // code here
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int xor = 0;

        if(c1.length != c2.length){
            return false;
        }
        for(char c : c1){
            xor ^= c;
        }
        for(char c : c2){
            xor ^= c;
        }
        return xor == 0;
    }

}