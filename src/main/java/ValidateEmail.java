import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isValidEmailAddress(scanner.next()));
    }

    private static boolean isValidEmailAddress(String email) {
        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern p = java.util.regex.Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}