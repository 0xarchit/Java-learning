package String;

public class AlphabetPrint {
    public static void main(String[] args) {
        alphabets('a', 's');
    }
    public static void alphabets(char c1, char c2) {
        for(int i = (int) c1; i <= (int) c2; i++){
            char val = (char) i;
            System.out.print(val + " ");
        }
    }
}
