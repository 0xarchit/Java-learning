package String;

public class StringLength {
    public static void main(String[] args){
        System.out.println(lengthString("Hello"));
    }
    public static int lengthString(String str) {
        // find the length of string
        int length = 0;
        for(char c:str.toCharArray()){
            length++;
        }
        return length;
    }
}
