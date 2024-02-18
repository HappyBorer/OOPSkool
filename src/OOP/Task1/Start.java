package OOP.Task1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Start {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Car[] cars = new Car[size];
        for(int i = 0; i < cars.length; i++){
            cars[i] = new Car(input.next(), input.next(), input.nextDouble(), input.nextInt());
        }
        cars[input.nextInt() - 1].setEngineCapacity(input.nextDouble());
        for(Car item: cars){
            System.out.println(item);
        }
        int newIndex = 0;
        int newCar = cars[newIndex].getLife();
        for(int i = 1; i < cars.length;i++){
            if(newCar > cars[i].getLife()){
                newIndex = i;
                newCar = cars[newIndex].getLife();
            }
        }
        System.out.println();
        System.out.println(cars[newIndex]);
    }
}

