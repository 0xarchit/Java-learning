package OOPs.Wrapper;

public class Main {
    public static void main(String[] args){
//        wrapper classes allow primitive values (int, char, double, boolean)
//        to be used as objects.

        /* depreciated old method
        Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('@');
        Boolean d = new Boolean(true);
        */

        /*
        // Using Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '@';
        Boolean d = true;

        // Unboxing
        int x = a;
        double y = b;
        */
/*
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(true);

        System.out.println(a+b+c+d);
*/
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Arc".charAt(0); // no wrapper class method for char
        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        // isUpperCase, isLowerCase, etc
    }
}
