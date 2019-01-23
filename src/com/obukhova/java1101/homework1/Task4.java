package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//В переменной n хранится натуральное трехзначное число. Создайте программу, вычисляющую и выводящую на экран
//сумму цифр числа n.
public class Task4 {
    public static void main(String[] args) {
        int n = 359;
        int result = 0;
        while (n != 0){
            result+=n%10;
            n/=10;
        }
        result+=n;
        System.out.println(result);
    }
}
