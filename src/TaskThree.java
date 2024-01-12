//WEIRD BUT OKAY
//To be honest it is just ChatGPT code bc i am fully disabled and have 1 iq.... have no idea how it works fully and wanna correct some things but have no power to do so.
/* (6-5) Реализовать функцию, которая для переданного двумерного массива целых чисел вернет минимальное значение из последнего столбца, содержащего
максимальный элемент.
Реализовать отдельные дополнительные функции для нахождения максимума и минимум в столбце, которые использовать
для реализации основной функции.
[ [ 4, 10, 54, 55, 6 ],
  [ 12, 55, 0, 44, 50],
  [50, 55, 21, 33, 34] ] -> 21 (55 - максимальное значение содержащиеся в [1] и [3] столбцах, 21 - минимум в [3]
  столбце.
*/
public class TaskThree {
    public static int findMax(int[][] data) {
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

    public static int findMinInLastRowWithMax(int[][] data) {
        int maxRow = -1;
        int maxElement = Integer.MIN_VALUE;

        // Find the row with the maximum element
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == findMax(data)) {
                    maxRow = i;
                    break;
                }
            }
        }

        // If no row with the maximum element is found, return some appropriate value or handle it accordingly
        if (maxRow == -1) {
            System.out.println("No row with the maximum element found.");
            return Integer.MIN_VALUE; // You can change this to an appropriate value or handle it differently
        }

        // Find the minimum element in the last row with the maximum element
        int minInLastRowWithMax = data[maxRow][0];
        for (int j = 1; j < data[maxRow].length; j++) {
            if (data[maxRow][j] < minInLastRowWithMax) {
                minInLastRowWithMax = data[maxRow][j];
            }
        }

        return minInLastRowWithMax;
    }

    public static void main(String[] args) {
        int[][] dataArray = {
                {4, 10, 54, 55, 6},
                {12, 55, 0, 44, 50},
                {50, 55, 21, 33, 34}
        };

        System.out.println(findMinInLastRowWithMax(dataArray));
    }
}