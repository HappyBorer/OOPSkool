package OOP.Task1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

//Бритва Борис Василивич 1999 9660580019
//Пупкин Анатолий Петрович 1980 9994562345
//Камушкин Петр Спиридонович 1994 9064562578
//Kamushkin Vasilui Speredonovich 34 190 98
public class Start {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Thing wire = new Thing("wire", new Material("steel", 7850), 0.03);
        wire.show();
        wire.setMaterial(new Material("copper", 8500));
        wire.setVolume(input.nextDouble());
        wire.show();
    }
}

