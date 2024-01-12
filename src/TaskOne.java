/* (2-1) Реализовать функцию, которая напечает n первых чисел последовательности, образованной по следующему законы
(массивов, списки и тп не использовать):
2, 3, 5, 7, 10, 13, 16, 20, 24, 28, 32, 37, ...
Пояснение как формируется очередное число из предыдущего, - ниже под каждым числом:
+1 +2 +2 +3 +3 +3 +4 +4 +4 +4 +4 +5 +5 ...
Разделить чисел - ", " (запятая и пробел), после последнего числа не печатать.
Пример (ответ для n = 6):
2, 3, 5, 7, 10, 13*/
public class TaskOne {
    public static void main(String[] args) {
        solution(6);
        solution(12);
    }

    public static void solution(int n) {
        int current_num = 2; //current number by the task
        int increasement = 1; // default increasement
        int count = 1; // cnt equals 1 bc we already have 1 number while our i = 0
        for (int i = 0; i < n; i++) {
            System.out.print(current_num); // printing current number
            if (i < n - 1) { //putting , because the task says i have to do it with every number but not the last one!
                System.out.print(", ");
            }
            current_num += increasement; //increasing next number
            if (count==increasement){ // if count equals my increasement so for example count by default is 1 and my increasement equals 1 so next incr should be 2 already
                increasement+=1;
                count = 1;
            }else{
                count+=1; // else +1 to count
            }
        }
    }
}
