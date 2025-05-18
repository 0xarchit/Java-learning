package Array;

public class TwoD {
    public static void main(String[] args){
//        String[] fruits = {"apple", "mango", "banana"};
//        String[] veg = {"potato", "onion", "carrot"};
//        String[] pack = {"biskit", "namkeen", "chocolate"};

//        String [][] groceries = {fruits, veg, pack};

        String[][] groceries = {
                {"apple", "mango", "banana"},
                {"potato", "onion", "carrot"},
                {"biskit", "namkeen", "chocolate"}
        };

        groceries[0][1] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + "\t");
            }
            System.out.println();
        }
    }
}
