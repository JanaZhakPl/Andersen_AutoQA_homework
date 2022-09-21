package lesson2;

import java.util.Arrays;

import static lesson2.Exercise_1.within10and20;
import static lesson2.Exercise_2.isPositiveOrNegative;
import static lesson2.Exercise_3.isNegative;
import static lesson2.Exercise_4.printWordNTimes;
import static lesson2.Exercise_4_1.isLeapYear;
import static lesson2.Exercise_5.invertArray;
import static lesson2.Exercise_6.fillArray;
import static lesson2.Exercise_7.changeArray;
import static lesson2.Exercise_8.fillDiagonal;
import static lesson2.Exercise_9.initialValueArray;
import static lesson2.RotateArray.shiftArray;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 0));
        isPositiveOrNegative(5);
        System.out.println(isNegative(10));
        printWordNTimes("SomeText", 2);
        System.out.println(isLeapYear(2022));
        invertArray(new int[]{1, 0, 1, 0, 0, 1});
        System.out.println();
        fillArray();
        changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        fillDiagonal(5);
        printArrayInConsole(initialValueArray(3, 8));
        printArrayInConsole(shiftArray(new int[]{1, 2, 3}, 1));
        printArrayInConsole(shiftArray(new int[]{6,1,3,5,2}, -2));
    }

    public static void printArrayInConsole(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }
}
