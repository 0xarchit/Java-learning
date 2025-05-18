package src;

public class VarScope {

    static int x = 3; // class scope

    public static void main(String[] args){
//        int x = 1; // local
//        System.out.println(x);
//        local();
        System.out.println(x);
    }

    static void local(){
        int x = 2; //different method local var
        System.out.println(x);
    }
}
