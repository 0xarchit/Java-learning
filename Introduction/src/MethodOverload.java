package src;

public class MethodOverload {
    public static void main(String[] args){
        System.out.println(add(1, 2, 3, 4, 5));
    }
    static  double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double... nums){
        double sum = 0;
        for(double num : nums){
            sum += num;
        }
        return sum;
    }
}


// signature = name + parameter no two have same sig can have same name