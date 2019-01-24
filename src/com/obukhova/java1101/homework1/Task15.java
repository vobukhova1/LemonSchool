package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 24.01.2019.
 */
//Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.
public class Task15 {
    public static void main(String[] args) {
        double a = 14.5;//cathetus_1
        double b = 10;//cathetus_2
        double c = (int) Math.sqrt(a*a+b*b);//hypotenuse
        double P = a+b+c;//perimetr
        double square = a*b*0.5;
        System.out.println("Cathetus_1 = "+ a);
        System.out.println("Cathetus_2 = " + b);
        System.out.println("Hypothenuse = "+ c);
        System.out.println("Perimetr = "+ P);
        System.out.println("Square = "+ square);

    }
}
