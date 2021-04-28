package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {
        Person p1 = new Person("Bob", "Brown", Gender.MALE);
        Person p2 = new Person("Bob", "Brown", Gender.MALE);
        Person p3 = new Person("Tina", "Jackson", Gender.FEMALE);
        Person p4 = new Person("Jack", "Harli", Gender.MALE);
        Person p5 = new Person("Jack", "Harli", Gender.MALE);

        Set<Person> Persons = new HashSet<>();
        Persons.add(p1);
        Persons.add(p2);
        Persons.add(p3);
        Persons.add(p4);
        Persons.add(p5);

        outputCollection(Persons);

        int size = Persons.size();
        System.out.println("Общее количество элементов в Set:" + size);

    }

    public static void outputCollection(Set<Person> set) {
        System.out.println("Вывод: ");

        for (Person number : set) {
            System.out.println(number + " ");
        }

        System.out.println();
    }
}
