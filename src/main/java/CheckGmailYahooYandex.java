import java.util.regex.Pattern;



public class CheckGmailYahooYandex {
    public static void main(String[] args) {
        String input = "email1@gmail.com,email3@yandex.com,email4@yahoo.com";
        System.out.println(isAGMailYahooYandexAddress(input));
    }

    private static boolean isAGMailYahooYandexAddress(String input) {
        return Pattern.matches("^(?i)(?:(?:[^@]+(@(?:gmail|yandex|yahoo)\\.com))?(?:,|$))+$", input);
    }
}
