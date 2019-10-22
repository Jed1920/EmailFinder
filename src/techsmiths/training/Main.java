package techsmiths.training;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("Sample.txt");
        String content = Files.readString(filePath);;

        String stringToFind = "techsmiths.uk";
        int stringLen = stringToFind.length();
        //int counter = stringCounter(content,stringToFind,stringLen);

        Pattern p = Pattern.compile("(@\\w+.)");
        Matcher m = p.matcher(content);
        int counter = 0;
        while (m.find()){
            counter++;
        }
        System.out.print(counter);
    }
}
