package Array;

import java.util.Arrays;

public class MatrixRowSum {
    public static void main(String[] args){
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(rowSum(mat)));
    }

    public static int[] rowSum(int[][] mat) {
        int[] lst = new int[mat.length];

        for(int i = 0; i < mat.length; i++){
            int sum = 0;
            for(int j = 0; j < mat[i].length; j++){
                sum += mat[i][j];
            }
            lst[i] = sum;
        }
        return lst;
    }
}
