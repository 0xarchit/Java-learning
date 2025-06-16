package String;

public class Pangram {
    public static void main(String[] args){
        System.out.println(isPangram("Hello"));
        System.out.println(isPangram("Thequickbrownfoxjumpsoverthelazydog"));
    }
    static boolean isPangram(String s){
        boolean[] alpha = new boolean[26];
        s = s.toLowerCase();
        int cnt = 0;

        for(char c : s.toCharArray()){
            if(c>='a' && c <= 'z'){
                int index = c - 'a';
                if(!alpha[index]){
                    alpha[index] = true;
                    cnt++;
                }
            }
        }
        return cnt == 26;
    }
}
