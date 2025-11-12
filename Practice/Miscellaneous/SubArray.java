package Miscellaneous;
import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 30, -5, 20, 7};
        int[] arr = {2,4,1,3,5,8,6};
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                int[] sub = Arrays.copyOfRange(arr, i, j);
                if(sub.length==k) System.out.println(Arrays.toString(sub));
            }
            System.out.println();
        }
    }
}
    // public static void new(int[] arr) {
    // int n = arr.length;
    // for (int start = 0; start < n; start++) {
    //     for (int end = start; end < n; end++) {
    //         for (int i = start; i <= end; i++) {
    //             System.out.print(arr[i] + " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    // }
// }


//public class sumSubArray {
//    public static void main(String[] args) {
//        int[] arr = {2,3,97,4,7,3};
//        int k = 3;
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i<=arr.length-k;i++){
//            int t = 0;
//            for(int j = i; j<i+k;j++){
//                t+=arr[j];
//            }
//            if (t>max) max = t;
//        }
//        System.out.println(max);
//    }
//}
