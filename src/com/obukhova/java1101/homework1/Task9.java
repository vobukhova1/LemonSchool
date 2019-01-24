package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 24.01.2019.
 */
//Сделайте программу, которая будет проверять является ли число типа double целым.
public class Task9 {
    public static void main(String[] args) {
        double n = 3.7;
        double remainder = n % (int)n;
        String result = (remainder==0) ? "Целое" : "Вещественное";
        System.out.println(result);
    }
}
