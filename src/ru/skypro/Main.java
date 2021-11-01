package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        String firstName = "Иван";
        String secondName = "Иванов";
        String lastName = "Иванович";
        String answer = secondName + " " + firstName + " " + lastName;
        System.out.println( "ФИО сотрудника - " + secondName + " " + firstName + " " + lastName);
        System.out.println("ФИО сотрудника - " + answer);
        System.out.println();

        // Задание №2
        System.out.println("Задание №2");
        String fullName = "Иванов Иван Иванович";
        System.out.println(fullName.toUpperCase(Locale.ROOT));

        // Задание №3
        System.out.println();
        System.out.println("Задание №3");
        String fullName2 = "Иванов Иван Иванович";
        System.out.println("Данные для сотрудников административного отдела " + fullName.replace(" ",";"));

        // Задание №4
        System.out.println();
        System.out.println("Задание №4");
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "е");
        fullName3 = fullName3.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);



    }
}
