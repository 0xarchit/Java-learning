//package String;
//
//import java.util.Arrays;
//
//public class ExtraChar {
//    public static void main(String[] args){
//        String s1 = "abcd";
//        String s2 = "abcde";
//
//        System.out.println(findExtra(s1, s2));
//
//    }
//    static char findExtra(String s1, String s2){
//        char[] a1 = s1.toCharArray();
//        char[] a2 = s2.toCharArray();
//
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//
//        for(int i = 0; i < a1.length; i++){
//            if(a1[i] != a2[i]){
//                return a2[i];
//            }
//        }
//        return a2[a1.length];
//    }
//}

//method 2

package String;
public class ExtraChar{
    public static void main(String[] args){
        System.out.println(extraChar("efg", "gtef"));
    }
    public static char extraChar(String s1, String s2) {
        char result = 0;
        for(char c : s1.toCharArray()){
            result ^= c;
        }
        for(char c : s2.toCharArray()){
            result ^= c;
        }
        return result;
    }
}