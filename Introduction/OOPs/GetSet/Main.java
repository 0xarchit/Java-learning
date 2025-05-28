package OOPs.GetSet;

public class Main {
    public static void main(String[] args){
        Car car = new Car("M5", "black", 20000000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

//        car.setModel("phantom");
        car.setColor("green");
        car.setPrice(25000000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}