package src;
import java.util.Random;
import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

        double result;
//        result = Math.pow(2, 3);
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(3.33);
//        result = Math.ceil(3.33);
//        result = Math.floor(3.33);
//        result = Math.max(2, 3);
        double a;
        double b;

//        System.out.print("Enter a: ");
//        a = scanner.nextDouble();
//        System.out.print("Enter b: ");
//        b = scanner.nextDouble();

        a = 1000;
        b = -3121;

        result = Math.sqrt(a*a + b*b);

    scanner.close();


        System.out.println("Hypotenuse: " + result);
        System.out.printf("%f %f %f", a, b, result);
        System.out.printf("\n %.1f %.1f %.1f", a, b, result);
        System.out.printf("\n %+.1f %+.1f %+.1f", a, b, result);
        System.out.printf("\n %,.1f %,.1f %,.1f", a, b, result); // automatically 1,000
        System.out.printf("\n %(.1f %(.1f %(.1f", a, b, result); // pack -ve to () instead -
        System.out.printf("\n % .1f % .1f % .1f", a, b, result); // add extra gap for positive number to remain better indentation for -ve

//      padding

        int id1 = 1;
        int id2 = 12;
        int id3 = 123;
        int id4 = 1234;
        System.out.printf("\n%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);


//      padding with 0

        System.out.printf("\n%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

//      left adjust

        System.out.printf("\n%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);



//        % --> s : string, c : char, d : int, f : float/double, b : boolean
    }
}
