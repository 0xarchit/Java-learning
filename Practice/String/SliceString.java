package String;

public class SliceString {
    public static void main(String[] args){
        System.out.println(sliceString("Hello"));
    }
    public static String sliceString(String s) {

        String fresh = "";
        char[] str = s.toCharArray();

        for(int i = 1; i < str.length -1; i++){
            fresh += str[i];
        }
        return fresh;
    }
}
