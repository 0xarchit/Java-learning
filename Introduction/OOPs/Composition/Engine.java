package OOPs.Composition;

public class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println(this.type + " Engine started");
    }
}
