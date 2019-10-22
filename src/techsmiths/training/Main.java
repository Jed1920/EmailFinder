package techsmiths.training;

import javax.swing.text.html.parser.Entity;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("Sample.txt");
        String content = Files.readString(filePath);;

        Pattern p = Pattern.compile("(@[a-zA-Z.'_%+-]+)");
        Matcher m = p.matcher(content);
        HashMap<String, Integer> emailList = new HashMap<String, Integer>();

        while (m.find()){

            if (emailList.containsKey(m.group(1))){
                emailList.put(m.group(1),emailList.get(m.group(1)) + 1);

        }   else    {
                emailList.put(m.group(1), 1);
            }
        }
        /*Scanner scanner = new Scanner(System.in);
                int frequency = scanner.nextInt();
                public boolean greatthanfrequency(){
                    return this.
                    }*/

        List<Map.Entry<String, Integer>> sortedEntries = emailList.entrySet()
                .stream()
                .filter(entry -> entry.getKey().contains("techsmiths"))
                //.filter(entry -> entry.getValue().("techsmiths"))
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(emailList);
        System.out.println(sortedEntries);
    }
}
