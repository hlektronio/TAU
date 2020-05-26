package chapter8exercise;

import java.util.Scanner;

public class PasswordValidator {

    static String password;
    static String username;
    static String oldPassword;
    static boolean isValid;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("Enter your username:");
        username = scanner.next();
        System.out.println("Enter your password:");
        oldPassword = scanner.next();
        System.out.println("Enter new password:");
        password = scanner.next();
        checkNewPassword();

        while (!isValid) {
            System.out.println("Enter new password:");
            password = scanner.next();
            checkNewPassword();
        }
        if (isValid) {
            System.out.println("Success!");
        }
    }

    public static boolean checkNewPassword() {

        if (password.length() < 8) {
            System.out.println("*Your password should be at least 8 characters long.");
            return isValid = false;

        } else if (password.equals(password.toLowerCase())) {
            System.out.println("*Your password should contain at least one uppercase letter.");
            return isValid = false;

        } else if (password.matches("[a-zA-Z0-9 ]*")) {
            System.out.println("*Your password should contain at least one special character.");
            return isValid = false;

        } else if (password.toLowerCase().contains(username.toLowerCase())) {
            System.out.println("*Your password should not contain your username.");
            return isValid = false;

        } else if (password.toLowerCase().equals(oldPassword.toLowerCase())) {
            System.out.println("*You cannot use the same password.");
            return isValid = false;

        } else {
            return isValid = true;
        }
    }
}








