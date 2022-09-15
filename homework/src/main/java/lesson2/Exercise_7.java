package lesson2;

import java.util.Arrays;

/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */

public class Exercise_7 {
    public static void main(String[] args) {

    }

    public static void changeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
