import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class CheckGMails {
    public static void main(String[] args) throws FileNotFoundException {
        //String input = "email1@gmail.com,email2@gmail.com,email3@gmail.com,email3@yah.oo.com";
        //System.out.println(isAGMailAddress(input));
        parseFile();

    }

    private static boolean isAGMailAddress(String input) {
        //return Pattern.matches("(([^@]*)@(?:gmail\\.com)?(?:,|$))+$", input);

        return Pattern.matches("^(?i)(?:(?:[^@]+((@(gmail|yahoo|yandex)\\.com)))?(?:,|$))+$", input);
    }


    private static void parseFile() throws FileNotFoundException {
        String line;
        String filePath = "/home/hillel/IdeaProjects/HillelProject/src/main/java/file.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
//               Pattern.matcher(".+",line);
//                System.out.println(line);
                String regex = ".+";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(line);
                while (m.find())
                System.out.println(m.group());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}