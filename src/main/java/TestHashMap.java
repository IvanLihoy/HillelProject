import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;


public class TestHashMap {
    public static void main(String[] args) throws IOException {
        totalNumberOfLines();
        totalNumberOfWords();
        readTxtFile();
    }

    private static void readTxtFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\777\\IdeaProjects\\HillelProject\\src\\main\\java\\text.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                HashMap<String, Integer> map = new HashMap<>();
                String[] words = line.replaceAll("[-.?!)(,:]", "").split("\\s");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        Integer count = map.get(word);
                        if (count == null) {
                            count = 0;
                        }
                        map.put(word, ++count);
                    }
                }
                for (String word : map.keySet()) {
                    System.out.println(word + ": " + map.get(word));

                }

            }

        }
    }

    private static void totalNumberOfLines() throws IOException {
        File file = new File("C:\\Users\\777\\IdeaProjects\\HillelProject\\src\\main\\java\\text.txt");
        FileReader fr = new FileReader(file);
        LineNumberReader lr = new LineNumberReader(fr);
        int linenumber = 0;
        while (lr.readLine() != null) {
            linenumber++;
        }
        System.out.println("Number of lines : " + linenumber);
        lr.close();
    }

    private static void totalNumberOfWords() throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\777\\IdeaProjects\\HillelProject\\src\\main\\java\\text.txt"));
        int countWords = 0;

        while (input.hasNextLine()) {
            if(input.hasNext()) {
                String word = input.next();
                countWords++;
            }
        }
        System.out.println("Number of words: " + countWords);
    }
}

//    private static void amountOfWords() throws IOException {
//        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\777\\IdeaProjects\\HillelProject\\src\\main\\java\\text.txt"))) {
//            for (String line; (line = br.readLine()) != null; ) {
//                int word = 0;
//                word += new StringTokenizer(line, " ,").countTokens();
//                System.out.println("Number of words: " + word);
//            }
//
//        }
//    }

