package String;

public class EqualityCheck {
    public static void main(String[] args){
        System.out.println(countChars("madame", "madam"));
    }
    static int countChars(String s1, String s2) {
        int[] freq = new int[26];

        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            freq[c-'a']--;
        }

        int totalDel = 0;

        for(int cnt : freq){
            totalDel += Math.abs(cnt);
        }
        return totalDel;
    }
}
