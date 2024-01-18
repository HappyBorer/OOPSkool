package again;

import java.util.Scanner;

/*
Пользователь вводит строку из слов, разделенных пробелами.  Заменить все слова, которые содержат букву z на
слово "ERROR". Также удалить все лишние пробелы в начале и в конце строки. Между словами оставить ровно один пробел.
Тестовые данные
Sample Input:
   mama   zlobno   myla    puzzle  and    ramy
Sample Output:
mama ERROR myla ERROR and ramy
 */
public class Task33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().trim().split(" +");
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            if(words[i].contains("z")){
                line.append("ERROR");
            }else {
                line.append(words[i]);
            }
            if(i != words.length - 1){
                line.append(" ");
            }
        }
        System.out.println(line);
    }
}
