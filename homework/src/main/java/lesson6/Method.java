package lesson6;

import lesson6.MyExceptions.MyArrayDataException;
import lesson6.MyExceptions.MyArraySizeException;

public class Method {
    public static String method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Колличество строк не равно 4-ем");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Колличество элементов в строке не равно 4-ем");
            }

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return "Массив соответствует заданным параметрам 4Х4. Результат сложения всех элементов массива: " + count;
    }
}
