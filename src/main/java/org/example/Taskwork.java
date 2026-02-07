package org.example;

import java.util.Random;

public class Taskwork {

    public static void loadStatusRosticks() {
        Random random = new Random();
        int iteration = 0;

        while (iteration < 10) {
            int load = random.nextInt(101);
            System.out.println("Текущая нагрузка: " + load + "%");

            if (load > 85) {
                System.out.println("Крылышки в опасности! Нагрузка - " + load + "%");
            }

            iteration++;
        }
    }
}