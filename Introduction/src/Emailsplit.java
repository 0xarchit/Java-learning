package src;
import java.util.Scanner;

public class Emailsplit {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input email: ");
        String email = scanner.nextLine();
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.printf("Username : %s\n domain: %s", username, domain);
    }
}
