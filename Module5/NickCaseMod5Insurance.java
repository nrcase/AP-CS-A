/*Program Name: Insurance Cost
Assignment: Module 5, Lesson 5, Assignment 1
Author: Nick Case
Date: 10/1/19
Version: 1.0
Program Description: This program takes the driver's age and finds out the insurance rate they get based on their age.
What I learned from this program: How to use if statements, how to format if statements, worked on using the Scanner class,
What difficulties did I have and how I solved them: I wasn't sure for the syntax for using the if statements so I went back to the notes and looked them up; I was missing the brackets to start and end the if statement.
*/

import java.io.*;
import java.util.*;
public class NickCaseMod5Insurance
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner object
        int insurance = 0;

        System.out.print("Driver age = ");
        int driverAge = userInput.nextInt(); //Getting integer input from user, .nextInt doesn't allow anything other than a integer to be entered
        if (driverAge == 25) //If driver age is 25, then insurance is $500
        {
            insurance = 500;
        }
        if (driverAge >= 16 && driverAge < 18) //If the driver age is between 16 and 18 (including 16, not 18), take the age and multiply it by 88.
        {
            insurance = driverAge * 88;
        }
        if (driverAge >= 18 && driverAge < 25) //If the driver age is between 18 and 25 (including 18, not 25), take the age and multiply it by 72.
        {
            insurance = driverAge * 72;
        }
        System.out.println("Insurance cost = " + insurance); //Print out insurance cost
    }
}

/*
Sample Output:
Driver age = 25
Insurance cost = 500

Sample Output:
Driver age = 17
Insurance cost = 1496

Sample Output:
Driver age =  23
Insurance cost = 1656

 */