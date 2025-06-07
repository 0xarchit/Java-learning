// with string concat

package String;

public class ReverseString2 {
    public static void main(String[] args){
        reverse("hello");
    }
    static void reverse(String s){
        int l = s.length();
        char[] c = s.toCharArray();

        String n = "";
        while(l>=1){
            n += c[l-1];
            l--;
        }
        System.out.println(n);
    }
}

// with string builder

/*
package String;

public class ReverseString2 {
    public static void main(String[] args){
        reverse("hello");
    }
    static void reverse(String s){
        int l = s.length();
        char[] c = s.toCharArray();

        StringBuilder n = new StringBuilder();
        while(l>=1){
            n.append(c[l - 1]);
            l--;
        }
        System.out.println(n);
    }
}
 */