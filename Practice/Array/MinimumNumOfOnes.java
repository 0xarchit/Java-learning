package Array;

public class MinimumNumOfOnes {
    public static void main(String[] args){
        int[][] mat = {
                {1,1,1,1},
                {1,1,0,0},
                {0,0,1,1},
                {1,1,1,1}
        };
        System.out.println(minRow(mat));
    }
    static int minRow(int[][] mat) {

        int rows = mat.length;
        int minCount = mat[0].length;
        int minRowIndex = 1;

        for(int i = 0; i < rows; i++){
            int count = 0;
            for(int j : mat[i]){
                if(j == 1){
                    count++;
                }
            }
            if(count < minCount){
                minCount = count;
                minRowIndex = i+1;
            }else if(count == minCount){
                minRowIndex = Math.min(minRowIndex, i+1);
            }
        }
        return minRowIndex;
    }
}
