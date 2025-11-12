package Miscellaneous;


public class SumOfKSizedSubarray {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1,2,3,4,5,6,-3};
        int n = arr.length;
        int max_sum = 0;
        for(int i = 0 ; i<k ; i++){
            max_sum += arr[i];
        }
        int sum = max_sum;
        for(int i = k ; i<n ; i++){
            sum+=arr[i]-arr[i-k];
            max_sum = Math.max(max_sum,sum);
            //max_sum = sum;
        }

        System.out.println(max_sum);
    }
}
