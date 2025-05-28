package OOPs.Super;

public class Person {
    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void show(){
        System.out.println(this.first + " " + this.last);
    }
}
