package Array;

public class ElementDecrement {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = decrementArrayElements(a);
        for(int i : b){
            System.out.print(i + " ");
        }
    }
    public static int[] decrementArrayElements(int[] arr) {
        int[] n = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            n[i] = arr[i] - 1;
        }
        return n;
    }
}
