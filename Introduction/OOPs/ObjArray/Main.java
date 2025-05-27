package OOPs.ObjArray;

public class Main {
    public static void main(String[] args){
//        Car car1 = new Car("M5", "Black");
//        Car car2 = new Car("Ferrari", "Red");
//        Car car3 = new Car("Lamborghini", "Yellow");

//        Car[] cars = {car1, car2, car3};
        Car[] cars = {
                new Car("M5", "Black"),
                new Car("Ferrari", "Red"),
                new Car("Lamborghini", "Yellow")
        };
        for(Car drv : cars){
            drv.color = "black";
            drv.drive();
        }
    }
}
