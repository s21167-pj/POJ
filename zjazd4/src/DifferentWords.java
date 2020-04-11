/*
DifferentWords  implemented in Java.
Author: Marcel P
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class DifferentWords {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/files/Sample.txt"));
        Set<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        while (input.hasNext()) {
            uniqueWords.add(input.next()
                    .replaceAll("[,.:;]", "")
            );
        }
        uniqueWords.forEach(element -> System.out.print(element.toLowerCase() + " "));
        System.out.println("\nNumber of words: " + uniqueWords.size());

    }
}
