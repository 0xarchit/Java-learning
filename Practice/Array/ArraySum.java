package Array;

public class ArraySum {
    public static void main(String[] args){
        int[] arr = {54, 43, 2, 1, 5};
        System.out.println(arraySum(arr));
    }
    public static int arraySum(int[] arr) {
        // code here
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
}
