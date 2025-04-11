package src;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
//        number  = random.nextInt();
        number  = random.nextInt(1, 10); // 10 exclusive
        System.out.println(number);

        double num;
        num = random.nextDouble(1, 101);
        System.out.println(num);

    }
}
