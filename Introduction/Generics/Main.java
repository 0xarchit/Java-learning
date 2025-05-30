package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Generics: A concept used to write a class, interface or method
        // that is compatible with different data types.
        // <T, U> type parameter (placeholder that gets replaced with real types eg. String, etc)

//        Box<String> box = new Box<>();
//        box.setItem("Litchi");
//        System.out.println(box.getItem());

        Product<String, Integer> product = new Product<>("Litchi", 200);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}
