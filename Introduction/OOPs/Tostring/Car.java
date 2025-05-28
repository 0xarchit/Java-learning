package OOPs.Tostring;

public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.make + " " + this.model + " of " + this.color + " color made in " + this.year;
    } //override default toString method
}
