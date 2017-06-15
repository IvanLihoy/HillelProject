import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ParseLogFile {
    public static void main(String[] args) {
        try{
            String filePath = "C:\\Users\\Ivan\\IdeaProjects\\HillelProject\\src\\main\\java\\file.txt";
            parseFile(filePath);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void parseFile(String filePath) throws FileNotFoundException {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String regex = "(?:^(.*?)Activity:)|((?:\\[(?:Login Username:|Data Object:|Records:|Records:|User Action Status:|Labels:|Service type:|Mapping Ids:|URI:)(.*?)]))";
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
