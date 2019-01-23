package com.obukhova.java1101.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на
//консоль.(*)
public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Your name is "+name);
    }
}
