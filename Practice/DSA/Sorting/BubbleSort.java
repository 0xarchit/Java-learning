package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] test = {13, 46, 24, 52, 20, 9};
        int[] test1 = {1,2,3,4,5};
        bc(test);
        bc(test1);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(test1));
    }
    static void bc(int[] arr){
        int n = arr.length;
        for(int i = n-1; i >= 1; i--){
            boolean swapFlag = false; // for increasing order arrays to make it O(N) for best case scenario but still worst case remain O(N^2)
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapFlag = true;
                }
            }
            if(!swapFlag) break; // make it optimise for increasing order arrays
        }
    }
}
