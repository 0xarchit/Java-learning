package ForEachLoop;
import java.util.*;

public class method1 {
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(10, 20, 15, 16);

        i.forEach(x -> System.out.println(x*x));
    }
}
