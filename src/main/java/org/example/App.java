/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is the principal amount?");
        double principal = input.nextDouble();
        System.out.println("What is the rate (without the % sign)?");
        double interestRate = input.nextDouble();
        System.out.println("What is the number of years?");
        double numYears = input.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        double timesCompounded = input.nextDouble();

        //calculations
        double interestRateDecimal = interestRate/100;
        double totalAmount = principal * (Math.pow( (1 + interestRateDecimal/timesCompounded), (timesCompounded * numYears) ));

        //output
        System.out.printf("$%.2f invested at %.2f%% for %.2f years compounded %.1f times per year is $%.2f.", principal, interestRate, numYears, timesCompounded, totalAmount);
    }
}
