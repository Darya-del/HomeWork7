package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

    public static void main(String[] args) {

        Person p1 = new Person("Bob", "Brown", Gender.MALE);
        Person p2 = new Person("Tom", "Trump", Gender.MALE);
        Person p3 = new Person("Tina", "Jackson", Gender.FEMALE);
        Person p4 = new Person("Jack", "Harli", Gender.MALE);
        Person p5 = new Person("Andrew", "Black", Gender.MALE);

        Map<Person, Integer> Persons = new HashMap<>();
        Persons.put(p1, 1);
        Persons.put(p2, 2);
        Persons.put(p3, 3);
        Persons.put(p4, 4);
        Persons.put(p5, 5);

        outputCollection(Persons);

        int size = Persons.size();
        System.out.println("Общее количество элементов в Map:" + size);

    }

    public static void outputCollection(Map<Person, Integer> map) {

        System.out.println("Вывод: ");

        for (Map.Entry<Person, Integer> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }

        System.out.println();


    }
}
