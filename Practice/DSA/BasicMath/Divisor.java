package DSA.BasicMath;
import java.util.Collections;
import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1
public class Divisor {
    public static void main(String[] args) {
        int n = 123;
        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0) System.out.print(i + " ");

        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(n%i == 0){
                lst.add(i);
                if(i != n/i) lst.add(n/i);
            }
        }
        Collections.sort(lst);

        for(int i : lst){
            System.out.print(i + " ");
        }
    }
}
