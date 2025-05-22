package OOPs.Intro;

class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 50000.99;
    boolean isRunning = false;

    void start(){
        System.out.println("Engine started");
        isRunning = true;
    }
    void stop(){
        System.out.println("Engine stopped");
        isRunning = false;
    }

}
