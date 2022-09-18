package lesson2;

import static lesson2.MainApp.printArrayInConsole;

public class RightCyclicalShift {
    public static int[] ShiftRight(int[] array, int n) {
        while (n > 0) {
            int temp = array[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                int curVal = array[i];
                array[i] = temp;
                temp = curVal;
            }
            n--;
        }
        return array;
    }

    public static void main(String[] args) {
        printArrayInConsole(ShiftRight(new int[]{1, 2, 3}, 1));
        printArrayInConsole(ShiftRight(new int[]{1, 2, 3}, 5));

    }
}




