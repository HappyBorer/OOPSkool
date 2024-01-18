package again;

import java.util.Scanner;

/*
 Грузовой самолет должен пролететь с грузом из пункта А в пункт С через пункт В. Емкость бака для топлива у самолета
  – 300 литров. Потребление топлива на 1 км в зависимости от веса груза у самолета следующее:
          - до 500 кг  (включительно) :    1 литров / км
          - до 1000 кг (включительно):   4 литров / км
          - до 1500 кг (включительно):   7 литров / км
          - до 2000 кг (включительно):   9 литров / км.
          - более 2000 кг – самолет не поднимает.

Пользователь вводит расстояние между пунктами А и В,  расстояние между пунктами В и С, а также вес груза.
Программа должна рассчитать какое минимальное количество топлива необходимо для дозаправки самолету в пункте В,
чтобы долететь из пункта А в пункт С. В случае невозможности преодолеть любое из расстояний – программа должна
вывести ERROR.
Числовой результат работы программы округляется до двух знаков после десятичной точки.
Тестовые данные
Sample Input 1:
200 200 300
Sample Output 1:
100.00
Sample Input 2:
136 268 600
Sample Output 2:
ERROR
 */
public class Task11 {
    public static void main(String[] args) {
        int fuel = 300;
        int consumption500 = 1;
        int consumption1000 = 4;
        int consumption1500 = 7;
        int consumption2000 = 9;
        Scanner input = new Scanner(System.in);
        int distanceAB = input.nextInt();
        int distanceBC = input.nextInt();
        int weight = input.nextInt();
        input.close();
        double resultAB = 0;
        double resultBC = 0;
        if(weight > 2000 || weight < 0 || distanceAB < 0 || distanceBC < 0){
            System.out.println("ERROR");
            return;
        }else if(weight < 501){
            resultAB = distanceAB * consumption500;
            resultBC = distanceBC * consumption500;
        }else if(weight < 1001){
            resultAB = distanceAB * consumption1000;
            resultBC = distanceBC * consumption1000;
        }else if(weight < 1501){
            resultAB = distanceAB * consumption1500;
            resultBC = distanceBC * consumption1500;
        }else {
            resultAB = distanceAB * consumption2000;
            resultBC = distanceBC * consumption2000;
        }
        if(resultAB > fuel || resultBC > fuel){
            System.out.println("ERROR");
        }else {
            double refueling = fuel - resultAB;
            if(resultBC > refueling){
                refueling = resultBC - refueling;
            }else {
                refueling = 0;
            }
            System.out.printf("%.2f", refueling);
        }

    }
}
