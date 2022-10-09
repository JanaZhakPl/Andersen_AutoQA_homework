package lesson8.wordList;

import java.util.*;

import static lesson8.wordList.WordListOperations.printUniqueStrings;
import static lesson8.wordList.WordListOperations.quantityOfEachWord;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six",
                "nine", "ten", "one", "two", "three", "four", "five", "six");
        System.out.println("This set of words:\n" + list);
        printUniqueStrings(list);
        quantityOfEachWord(list);
    }
}

