package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//В переменной n хранится натуральное двухзначное число. Создайте программу, вычисляющую и выводящую на экран
//сумму цифр числа n.
public class Task2 {
    public static void main(String[] args) {
        int n = 87;
        int result = n/10 + n%10;
        System.out.println(result);
    }
}
