package Array;

public class ArrayTraverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        arrayTraversal(arr);
    }
    public static void arrayTraversal(int[] arr) {
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
