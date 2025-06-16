package String;

public class VowelConsonants {
    public static void main(String[] args){
        checkString("qwertyuiop");
        checkString("aaaa");
        checkString("abab");
        checkString("a a a a b b b b");
    }
    static void checkString(String s) {
        int v = 0;
        int c = 0;
        String vow = "aeiou";
        for(char chr : s.toCharArray()){
            if(vow.indexOf(chr) != -1){
                v++;
            }else if(chr >= 'a' && chr <= 'z'){
                c++;
            }
        }

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
}
