package OOPs.Interface;

public class Fish implements Prey, Predator{
    // multiple interfaces can be used
    @Override
    public void flee(){
        System.out.println("Swim away from big fish");
    }

    @Override
    public void hunt(){
        System.out.println("Hunts small fish");
    }
}
