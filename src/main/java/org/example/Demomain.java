package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Taskwork.loadStatusRosticks;

public class Demomain {
    public static void main(String[] args) {

        loadStatusRosticks();

        int[] numb = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == 5) {
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
        for (String s : lastname) {
            System.out.println(s);
        }
    }
}