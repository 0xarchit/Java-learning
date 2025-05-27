package OOPs.statickeyword;

public class Friend {
    static int cnt; //make it single available for whole class
    String name;

    Friend(String name){
        this.name = name;
        cnt++;
    }

    static void frens(){
        System.out.println("Total frens: " + cnt);
    }
}
