package OOPs.Abstraction;

public abstract class Shape {
    abstract double area(); // abstract method -> must be implemented in child class

    void what(){ //concrete method
        System.out.println("This is a shape");
    }
}
