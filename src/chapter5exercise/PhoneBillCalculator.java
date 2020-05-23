package chapter5exercise;

import java.util.Scanner;

public class PhoneBillCalculator {
    private static double planFee;
    private static final double costPerMinute = .25;
    private static double overage;
    private static double tax;
    private static double total;
    private static double subtotal;


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");
        planFee = scanner.nextDouble();

        System.out.println("Enter overge minutes:");
        double min = scanner.nextDouble();

        scanner.close();

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        overage = min * costPerMinute;
        System.out.println("Overage: $" + overage);
        tax = calculateTax();
        System.out.println("Tax: $" + String.format("%.2f",tax));
        total = calculateTotal();
        System.out.println("Total: $" + String.format("%.2f",total));
    }

    private static double calculateTax(){
        subtotal = planFee + overage;
        tax = ((subtotal)*15)/100;
        return tax;
     }

     private static double calculateTotal(){
        total = subtotal + tax;
        return total;
     }
}

