package src;

public class DataType {
    public static void main(String[] args) {
        System.out.println("Learning DataTypes");

        int age = 21;
        double gpa = 21.21;
        char meow = '₹';
        boolean isStudent = true;

        System.out.println(age);
        System.out.println(gpa);
        System.out.println(meow);
        System.out.println(isStudent);


        if(isStudent){
            System.out.println("You are student.");
        }
        else{
            System.out.println("You aren't student.");
        }

// primitive: int, double, char, boolean
// reference: string, array, object

        String name = "0xArchit";
        System.out.println("Hello " + name);




    }
}
