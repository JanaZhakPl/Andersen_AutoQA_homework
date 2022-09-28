package lesson5;

import java.util.Arrays;

public class SwapElement {
    public static <T> void swapFirstAndLast(T[] arr) {
        System.out.println("Start: " + Arrays.asList(arr));
        T fistElement = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = fistElement;
        System.out.println("Finish: " + Arrays.asList(arr));
    }

    public static void main(String[] args) {
        String[] words = {"one", "two", "three"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        swapFirstAndLast(words);
        swapFirstAndLast(numbers);
    }
}
