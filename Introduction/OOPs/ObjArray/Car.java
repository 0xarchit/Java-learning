package OOPs.ObjArray;

public class Car {
    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You Drive a: " + this.model + "of color: " + this.color);
    }
}
