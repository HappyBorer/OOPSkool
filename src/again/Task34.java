package again;

import java.util.Scanner;

/*
Пользователь вводит строку из слов, разделенных одним пробелом. Переставить слова местами так, чтобы
каждое следующее слово начиналось с буквы, которой заканчивается предыдущее слово (существование такого
слова в тестах гарантируется).
Тестовые данные
Sample Input:
trolli emodji road tiger dog insert game
Sample Output:
trolli insert tiger road dog game emodji
 */
public class Task34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().trim().split(" +");
        StringBuilder line = new StringBuilder(words[0]);
        for(int i = 1; i < words.length; i++){
           for(int j = 1; j < words.length; j++){
               if(line.charAt(line.length() - 1) == words[j].charAt(0)){
                   line.append(" ").append(words[j]);
                   break;
               }
           }

        }
        System.out.println(line);
    }
}
