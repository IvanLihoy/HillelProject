import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmail {
    public static void main(String[] args) {
        //System.out.println(isNumberBetween("5000"));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(isValidEmailAddress(scanner.next()));
        System.out.println(isNumberBetween("5000.22"));

    }


//    private static boolean isValidEmailAddress(String email) {
//        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(email);
//        return m.matches();
//
//    }
    public static boolean isNumberBetween(String input){
        input = "5000,1000,5001";

        return Pattern.matches("^(?:Numbers: )?(?:(?:[2-9][0-9]{3}|10000)(?:\\.\\d\\d)?(?:,|$))+$", input);


    }
}