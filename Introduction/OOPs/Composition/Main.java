package OOPs.Composition;

// composition -> shows have-a or part-of relationship
// allow complex objects to be constructed from smaller objects.

public class Main {
    public static void main(String[] args){
        Car car = new Car("M5", 2025, "v8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
