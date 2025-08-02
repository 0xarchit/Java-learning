package DSA.Recursion;
// https://leetcode.com/problems/valid-palindrome/
public class palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
    }
}
