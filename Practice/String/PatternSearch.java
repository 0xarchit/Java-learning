package String;


public class PatternSearch {
    public static void main(String[] args){
        String str = "home sweet home";
        String pat = "home";
        search(str, pat);
    }
    static void search(String str, String pat){
        int pos = str.indexOf(pat);
        while(pos >= 0){
            System.out.print(pos + " ");
            pos = str.indexOf(pat, pos+1);
        }
    }
}
