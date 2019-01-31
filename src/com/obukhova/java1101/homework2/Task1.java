package com.obukhova.java1101.homework2;

/**
 * Created by Viktoriia
 * on 31.01.2019.
 */
//Вывести десятичные коды символов своего ФИО
public class Task1 {
    public static void main(String[] args) {
        String lastName = "Obukhova";
        String name = "Viktoriia";
        String middleName = "Arturivna";

        System.out.println(lastName + " - " + toAscii(lastName));
        System.out.println(name + " - " + toAscii(name));
        System.out.println(middleName + " - " + toAscii(middleName));

    }
    static StringBuilder toAscii(String s){
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            sb.append((int)c);
            sb.append('.');
        }
        return sb;
    }
}
