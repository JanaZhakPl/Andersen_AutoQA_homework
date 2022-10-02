package lesson6;

import lesson6.MyExceptions.MyArrayDataException;
import lesson6.MyExceptions.MyArraySizeException;

import static lesson6.Method.method;

public class Main {

    public static void main(String[] args) {

        String[][] correct = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        String[][] incorrectSize = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}};
        String[][] incorrectElement = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "a"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                String result = method(correct);
                System.out.println(result);
                String result1 = method(incorrectSize);
                System.out.println(result1);
//                String result2 = method(incorrectElement);
//                System.out.println(result2);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответствует заданному 4Х4!");
                System.out.println(e);
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

}
