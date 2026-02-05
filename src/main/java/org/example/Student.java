package org.example;

import lombok.Getter;
import lombok.Setter;

public class Student {
    @Setter
    @Getter
   public String name;
    @Getter
    @Setter
   public int age;

    @Setter
    @Getter
   public int[] grades ;

    public Student(String name, int age, int[] grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    }

