package String;

public class ExtractDecimalValue {
    public static void main(String[] args){
        String num = "3.14168";
        extract(num);
    }
    static void extract(String num){
        int pos = num.indexOf('.');
        System.out.println(num.substring(pos+1));
    }
}
