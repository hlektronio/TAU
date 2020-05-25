package chapter7exercise;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DayFinder {

    public static void main(String args[]){

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Give me a number to tell you what day it is:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        System.out.println("The day is: " + days[(input-1)]);
    }
}
