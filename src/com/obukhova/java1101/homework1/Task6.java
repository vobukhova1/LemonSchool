package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//Напишите метод, который будет увеличивать заданный элемент массива на 10%.
public class Task6 {
    public static void main(String[] args) {
        double [] mass = {1,28,30};
        System.out.println(method(mass,1));
    }
    static double method(double [] mass, int index){
        return (mass[index]*0.1 + mass[index]);
    }
}
