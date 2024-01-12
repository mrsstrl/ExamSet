/*(5-2) Реализовать функцию, которая для переданного одномерного массива целых чисел находит
 * общее количество элементов, которые встречаюься в массиве более одного раза
 * Примеры:
 * [5,2,2,7,-8,4,6,-8,5,1,-8] -> 7
 * [4,5,6]->0
 * Оптимальным будет для хранения количества повторений элементов, которые уже встречались использовать
 * Map<Integer, Integer>. В противном случае обязательно реализовать вспомогательную функцию, которая подсчитывает
 * встречаемость значения в массиве.*/

import java.util.HashMap;
import java.util.Map;

public class TaskFouth {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 2, 7, -8, 4, 6, -8, 5, 1, -8};
        int[] array2 = {4, 5, 6};

        System.out.println(countDuplicateElements(array1)); // Output: 7
        System.out.println(countDuplicateElements(array2)); // Output: 0
    }

    public static int countDuplicateElements(int[] array) {
        Map<Integer, Integer> elementCounts = new HashMap<>();

        // Counting frequency of each element in array
        for (int element : array) {
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
        }

        // Counting frequency of elements that are more than 1 time in the array
        int duplicateCount = 0;
        for (int count : elementCounts.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}