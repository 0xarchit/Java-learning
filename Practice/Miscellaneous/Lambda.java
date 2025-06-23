package Miscellaneous;



public class Lambda {
    public static void main(String[] args){
        sayHello().sayHello();
    }

    public static Hello sayHello() {
        Hello hello = () -> System.out.println("Hello");
        return hello;
    }

    @FunctionalInterface
    interface Hello {
        void sayHello();
    }
}

