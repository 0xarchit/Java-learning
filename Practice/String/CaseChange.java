package String;

public class CaseChange {
    public static void main(String[] args){
        changeCase("hello");
    }
    public static void changeCase(String s) {
        // code here
        char[] c = s.toCharArray();
        String firstStr = s.substring(0, 1).toUpperCase() + s.substring(1);
        String WholeStr = "";


        for(int i = 0; i < c.length; i++){
            WholeStr += Character.toUpperCase(c[i]);
        }
        System.out.println(firstStr);
        System.out.println(WholeStr);
    }
}
