package Array;

public class PositiveAverage {
    public static void main(String[] args){
        int[] arr = {-12, 8, -7, 6, 12, 0, -9, 14};
        System.out.println(posAverage(arr));
    }
    public static double posAverage(int[] arr) {
        int sum = 0;
        int l = 0;

        for(int i : arr){
            if(i >= 0){
                sum += i;
                l++;
            }
        }
        return (double) sum/l;
    }
}
