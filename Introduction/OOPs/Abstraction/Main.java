package OOPs.Abstraction;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2, 4);
        Rectangle rectangle = new Rectangle(2, 4);

        circle.what();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
