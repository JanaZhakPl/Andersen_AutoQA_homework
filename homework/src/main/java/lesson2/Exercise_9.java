package lesson2;

import java.util.Arrays;

import static lesson2.MainApp.printArrayInConsole;

/**
 * Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
 * типа int длиной len, каждая ячейка которого равна initialValue;
 */
public class Exercise_9 {
    public static int[] initialValueArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}

