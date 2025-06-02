package Array;

public class LargestElement {
    public static void main(String[] args){
        int[] arr = {1,2,4,2,1,7,8,2,9,1};
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr) {
        int a = Integer.MIN_VALUE;
        for(int i : arr){
            if(a<i){
                a = i;
            }
        }
        return a;
    }
}
