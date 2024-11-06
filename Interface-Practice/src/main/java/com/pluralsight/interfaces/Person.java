package com.pluralsight.interfaces;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor to initialize first name, last name, and age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters for firstName, lastName, and age
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Override the compareTo method to compare Person objects
    @Override
    public int compareTo(Person other) {
        // First, compare by last name
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        // If last names are the same, compare by first name
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        // If both first name and last name are the same, compare by age
        return Integer.compare(this.age, other.age);
    }

    // Override toString to display Person objects easily
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}