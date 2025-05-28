package OOPs.GetSet;

public class Car {
    private final String model; // final ensure it will never change
    private String color;
    private int price;


    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "₹" + this.price;
    }

//    void setModel(String model){
//        this.model = model;
//    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Can't set");
        }else{
            this.price = price;
        }
    }


}
