package com.bl.java.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner sc = new Scanner(System.in);

    // Method to check first name is valid or not
    public static void firstName()
    {
        System.out.println("Enter Your First Name: ");
        String firstName = sc.nextLine();

        // Regex pattern: Start with a capital letter and have a minimum of 3 characters
        if (Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName))
        {
            System.out.println("First Name is Valid");
        }
        else
        {
            System.out.println("Invalid first name! Please enter a name starting with capital letter and with a minimum 3 characters.");
        }

    }

    // Method to check last name is valid or not
    public static void lastName()
    {
        System.out.println("Enter Your Last Name: ");
        String lastName = sc.nextLine();

        // Regex pattern: Start with a capital letter and have a minimum of 3 characters
        if (Pattern.matches("^[A-Z][a-zA-Z]{2,}$", lastName))
        {
            System.out.println("Last Name is Valid");
        }
        else
        {
            System.out.println("Invalid last name! Please enter a name starting with capital letter and with a minimum 3 characters.");
        }

    }

    // Method to check email is valid or not
    public static void validateEmail()
    {
        System.out.println("Enter Your Email Address");
        String email = sc.nextLine();

        // Regex pattern for email validation
        if (Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$", email))
        {
            System.out.println("Email Address is Valid");
        }
        else
        {
            System.out.println("Email is invalid. Please enter a valid email address.");
        }
    }

    // Method to check mobile number is valid or not
    public static void validateMobileNum()
    {
        System.out.println("Enter Your Mobile Number with Country Code");
        String mob = sc.nextLine();

        // Regex pattern for mobile number validation
        if (Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mob))
        {
            System.out.println("Mobile Number is Valid");
        }
        else
        {
            System.out.println("Mobile number is invalid. Please follow the format: CC XXXXXXXXXX.");
        }
    }

    // Method to check password is valid or not
    // Rule 4 - Should have at least 1 special character
    public static void validatePassword()
    {
        System.out.println("Enter Your Password");
        String password = sc.nextLine();

        // Regex pattern for password validation
        if (Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).{8,}$", password))
        {
            System.out.println("Your Password is Valid");
        }
        else
        {
            System.out.println("Password is invalid. It must have at least 8 characters and contain at least 1 uppercase letter and at least 1 numeric number and exactly 1 special character.");
        }

    }

    public static void main(String[] args)
    {
        // Calling the method
        firstName();
        lastName();
        validateEmail();
        validateMobileNum();
        validatePassword();
    }
}
