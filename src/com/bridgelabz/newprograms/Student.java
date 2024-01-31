package com.bridgelabz.newprograms;

public class Student {
	
	private String name;
    private int age;
    private int ID;

    // Constructor
    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // Method to print name and age
    public void printNameAndAge() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter method for ID
    public int getID() {
        return ID;
    }

    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student1 = new Student("John Doe", 20, 12345);

        // Calling the method to print name and age
        student1.printNameAndAge();
    }

}
