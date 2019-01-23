package com.obukhova.java1101.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//Напишите программу, которая будет считать количество часов, минут и секунд в n-ном
//количестве суток.
public class Task13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of days: ");
        int n = Integer.parseInt(reader.readLine());
        int hours = n*24;
        int minutes = hours*60;
        int seconds = minutes*60;
        System.out.println("Number of hours: " + hours);
        System.out.println("Number of minutes: " + minutes);
        System.out.println("Number of seconds: " + seconds);

    }
}
