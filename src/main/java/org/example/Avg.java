package org.example;

public class Avg{




  public static double getAvgGrade(Student student){

    int sum = 0;
    for (int i = 0; i < student.grades.length; i++) {
      sum = sum + student.grades[i];
    }
    return (double) sum / student.grades.length;


  }
};



