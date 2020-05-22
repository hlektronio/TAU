package chapter2exercise;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]){

        //ask season of year

        System.out.println("Please tell what season it is");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //ask for a number
        System.out.println("Please give me a number");
        int number = scanner.nextInt();

        //output
        System.out.println("On a "+season+" day, I drink a minimum of "+number+ " cups of coffee");
    }
}
