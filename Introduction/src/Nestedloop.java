package src;

public class Nestedloop {
    public static void main(String[] args){
        int max = 9;
        for(int i = 1; i <= 9; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.print(j + " ");
            }
            max--;
            System.out.println();
        }
    }
}
