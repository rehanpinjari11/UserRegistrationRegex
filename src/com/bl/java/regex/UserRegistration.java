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
    public static void main(String[] args)
    {
        // Calling the method
        firstName();
        lastName();
    }
}
