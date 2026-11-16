package com.shpp.p2p.cs.atrubchanynov.assignment2;

import java.util.Scanner;

/**
 * Contains methods to find square roots in a square equation based on the input values
 */
public class Assignment2Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = getCoefficient(sc, "Please enter a: ");
        double b = getCoefficient(sc,  "Please enter b: ");
        double c = getCoefficient(sc,  "Please enter c: ");

        calcSquareRoots(a, b, c);
    }

    /**
     * Gets the equation coefficient from the user input
     *
     * @param sc The scanner object
     * @param prompt The text showing a user what action expected
     * @return the value from the user input as double
     */
    private static double getCoefficient(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

    /**
     * Calculates square roots of an equation based on coefficients and discriminant.
     * Prints the result to the console
     *
     * @param a first coefficient
     * @param b second coefficient
     * @param c third coefficient
     */
    private static void calcSquareRoots(double a, double b, double c) {
        double squareRoot1;
        double squareRoot2;
        double discriminant = calcDiscriminant(a, b, c);

        if (discriminant > 0) {
            squareRoot1 =  calcRootOne(discriminant, a, b);
            squareRoot2 = calcRootTwo(discriminant, a, b);
            display(squareRoot1, squareRoot2);
        } else if (discriminant == 0){
            squareRoot1 = calcRootOne(discriminant, a, b);
            display(squareRoot1);
        } else {
            display();
        }
    }

    /**
     * Calculates a discriminant
     * @param a first coefficient
     * @param b second coefficient
     * @param c third coefficient
     * @return the result of applied formula as a double
     */
    private static double calcDiscriminant(double a,double b,double c) {
        return b*b - 4*a*c;
    }

    /**
     * Calculates the first root
     * @param discriminant discriminant
     * @param a            first coefficient
     * @param b            second coefficient
     * @return the result of applied formula as a double
     */
    private static double calcRootOne(double discriminant, double a, double b){
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    /**
     * Calculates the second root
     * @param discriminant discriminant
     * @param a            first coefficient
     * @param b            second coefficient
     * @return the result of applied formula as a double
     */
    private static double calcRootTwo(double discriminant, double a, double b){
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    /**
     * Displays the single root
     *
     * @param squareRoot a found root to display
     */
    private static void display(double squareRoot) {
        System.out.println("There is one root: " + squareRoot);
    }

    /**
     * Displays both roots
     *
     * @param squareRoot1 the first root to display
     * @param squareRoot2 the second root to display
     */
    private static void display(double squareRoot1, double squareRoot2) {
        System.out.println("There are two roots: " + squareRoot1 + " and " + squareRoot2);
    }

    /**
     * Displays no roots found
     */
    private static void display() {
        System.out.println("There are no real roots");
    }
}