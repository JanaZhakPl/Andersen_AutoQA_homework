package lesson2;

/**
 * Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
 * если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
 */
public class Exercise_3 {
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
}
