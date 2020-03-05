/*Program Name: Leap Year
Assignment: Module 6, Lesson 8, Assignment 1
Author: Nick Case
Date: 11/18/19
Version: 1.0
Program Description: This program determines if something is a leap year or not
What I learned from this program: which loops to use, using large boolean expressions for loops
What difficulties did I have and how I solved them: I wasn't sure how to use a loop for this assignment, but then I remebered that all loops have a boolean condition to run again, so if I just set the conditions that I need as the loop conditional, I can have it exit after one run.
I think this program would be a lot easier and less complicated if you used conditionals like an if statement instead. But, the doc said loop control is needed so I used a loop.
*/

import java.util.*;
public class NickCaseMod6LeapYear
{
    public static void main(String [] args)
    {

        int year;
        Scanner userInput = new Scanner (System.in); //Creating Scanner Object

        System.out.print("Enter a year: ");
        year = userInput.nextInt(); //Getting Input
        System.out.println("The year you entered is " + year);

            while (year % 100 == 0 && year % 400 == 0 || year % 4 == 0) //While the year is divisble by 100 and 400 or divisible by 4
            {
                System.out.println("The year " + year + " is a leap year" ); //Print out "is leap year"
                System.exit(1); //Exit
            }
            System.out.println("The year " + year + " is not a leap year"); //If doesn't fit the requirements for loop, not leap year is printed.
    }
}

/* Sample Output:

Enter a year: 2000
The year you entered is 2000
The year 2000 is a leap year

Enter a year: 1962
The year you entered is 1962
The year 1962 is not a leap year

Enter a year: 1776
The year you entered is 1776
The year 1776 is a leap year


 */