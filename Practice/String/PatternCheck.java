package String;

public class PatternCheck {
    public static void main(String[] args){
        System.out.println(follPatt("xyxyxy"));
        System.out.println(follPatt("xxxy"));
        System.out.println(follPatt("xxxyyyxxyyxy"));
        System.out.println(follPatt("xxyxyy"));
    }
    static int follPatt(String s) {
        int x = 0;
        int y = 0;
        boolean seenY = false;

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'x'){
                if(seenY && y!=x) return 0;
                x++;
                seenY = false;
            }else if(s.charAt(i) == 'y'){
                y++;
                seenY = true;
            }
        }
        return (x == y) ? 1 : 0;
    }
}
