import com.sun.xml.internal.bind.v2.util.QNameMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hillel on 26.05.17.
 */
public class TestHashMap {
    public static void main(String[] args) throws IOException {
        readTxtFile();

    }

    private static void readTxtFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/hillel/IdeaProjects/HillelProject/src/main/java/text.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                //System.out.println(line);
                HashMap<String, Integer> map = new HashMap<>();

                String [] words = line.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
                for (String word : words) {
                    if(!word.isEmpty()) {
                        Integer count = map.get(word);
                        if(count == null) {
                            count = 0;
                        }
                        map.put(word, ++count);
                    }
                }

                for(String word : map.keySet()) {
                    System.out.println(word + ": " + map.get(word));
                }
            }


            }
        }
    }