package OOPs.ConstructorOverload;

public class Main {
    public static void main(String[] args){
        User user1 = new User("Arc");
        User user2 = new User("Arc", "arc@xyz.com");
        User user3 = new User("Arc", "arc@xyz.com", 18);
    }
}
