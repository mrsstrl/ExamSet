/*Реализовать функцию, которая заполнит переданный двумерный массив целых чисел
 * по приведенному ниже шаблону:
 * [ [ 4, 4, 4, 4, 4, 5, 6, 7 ],
 *   [ 3, 3, 3, 3, 4, 5, 6, 7 ],
 *   [ 2, 2, 2, 3, 4, 5, 6, 7 ],
 *   [ 1, 1, 2, 3, 4, 5, 6, 7 ],
 *   [ 0, 1, 2, 3, 4, 5, 6, 7 ] ]*/

import java.util.Arrays;

public class TaskFifth {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(5, 8)));
        System.out.println(Arrays.deepToString(solution(6, 3)));
    }

    public static int[][] solution(int line, int column) {
        int[][] matrix = new int[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[matrix.length - i - 1][j] = Math.max(i, j);
            }
        }
        return matrix;
    }
}