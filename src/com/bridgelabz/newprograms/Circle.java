package com.bridgelabz.newprograms;

import java.util.Scanner;

public class Circle {
	
	private double radius;

    // Created constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods to calculate the area of the circle, circumference of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double userRadius = scanner.nextDouble();

        // Creating an instance of the Circle class with user input
        Circle myCircle = new Circle(userRadius);
        
        System.out.println("Radius of the circle: " + myCircle.getRadius());

        double area = myCircle.calculateArea();
        System.out.println("Area of the circle: " + area);

        double circumference = myCircle.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);
        scanner.close();
    }

}
