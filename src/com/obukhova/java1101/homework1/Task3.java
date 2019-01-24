package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 24.01.2019.
 */
// В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу,
// округляющую число n до ближайшего целого и выводящую результат на экран.
public class Task3{
    public static void main(String[] args) {
        double n = 5.81;
        double remainder = n % (int)n;
        int result = 0;
        if(remainder>=0.5){
            result = (int)n+1;
        } else result= (int)n;
        System.out.println(result);
    }
}

