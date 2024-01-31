package com.bridgelabz.newprograms;

public class Employee {
	
	private String name;
    private double salary;
    private int ID;

    // Constructor
    public Employee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12; // Assuming a standard work year of 12 months
    }

    // Method to print name and salary
    public void printNameAndSalary() {
        System.out.println("Name: " + name);
        System.out.println("Salary Rs: " + salary);
    }

    // Getter method for ID
    public int getID() {
        return ID;
    }

    public static void main(String[] args) {
        // Creating an instance of the Employee class
        Employee employee1 = new Employee("Alice Smith", 50000.0, 98765);

        employee1.printNameAndSalary();

        double yearlySalary = employee1.calculateYearlySalary();
        System.out.println("Yearly Salary Rs: " + yearlySalary);
    }

}
