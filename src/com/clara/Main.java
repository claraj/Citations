package com.clara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Program to figure out how much money was spend on bus rides
        //Ask for number of regular rides and regular bus fare, and ask for rush hour rides and rush hour fares
        //calculate total spent

        //I worked with Alex in the learning center to understand scanner better and turn input into double and float
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times did you ride the bus during regular hours?");
        int regularRides = Integer.parseInt(scanner.nextLine());
        System.out.println("How much is the regular bus fare?");
        double regularFare = Double.parseDouble(scanner.nextLine());

        System.out.println("How many times did you ride the bus during regular hours?");
        int rushHourRides = Integer.parseInt(scanner.nextLine());
        System.out.println("How much is the regular bus fare?");
        double rushHourFare = Double.parseDouble(scanner.nextLine());


        double regularHourSpend = calculate(regularRides, regularFare);
        double rushHourSpend = calculate(rushHourRides, rushHourFare);

        displayBusData(regularHourSpend, rushHourSpend);

    }

    //I worked together with Julie (another student) on this in class
    private static double calculate(int noRides, double farePrice) {
        return noRides * farePrice;
    }


    public static void displayBusData(double regular, double rush) {
        //Needed some help with String formatting and displaying 2 decimal places so asked a question on Stack Overflow,
        //Link here: https://stackoverflow/examplelink_replacewithactuallink

        System.out.println(String.format("You spent $%.2f on regular fares and $%.2f on rush hour fares", regular, rush));
        System.out.println(String.format("Total spend on bus rides was $%.2f", (regular+rush)));
    }
}
