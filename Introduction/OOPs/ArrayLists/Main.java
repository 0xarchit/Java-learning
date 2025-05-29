package OOPs.ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        // resizeable array that store objects(autoboxing)

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(2);
//        list.add(1);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Litchi");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits);

        fruits.remove(2);
        System.out.println(fruits);

        fruits.set(1, "Pineapple");
        System.out.println(fruits);

        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        Collections.sort(fruits);

        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
