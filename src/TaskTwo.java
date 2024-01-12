/* (9-4)Реализовать функцию, которая из элементов переданного списка целых чисел
(List<Integer>) составит новый список (List<Integer>), включив в него эле-
менты между первым и вторым значением 0. Если второго значения
0 в списке нет, то включаются все элементы от первого 0 до
конца списка.
for (int value : list){ ...}
Примеры:
{ 5, 3, 0, 3, 5, 0, 0, 4, 0, 4 } -> { 3, 5 }
{ 1, 0, 0, 7, 8, 9, 0, 4 } -> { }
{ 1, 0, 3, 4, 5 } -> { 3, 4, 5 }
*/

import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        solution(List.of(5, 3, 0, 3, 5, 0, 0, 4, 0, 4));
        solution(List.of(1, 0, 0, 7, 8, 9, 0, 4));
        solution(List.of(1, 0, 3, 4, 5));
    }

    public static void solution(List<Integer> inputList) {
        List<Integer> result = createNewList(inputList);
        System.out.println(result);
    }

    public static List<Integer> createNewList(List<Integer> inputList) {
        List<Integer> result = new java.util.ArrayList<>();
        boolean firstFound = false;
        for (int value : inputList) {
            if (value == 0) {
                if (firstFound) {
                    break;
                } else {
                    firstFound = true;
                }
            } else if (firstFound) {
                result.add(value);
            }
        }
        return result;
    }
}
//Ideas:
//create a new list by putting elements from 2 near 0 in it