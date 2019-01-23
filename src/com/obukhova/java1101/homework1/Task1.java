package com.obukhova.java1101.homework1;
/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//В переменных q и w хранятся два натуральных числа. Создайте программу выводящюю на экран результат
//деления q и w с остатком.
public class Task1 {

    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        int result = q / w;
        int remainder = q % w;

        System.out.println("Результат деления: " + q + "/" + w + " = " + result + " и " + remainder + " в остаткe.");
    }
}
