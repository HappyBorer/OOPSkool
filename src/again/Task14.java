package again;

import java.util.Scanner;

/*
Выполните задачу с использованием цикла while.
Пользователь вводит 10 оценок ученика (в 10-балльной системе). Нужно подсчитать, сколько среди них
неудовлетворительных оценок (менее 4 баллов)
Тестовые данные
Sample Input 1:
6 7 3 2 9 5 4 1 7 8
Sample Output 1:
3
Sample Input 2:
5 7 8 9 9 10 7 4 9 8
Sample Output 2:
0
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int RATINGS = 10;
        int mark;
        int unsatisfactory = 0;
        int i = 0;
        while(i < RATINGS){
            mark = input.nextInt();
            if(mark < 4){
                unsatisfactory++;
            }
            i++;
        }
        System.out.println(unsatisfactory);
    }
}
