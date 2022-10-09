package lesson8.wordList;

import java.util.*;

public class WordListOperations {
    public static void printUniqueStrings(List<String> list) {
        System.out.println("List of unique words: ");
        Set<String> strHashSet = new LinkedHashSet<>(list);
        System.out.println(strHashSet);
    }

    public static void quantityOfEachWord(List<String> list) {
        System.out.println("Number of word repetitions in the list:");
        Map<String, Integer> wordsCount = new LinkedHashMap<>();
        for (String s : list) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        // wordsCount.entrySet().forEach((s -> System.out.print(s + "  ")));
        System.out.println(wordsCount);
    }
}
