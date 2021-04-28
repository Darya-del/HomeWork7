package com.company;

import java.util.List;
import java.util.ArrayList;

    public class Array {

        public static void main(String[] args) {

            Person p1 = new Person("Bob", "Brown", Gender.MALE);
            Person p2 = new Person("Tom", "Trump", Gender.MALE);
            Person p3 = new Person("Tina", "Jackson", Gender.FEMALE);
            Person p4 = new Person("Jack", "Harli", Gender.MALE);
            Person p5 = new Person("Andrew", "Black", Gender.MALE);

            ArrayList<Person> Persons = new ArrayList<>();
            Persons.add(p1);
            Persons.add(p2);
            Persons.add(p3);
            Persons.add(p4);
            Persons.add(p5);

            outputCollection(Persons);

            int size = Persons.size();

            System.out.println("Общее количество элементов в коллекции:" + size);
        }

        public static void outputCollection(List<Person> list) {
            System.out.println("Вывод: ");

            for (Person number : list) {
                System.out.print(number + " " + '\n');
            }

            System.out.println();
        }


    }

