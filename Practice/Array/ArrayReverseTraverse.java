package Array;

import java.util.ArrayList;

public class ArrayReverseTraverse {

    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(snakePattern(arr));
    }

    static ArrayList<Integer> snakePattern(int[][] matrix) {
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            if(i%2 == 0){
                for(int j = 0; j < matrix[i].length; j++){
                    lst.add(matrix[i][j]);
                }
            }else{
                for(int j = matrix[i].length - 1; j >= 0; j--){
                    lst.add(matrix[i][j]);
                }
            }
        }
        return lst;
    }
}
