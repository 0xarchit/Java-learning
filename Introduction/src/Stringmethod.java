package src;

public class Stringmethod {
    public static void main(String[] args){
        String name = "Archit Jain  ";
        int length = name.length();

        System.out.println(length);
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("h"));
        System.out.println(name.lastIndexOf("i"));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

        System.out.println(name.replace("i", "a"));
        System.out.println(name.isEmpty());
        System.out.println(name.contains(" "));
        System.out.println(name.equals("meow"));

        System.out.println(name.substring(1, name.length()-3));

    }
}
