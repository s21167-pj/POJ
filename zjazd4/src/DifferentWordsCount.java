/*
DifferentWords count implemented in Java.
Author: Marcel P
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;


public class DifferentWordsCount {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("src/files/Sample.txt"));
        Map<String, Integer> unsortedMap = new TreeMap<>();

        while (input.hasNext()) {
            String word = input.next().toLowerCase().replaceAll("[,.:;]", "");
            Integer counter = unsortedMap.getOrDefault(word, 0);
            unsortedMap.put(word, ++counter);
        }
        Map<String, Integer> sortedMap = unsortedMap
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (key, valueToSort) -> valueToSort,
                        LinkedHashMap::new));

        String finalMap = sortedMap.toString().replaceAll("[{}]", "");
        System.out.println("[" + finalMap + "]");
    }

}

