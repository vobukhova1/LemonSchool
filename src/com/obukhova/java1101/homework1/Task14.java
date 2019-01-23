package com.obukhova.java1101.homework1;

/**
 * Created by Viktoriia
 * on 20.01.2019.
 */
//Напишите метод переводящий гривны в доллары по заданному курсу. В качестве
//аргументов передайте кол-во гривен и курс.
public class Task14 {
    public static void main(String[] args) {
        double money=205;
        double rate = 27.96;
        System.out.println(converter(money,rate));
    }

    static double converter(double money, double rate){
        return money*rate;
    }
}
