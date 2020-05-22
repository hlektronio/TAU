package chapter3exercise;

import java.util.Scanner;

public class ChangeForADollaraGame {

    public  static  void main (String args[]){

        double cent = .01;
        double fiveCent = .05;
        double tenCent = .10;
        double twentyCent = .20;
        double fiftyCent = .5;
        int dollar = 1;

        //ask user to enter cents
        System.out.println("Please insert how many cents");
        Scanner scanner= new Scanner(System.in);
        int numberOfCents = scanner.nextInt();
        double centTotal = numberOfCents * cent;
        System.out.println(centTotal);


        //ask user to enter 5c
        System.out.println("Please insert how many 5cents");
        int numberOfFiveCents = scanner.nextInt();
        double fiveCentTotal = numberOfFiveCents * fiveCent;
        System.out.println(fiveCentTotal);

        //ask user to enter 10c
        System.out.println("Please insert how many 10cents");
        int numberOfTenCents = scanner.nextInt();
        double tenCentTotal = numberOfTenCents * tenCent;
        System.out.println(tenCentTotal);


        //ask user to enter 20c
        System.out.println("Please insert how many 20cents");
        int numberOfTwentyCents = scanner.nextInt();
        double twentyCentTotal = numberOfTwentyCents * twentyCent;
        System.out.println(twentyCentTotal);


        //ask user to enter 50c
        System.out.println("Please insert how many 50cents");
        int numberOfFiftyCents = scanner.nextInt();
        double fiftyCentTotal = numberOfFiftyCents * fiftyCent;
        System.out.println(fiftyCentTotal);

        scanner.close();

        //calculate and answer
        double total = centTotal+fiveCentTotal+tenCentTotal+twentyCentTotal+fiftyCentTotal;
        System.out.println(total);
        if (total == dollar){
            System.out.println("Congrats! You won!");
        }
        else if (total<dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry. You were "+ String.format("%.2f",amountShort)+" cents short");
        }
        else if(total>dollar){
            double amountHigh = total - dollar;
            System.out.println("Sorry. You were "+ String.format("%.2f",amountHigh)+" cents high");
        }
    }
}
