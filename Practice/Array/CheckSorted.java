package Array;

public class CheckSorted {
    public static void main(String[] args){
        int[] arr1 = {10, 4, 5 ,7, 8, 3, 14, 15, 16, 17};
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(arraySortedOrNot(arr1));
        System.out.println(arraySortedOrNot(arr2));
    }

    public static boolean arraySortedOrNot(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
