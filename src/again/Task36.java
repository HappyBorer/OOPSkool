package again;

import java.util.Scanner;

/*
 Пользователь вводит строку, в которой среди других символов содержатся символы цифр. Сформируйте строку, которая
 "представляет" сумму этих цифр. Выведите полученную строку на консоль.
Если в исходной строке цифр нет, то должно быть выведено ERROR.
Р.S.  Преобразовать символ в число можно вычитанием кода символа '0'
Тестовые данные
Sample Input:
ab34c#5i02k tolkien25
Sample Output:
3+4+5+0+2+2+5=21
 */
public class Task36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringBuilder line = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            int number = str.charAt(i) - '0';
            if(number>=0 && number < 11){
                sum += number;
                line.append(number).append("+");
            }
        }
        if(line.isEmpty()){
            System.out.println("ERROR");
        }else {
            line.replace(line.lastIndexOf("+") , line.lastIndexOf("+")+1,"=").append(sum);
            System.out.println(line);
        }
    }
}
