package OOPs.Super;

public class Student extends Person{
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    @Override // just for good practice without it it also works!
    void show(){
        System.out.println(this.first + " " + this.last + " " + this.gpa);
    } //methods override
}
