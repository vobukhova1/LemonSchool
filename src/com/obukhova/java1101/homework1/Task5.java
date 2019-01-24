package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 24.01.2019.
 */
//Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
public class Task5 {
    public static void main(String[] args) {
        double G = 0.17;//the force of gravity
        double weight = 50;//weight of your body
        double moonweight = G*weight;
        System.out.println(moonweight);
    }
}
