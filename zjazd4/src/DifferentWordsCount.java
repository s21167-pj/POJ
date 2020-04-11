/*
DifferentWords count implemented in Java.
Author: Marcel P
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class DifferentWordsCount {
    public static void main(String[] args) throws IOException {
        String path = "src/files/Sample.txt";
        String content = Files.readString(Paths.get(path));
        content = content.toLowerCase().replaceAll("[,.:;]", "");
        List<String> wordList = Arrays.asList(content.split(" "));

        Set<String> uniqueWords = new HashSet<>(wordList);
        for (String word : uniqueWords) {
            System.out.println(word + "=" + Collections.frequency(wordList, word));
        }
    }

}

