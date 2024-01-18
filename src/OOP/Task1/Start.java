package OOP.Task1;

import java.util.ArrayList;
import java.util.Scanner;
//Борис Бритва 17 2 2200,3 7,8
//Анатолий Пупкин 16 1 40000,3 7,1
//Петор Камушкин 18 3 20030,2 6,5
//Kamushkin Vasilui Speredonovich 34 190 98
public class Start {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Human humanOne = new Human(input.next(), input.next(), input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        input.close();
        humanOne.info();
        System.out.println(humanOne.bodyMassIndex());
    }
}

