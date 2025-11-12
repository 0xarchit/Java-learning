package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] test = {13, 46, 24, 52, 20, 9};
        ss(test);
        System.out.println(Arrays.toString(test));
    }
    static void ss(int[] arr){
        for(int i = 0; i <= arr.length-2; i++){
            int min = i;
            for(int j = i; j <= arr.length-1; j++){
                if(arr[j]<arr[min]) min = j;
            }
            int tmp = arr[min];

            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
}
