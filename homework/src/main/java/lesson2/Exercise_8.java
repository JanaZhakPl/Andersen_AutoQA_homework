package lesson2;

/**
 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
 */
public class Exercise_8 {

    public static void fillDiagonal(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || ((i + j) == (n - 1)))
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
