package Array;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args){
        String[] fruits = {"apple", "mango", "banana"};
//        fruits[0] = "pineapple";
//        System.out.println(fruits[0]);
        int num = fruits.length;

//        for(int i = 0; i < num; i++){
//            System.out.print(fruits[i] + " ");
//        }

        // enhanced for loop

//        Arrays.sort(fruits);

//        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
