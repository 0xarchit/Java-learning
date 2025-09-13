package DSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        qs(arr, 0, 7);
        System.out.println(Arrays.toString(arr));

    }
    static void qs(int[] arr, int low, int high){
        if(low<high){
            int pindex = partition(arr, low, high);
            qs(arr, low, pindex-1);
            qs(arr,pindex+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i] <= pivot && i<= high-1){
                i++;
            }
            while(arr[j] > pivot && j >= low+1){
                j--;
            }
            if(i<j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
