package techsmiths.training;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("Sample.txt");
        String content = Files.readString(filePath);;

        Pattern p = Pattern.compile("(@[a-zA-Z.'_%+-]+)");
        Matcher m = p.matcher(content);
        HashMap<String, Integer> emailList = new HashMap<String, Integer>();

        while (m.find()){
            //System.out.println(m.group(1));

            if (emailList.containsKey(m.group(1))){
                emailList.put(m.group(1),emailList.get(m.group(1)) + 1);

        }   else    {
                emailList.put(m.group(1), 1);
            }
        }
        System.out.println(emailList);
    }
}



// Regex to find email addresses
// Groups of .com or .co.uk .net
// hashmap to store unique address
// parse file count, unique adddress

// output top 10 - //order hash