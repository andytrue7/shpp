package com.shpp.p2p.cs.atrubchanynov.assignment2;

import java.util.Scanner;

/**
 * Contains methods to find square roots in a square equation based on the input values
 */
public class Assignment2Part1 {

    public static void main(String[] args) {
        SquareRootRequest squareRootRequest = new SquareRootRequest();
        SquareRootResponse squareRootResponse = new SquareRootResponse();

        double a = squareRootRequest.getA();
        double b = squareRootRequest.getB();
        double c = squareRootRequest.getC();

        calcSquareRoots(a, b, c, squareRootResponse);

    }

    /**
     * Calculates square roots of an equation based on coefficients and discriminant.
     * Prints the result to the console
     *
     * @param a first coefficient
     * @param b second coefficient
     * @param c third coefficient
     * @param squareRootResponse response class to display found roots
     */
    private static void calcSquareRoots(double a, double b, double c, SquareRootResponse squareRootResponse) {
        double squareRoot1;
        double squareRoot2;
        double discriminant = calcDiscriminant(a, b, c);

        if (discriminant > 0) {
            squareRoot1 =  calcRootOne(discriminant, a, b);
            squareRoot2 = calcRootTwo(discriminant, a, b);
            squareRootResponse.display(squareRoot1, squareRoot2);
        } else if (discriminant == 0){
            squareRoot1 = calcRootOne(discriminant, a, b);
            squareRootResponse.display(squareRoot1);
        } else {
            squareRootResponse.display();
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
}

/**
 * Contains scanner initialization and get/set methods to retrieve user data
 */
class SquareRootRequest {
    private double a;
    private double b;
    private double c;

    /**
     * Contains scanner initialization and pass it to setters
     */
    public SquareRootRequest() {
        Scanner sc = new Scanner(System.in);

        this.setA(sc);
        this.setB(sc);
        this.setC(sc);
    }

    /**
     * Returns the coefficient 'a' entered by a user
     * @return coefficien 'a' as double
     */
    public double getA() {
        return a;
    }

    /**
     * Asks to enter a coefficient 'a' and store it to a class field
     *
     * @param sc the Scanner object
     */
    public void setA(Scanner sc) {
        System.out.print("Please enter a: ");
        this.a = sc.nextDouble();
    }

    /**
     * Returns the coefficient 'b' entered by a user
     * @return coefficien 'b' as double
     */
    public double getB() {
        return b;
    }

    /**
     * Asks to enter a coefficient 'b' and store it to a class field
     * @param sc the Scanner object
     */
    public void setB(Scanner sc) {
        System.out.print("Please enter b: ");
        this.b = sc.nextDouble();
    }

    /**
     * Returns the coefficient 'c' entered by a user
     * @return coefficien 'c' as double
     */
    public double getC() {
        return c;
    }

    /**
     * Asks to enter a coefficient 'c' and store it to a class field
     * @param sc the Scanner object
     */
    public void setC(Scanner sc) {
        System.out.print("Please enter c: ");
        this.c = sc.nextDouble();
    }
}

/**
 * Contains methods to display found roots
 */
class SquareRootResponse {

    /**
     * Displays the single root
     *
     * @param squareRoot a found root to display
     */
    public void display(double squareRoot) {
        System.out.println("There is one root: " + squareRoot);
    }

    /**
     * Displays both roots
     *
     * @param squareRoot1 the first root to display
     * @param squareRoot2 the second root to display
     */
    public void display(double squareRoot1, double squareRoot2) {
        System.out.println("There are two roots: " + squareRoot1 + " and " + squareRoot2);
    }

    /**
     * Displays no roots found
     */
    public void display() {
        System.out.println("There are no real roots");
    }
}
