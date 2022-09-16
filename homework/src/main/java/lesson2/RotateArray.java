package lesson2;

import static lesson2.MainApp.printArrayInConsole;

public class RotateArray {
    public static int[] shiftArray(int[] arr, int n) {
        int[] b = new int[arr.length];
        if (Math.abs(n) <= arr.length) {

            if (n > 0) {
                System.arraycopy(arr, 0, b, n, arr.length - n);
                System.arraycopy(arr, arr.length - n, b, 0, n);
            } else {
                System.arraycopy(arr, Math.abs(n), b, 0, arr.length + n);
                System.arraycopy(arr, 0, b, arr.length + n, Math.abs(n));
            }
            return b;
        }

        return null;
    }
}

