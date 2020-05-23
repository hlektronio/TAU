package chapter5exercise;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double planFee;
    static double costPerMinute = .25;
    static double min;
    static double overage;
    static double tax;
    static double total;
    static double subtotal;


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");
        planFee = scanner.nextDouble();

        System.out.println("Enter overge minutes:");
        min = scanner.nextDouble();

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        overage = min * costPerMinute;
        System.out.println("Overage: $" + overage);
        tax = calculateTax();
        System.out.println("Tax: $" + String.format("%.2f",tax));
        total = calculateTotal();
        System.out.println("Total: $" + String.format("%.2f",total));
    }

    public static double calculateTax(){
        subtotal = planFee + overage;
        tax = ((subtotal)*15)/100;
        return tax;
     }

     public static double calculateTotal(){
        total = subtotal + tax;
        return total;
     }
}

