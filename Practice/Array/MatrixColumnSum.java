package Array;

import java.util.Arrays;

public class MatrixColumnSum {
    public static void main(String[] args){
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(colSum(mat)));
    }
    public static int[] colSum(int[][] mat){
        int[] out = new int[mat[0].length];

        for(int j = 0; j < mat[0].length; j++){
            int sum = 0;
            for(int i = 0; i < mat.length; i++){
                sum += mat[i][j];
            }
            out[j] = sum;
        }
        return out;
    }
}
