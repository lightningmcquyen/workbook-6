package com.pluralsight.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a List of Person objects
        List<Person> myFamily = new ArrayList<>();

        // Add Person objects to the list
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        // Sort the list using Collections.sort() (relies on compareTo)
        Collections.sort(myFamily);

        // Display the sorted list
        for (Person person : myFamily) {
            System.out.println(person);

        }
    }
}