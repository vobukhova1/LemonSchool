package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 24.01.2019.
 */
//Дано значение температуры в градусах Цельсия. Вывести температуру  в градусах Фаренгейта.
public class Task16 {
    public static void main(String[] args) {
        double temperatureCelc = 32.0;
        double temperatureFareng = temperatureCelc * 9/5 + 32;
        System.out.println("temperatureCelc = " + temperatureCelc);
        System.out.println("temperatureFareng = "+temperatureFareng);
    }
}
