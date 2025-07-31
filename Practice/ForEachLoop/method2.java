package ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class method2 {
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(10, 20, 15, 16);

        i.forEach(System.out::println);
    }
}
