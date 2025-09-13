package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,6,2,4};
        ms(arr, 0, 8);
        System.out.println(Arrays.toString(arr));
    }
    static void ms(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, idx = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[idx++] = arr[left++];
        }
        while (right <= high) {
            temp[idx++] = arr[right++];
        }

//        for (int i = 0; i < temp.length; i++) {
//            arr[low + i] = temp[i];
//        }

        System.arraycopy(temp, 0, arr, low, temp.length);
    }
}
