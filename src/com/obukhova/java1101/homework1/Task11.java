package com.obukhova.java1101.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Viktoriia
 * on 24.01.2019.
 */
//Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.
public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"*"+n+"="+(i*n));
        }
    }
}
