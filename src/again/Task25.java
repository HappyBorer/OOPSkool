package again;

import java.util.Scanner;

/*
Введите три строки (могут содержать пробелы). Выведите их в порядке возрастания.
Тестовые данные
Sample Input:

Hello, world!
Hello, sky!
By-by, baby!
Sample Output:

By-by, baby!
Hello, sky!
Hello, world!
 */
public class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strOne = input.nextLine();
        String strTwo = input.nextLine();
        String strThree= input.nextLine();
        input.close();
        String temp;
        if(strOne.compareTo(strTwo) > 0){
           temp = strOne;
           strOne = strTwo;
           strTwo = temp;
        }
        if(strOne.compareTo(strThree) > 0){
            temp = strOne;
            strOne = strThree;
            strThree = temp;
        }
        if(strTwo.compareTo(strThree) > 0){
            temp = strTwo;
            strTwo = strThree;
            strThree = temp;
        }
        System.out.println(strOne);
        System.out.println(strTwo);
        System.out.println(strThree);

    }
}
