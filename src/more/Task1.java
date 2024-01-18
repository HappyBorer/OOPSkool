package more;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


// 9733 - ★; 9734- ☆
public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][][][] colors = {
                {
                        {
                                {"RED", "GREEN", "BLUE"},
                                {"GREEN", "RED", "BLUE"}
                        },
                        {
                                {"ORANGE", "GREEN", "WHITE"},
                                {"BLACK", "INDIGO", "BLUE"}
                        }
                },
                {
                        {
                                {"SKY BLUE", "ALMOND", "AQUA"},
                                {"APPLE GREEN", "PINK", "BLUE GREEN"}
                        },
                        {
                                {"VIOLET", "BRASS", "GREY"},
                                {"BROWN", "INDIG" +
                                        "O", "CHERRY"}
                        }
                }
        };

        System.out.println(colors[1][0][1][0]);  // 1

        System.out.println(colors[0][1][0][1]);  // 2

        System.out.println(colors[0][0][0][2]);  // 3

        System.out.println(colors[1][1][1][2]);  // 4

        System.out.println(colors[0][0][0][0]);  // 5

        System.out.println(colors[1][1][1][1]);  // 6
    }
    static void fillingArray(ArrayList<Integer> numbers){
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }
    }
    static int findIndex(int[] array, int number){
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                return i;
            }
        }
        return -1;
    }
    static void insertionSort(int[] number){
        for (int i = 1; i < number.length; i++) {
            int value = number[i];
            int j = i - 1;
            while(j >= 0 && value < number[j]){
                number[j+1] = number[j];
                j--;
            }
            number[j+1] = value;
        }
    }
    static void insertionSort(String[] str){
        for (int i = 1; i < str.length; i++) {
            String value = str[i];
            int j = i - 1;
            while(j >= 0 && value.compareTo(str[j]) > 0){
                str[j+1] = str[j];
                j--;
            }
            str[j+1] = value;
        }
    }
    static void capitalizeWord(String str){
        String[] arrayStr = str.split(" +");
        char[] chars = new char[arrayStr[1].length()];
        arrayStr[1].getChars(0, arrayStr[1].length(), chars, 0);
        chars[0] = Character.toUpperCase(chars[0]);
        arrayStr[1] = String.valueOf(chars);
        System.out.println(String.join(" ", arrayStr));
    }
}
