package com.obukhova.java1101.homework2;

/**
 * Created by Viktoriia
 * on 31.01.2019.
 */
//Перенести фамилию в конец строки ФИО
public class Task2 {
    public static void main(String[] args) {
        StringBuilder fullName = new StringBuilder("Obukhova Viktoriia Arturivna");
        StringBuilder surname = new StringBuilder();
        for (char c: fullName.toString().toCharArray()) {
            if(c==' '){
                break;
            }
            surname.append(c);
        }
        fullName.delete(0,surname.length());
        fullName.insert(fullName.length(),surname);
        System.out.println(fullName);
    }
}
