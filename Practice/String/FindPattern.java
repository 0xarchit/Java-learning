package String;

public class FindPattern {
    public static void main(String[] args){
        System.out.println(pat("Hello", "llo"));
    }
    static int pat(String s, String p){
        return s.indexOf(p);
    }
}
