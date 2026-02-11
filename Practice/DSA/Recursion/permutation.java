package DSA.Recursion;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args){
        System.out.println("Premutation");
        permute(new int[] {1,2,3}, 0);
    }
    static void permute(int[] arr, int start){
        if(start == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        };
        for(int i=start;i<arr.length;i++){
            int tmp =  arr[i];
            arr[i] = arr[start];
            arr[start] = tmp;

            permute(arr, start+1);

            tmp =  arr[i];
            arr[i] = arr[start];
            arr[start] = tmp;
        }
    }
}