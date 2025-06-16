package String;

public class WordCount {
    public static void main(String[] args){
        System.out.println(countWords("Hello World Of Java"));
    }
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        int len = 0;
        String[] words = str.split(" ");
        for(String word : words){
            len++;
        }
        return len;
    }
}
