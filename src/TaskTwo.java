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
        List<Integer> result = createNewList(inputList);// calling function createNewList
        System.out.println(result);//printing the result
    }

    public static List<Integer> createNewList(List<Integer> inputList) {
        List<Integer> result = new java.util.ArrayList<>();//using util to get a piece of our list in array (if i understand it in right way)
        boolean firstFound = false;// put this boolean to false bc by default we have not found an element that equals 0 in our list
        for (int value : inputList) {//checking all values in our inputList
            if (value == 0) {
                if (firstFound) {// when it is true, that means that we have already found second 0 in our list so we should break firstFound
                    break;
                } else {
                    firstFound = true; // else it is our first 0 that we have found
                }
            } else if (firstFound) { // else if firstFound is still true then we just add values
                result.add(value);
            }
        }
        return result;
    }
}
/*package tasks;

import tasks.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class Task_9_4_finish {
    public static List<Integer> readListFromConsole(){
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = readListFromConsole();
        List<Integer> res = new ArrayList<>();
        int c = 0;
        for(int num: list){
           if(c==0){
               if(num==0) c++;
           }else{
               if(num!=0) res.add(num);
               else break;
           }
        }
        for(int num: res){
            System.out.print(num+" ");
        }
    }
}*/