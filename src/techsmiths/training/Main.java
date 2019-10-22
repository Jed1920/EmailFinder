package techsmiths.training;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("Sample.txt");
        String content = Files.readString(filePath);;

        String stringToFind = "@techsmiths.uk";
        int stringLen = stringToFind.length();
        int counter = stringCounter(content,stringToFind,stringLen);

        System.out.println(counter);
    }

    private static int stringCounter(String content, String strToFind, int strLen){

        int stringCounter = 0;

        for (int i = 0; i <= content.length()-strLen; i++) {
            if (content.substring(i, i + strLen).equals(strToFind)) {
                stringCounter++;
            }
        }
        return stringCounter;
    }
}
