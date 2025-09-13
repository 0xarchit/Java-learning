package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] test = {13, 46, 24, 52, 20, 9}; // O(n^2)
        int[] test1 = {14, 9, 15, 12, 6, 8, 13}; // O(n^2)
        int[] test2 = {1,2,3,4}; // best case O(n)
        is(test);
        is(test1);
        is(test2);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }
    static void is(int[] arr){
        int n = arr.length;
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1]>arr[j]){
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }
        }
    }
}