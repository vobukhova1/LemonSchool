package com.obukhova.java1101.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//Пользователь вводит задает расстояние до места назначения (N) и время, за которое
//нужно доехать (T). Вычислить скорость (км/ч), с которой нужно ехать.
public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the distance: ");
        int distance = Integer.parseInt(reader.readLine());
        System.out.print("Enter time: ");
        int time = Integer.parseInt(reader.readLine());
        int speed = distance/time;
        System.out.println("Speed = " + speed + "km/h");

    }
}
