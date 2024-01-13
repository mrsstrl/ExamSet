//WEIRD BUT OKAY
//To be honest it is just ChatGPT code bc i am fully disabled and have 1 iq.... have no idea how it works fully and wanna correct some things but have no power to do so.
/* (6-5) Реализовать функцию, которая для переданного двумерного массива целых чисел вернет минимальное значение из последнего столбца, содержащего
максимальный элемент.
Реализовать отдельные дополнительные функции для нахождения максимума и минимум в столбце, которые использовать
для реализации основной функции.
[ [ 4, 10, 54, 55, 6 ],
  [ 12, 55, 0, 44, 50],
  [50, 55, 21, 33, 34] ] -> 33 (55 - максимальное значение содержащиеся в [1] и [3] столбцах, 33 - минимум в [3]
  столбце.
*/
public class TaskThree {
    public static void main(String[] args) {
        System.out.println(findMinInLastColumnWithMax(new int[][]{{4, 10, 54, 55, 6}, {12, 55, 0, 44, 50}, {50, 55, 21, 33, 34}}));
    }
    public static int findMax(int[][] data) {//finding max element in the array
        int max = Integer.MIN_VALUE;//super extreme small pp size
        for (int j = 0; j < data[0].length; j++) {
            for (int i = 0; i < data.length; i++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    public static int findMinInLastColumnWithMax(int[][] data) {
        int maxColumn = -1;
        int max = findMax(data);
        outer: for (int i = data[0].length - 1; i >= 0; i--) { // outer - label // we are reading columns in array from the back and then we look in the rows of a column*
            for (int j = 0; j < data.length; j++) {//*in this loop
                if (data[j][i] == max) {
                    maxColumn = i;
                    break outer; // if it would be just break we would have broken j-loop but break outer breaks i-loop
                }
            }
        }

        // Find the minimum element in the last row with the maximum element
        int min = data[0][maxColumn];
        for (int j = 1; j < data.length; j++) {
            if (data[j][maxColumn] < min) {
                min = data[j][maxColumn];
            }
        }
        return min;
    }
}