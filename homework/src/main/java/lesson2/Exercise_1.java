package lesson2;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
public class Exercise_1 {
    public static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
