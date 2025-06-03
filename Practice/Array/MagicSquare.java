package Array;

public class MagicSquare {
    public static void main(String[] args){
        int[][] mat = {
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };

        int[][] mat2 = {
                {1,2},
                {3,4}
        };
        System.out.println(magicSquare(mat));
        System.out.println(magicSquare(mat2));
    }
    public static String magicSquare(int[][] mat) {
        boolean isMagic = true;
        int sum = 0;
        int len = mat.length;

        for(int j = 0; j<len; j++){
            sum += mat[0][j];
        }

        for(int i = 0; i < len; i++){
            int sumR = 0;
            for(int j=0; j<len; j++){
                sumR += mat[i][j];
            }
            if(sumR != sum) return "Not a Magic Square";
        }

        for(int j = 0; j < len; j++){
            int sumC = 0;
            for(int i = 0; i < len; i++){
                sumC += mat[i][j];
            }
            if(sumC != sum) return "Not a Magic Square";
        }

        int sumD1 = 0;
        for(int i = 0; i<len; i++){
            sumD1 += mat[i][i];
        }
        if(sumD1 != sum) return "Not a Magic Square";

        int sumD2 = 0;
        for(int i = 0; i < len; i++){
            sumD2 += mat[i][len - i - 1];
        }
        if (sumD2 != sum) return "Not a Magic Square";

        boolean[] cur = new boolean[len*len+1];

        for(int i = 0; i<len; i++){
            for(int j = 0; j < len; j++){
                int num = mat[i][j];
                if(num < 1 || num > len*len || cur[num]){
                    return "Not a Magic Square";
                }
                cur[num] = true;
            }
        }

        return "Magic Square";
    }
}
