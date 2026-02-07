package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.Taskwork.loadStatusRosticks;

public class Main {
    public static void changeName(Lead l) {
        l.setName("Инженер");
    }

    public static String dayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверное число. Введите от 1 до 7";
        };
    }

    public static String[] filterLong(String[] parametrs) {
        int count = 0;
        for (String str : parametrs) {
            if (str.length() > 5) {
                count++;
            }
        }


        String[] result = new String[count];
        int index = 0;

        for (String s : parametrs) {
            if (s.length() > 5) {
                result[index++] = s;
            }
        }

        return result;

    }

    public static void main(String[] args) {


        int[] numb = {1,2,3,4,5,6,7};
        for (int i = 0; i < numb.length; i ++){
           if (numb[i]==5){
               break;
           }
            System.out.println(numb[i]);
        }


        List<String> lastname = new ArrayList<>();
        lastname.add("rezak");
        lastname.add("Ivanov");
        lastname.add("Sidorov");
        lastname.add("Sokolov");
        lastname.add("Fedorov");
        lastname.add("Putin");
        lastname.add("Smirnov");
        lastname.add("Petrov");
        lastname.add("Philipov");
        lastname.add("Vinogradov");
        for (String s : lastname){
            System.out.println(s);
        }
        loadStatusRosticks();



        Car Ferrari = new Car("Ferrari", "SportCar", 2024);
        Ferrari.printCarInfo();
        Car Mersedes = new Car("Mersedes", "GLK", 2023);
        Mersedes.printCarInfo();
        Car BMW = new Car("BMW", "M5", 2022);
        BMW.printCarInfo();

        Lead AQA = new Lead("AQA");
        System.out.println("До вызова метода :" + AQA.getName());
        changeName(AQA);
        System.out.println("После вывзова метода" + AQA.getName());

        String[] card = new String[]{"One", "Two", "Free", "For", "Five", "Sixxxxxxxxx"};

        System.out.println(Arrays.toString(filterLong(card)));


        Student student = new Student("Anna", 24, new int[]{7, 8, 9, 12, 7});
        Student student1 = new Student("Pavel", 28, new int[]{7, 8, 3, 2, 1});
        Student student2 = new Student("Vika", 21, new int[]{4, 3, 2, 5, 6});

        double avegers1 = Avg.getAvgGrade(student);
        double avegers2 = Avg.getAvgGrade(student1);
        double avegers3 = Avg.getAvgGrade(student2);
        System.out.println("Средний балл :" + avegers1);
        System.out.println("Средний балл :" + avegers2);
        System.out.println("Средний балл :" + avegers3);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        System.out.println("Студенты со средним баллом > 4.1:");

        {
            double avg = Avg.getAvgGrade(students.get(0));

            if (avg > 4.1) {
                System.out.println(students.get(0).name + " (средний: " + avg + ")");
            }
        }
        {
            double avg = Avg.getAvgGrade(students.get(1));

            if (avg > 4.1) {
                System.out.println(students.get(1).name + " (средний: " + avg + ")");
            }
        }
        {
            double avg = Avg.getAvgGrade(students.get(2));

            if (avg > 4.1) {
                System.out.println(students.get(2).name + " (средний: " + avg + ")");
            }

            System.out.println(dayOfWeek(3));

            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);
            int max = numbers.get(0);
            for (Integer number : numbers) {
                if (number > max) {
                    max = number;}



            }
            System.out.println("Максимальное число : " + max);
        }
    }


}










