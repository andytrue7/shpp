package com.shpp.p2p.cs.atrubchanynov.assignment2;

import java.util.Scanner;

/**
 * A class to find possible square roots in a square equation based on the input values
 */
public class Assignment2Part1 {

    static double squareRoot1;
    static double squareRoot2;

    public static void main(String[] args) {
        SquareRootRequest squareRootRequest = new SquareRootRequest();
        SquareRootResponse squareRootResponse = new SquareRootResponse();

        double a = squareRootRequest.getA();
        double b = squareRootRequest.getB();
        double c = squareRootRequest.getC();

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
 * Describes a request
 */
class SquareRootRequest {
    private Scanner sc;
    private double a;
    private double b;
    private double c;

    public SquareRootRequest() {
        sc = new Scanner(System.in);

        this.setA(sc);
        this.setB(sc);
        this.setC(sc);
    }

    public double getA() {
        return a;
    }

    public void setA(Scanner sc) {
        System.out.print("Please enter a: ");
        this.a = sc.nextDouble();
    }

    public double getB() {
        return b;
    }

    public void setB(Scanner sc) {
        System.out.print("Please enter b: ");
        this.b = sc.nextDouble();
    }

    public double getC() {
        return c;
    }

    public void setC(Scanner sc) {
        System.out.print("Please enter c: ");
        this.c = sc.nextDouble();
    }
}

/**
 * Describes a response
 */
class SquareRootResponse {
    public void display(double squareRoot) {
        System.out.println("There is one root: " + squareRoot);
    }

    public void display(double squareRoot1, double squareRoot2) {
        System.out.println("There are two roots: " + squareRoot1 + " and " + squareRoot2);
    }

    public void display() {
        System.out.println("There are no real roots");
    }
}
