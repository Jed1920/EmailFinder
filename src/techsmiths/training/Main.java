package techsmiths.training;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Path filePath = Paths.get("Sample.txt");
        String content = getFileContents(filePath);

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

    private static String getFileContents(Path path){
        String content = "";

        try {
            content += Files.readString(path);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }
}
