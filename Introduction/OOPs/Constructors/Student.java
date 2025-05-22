package OOPs.Constructors;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    void Enroll(){
        isEnrolled = true;
        System.out.printf("%s with age %d has %.2f\n", name, age, gpa);
    }
}
