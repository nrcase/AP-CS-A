/*Program Name: Paycheck
Assignment: Module 5, Lesson 3, Assignment 1
Author: Nick Case
Date: 10/4/19
Version: 1.0
Program Description: This program asks for the numbers of hours worked and the payrate, and the calcualtes the paycheck. If they work more than 40 hours, then the overtime rate is applied and the program calculates the total of both regular pay and overtime pay.
What I learned from this program: How to use if statements, how to use if else if statements, how to use if else statements
What difficulties did I have and how I solved them: I wasn't sure how to start designing the program, so I typed what I needed in a text file, and then worked through it in order to create an easier way to create the program. That made it much easier once I started coding.
I tried to do else with a expression, but then I got an error message. So I put it to else if and it worked. I googled it and found out that only else if can have expressions in them and else would have no modifier on it.
*/

import java.util.*;

public class NickCaseMod5Paycheck
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner
        final double overtimeConstant = 1.5; //Declaring Constants and variables
        double regularPay, overtimePay;
        int overtimeHoursWorked;
        final int hoursWorkedIfOvertime = 40;

        System.out.print("Hours worked: ");
        int  hoursWorked = userInput.nextInt(); //Getting hours worked

        System.out.print("Rate of pay: ");
        double rateOfPay = userInput.nextDouble(); //Getting rate of pay
        System.out.print("\n");

        double rateOfOvertime = rateOfPay * overtimeConstant; // Finding Overtime rate

        if (hoursWorked <= 40) //if hours worked is less than or equal to 40
        {
           regularPay = rateOfPay * hoursWorked; // Find regular pay
            double grossPay = regularPay; //Find total pay

            System.out.println("Hours worked \n" + "Regular hours = " + hoursWorked); //Display Hours Worked
            System.out.println("Overtime hours = " + 0); //Display 0 Overtime hours
            System.out.println("Total Hours = " + hoursWorked + "\n"); // Display total hours
            System.out.printf("Gross pay = %.2f\n", grossPay); //Display total pay with 2 decimal places
            //I got rid of Overtime hours and overtime pay because if they work under or equal to 40 hours, they don't qualify for overtime, so they don't need to see or have that information displayed.
        }
        else if (hoursWorked > 40) //if the hours are greater than 40,
        {
            overtimeHoursWorked = hoursWorked - 40; //Find Overtime hours worked
            regularPay = rateOfPay * 40; //Find regular pay

            overtimePay = overtimeHoursWorked * rateOfOvertime; //Find how much paid for overtime
            double grossPay = regularPay + overtimePay; //Find total pay, add regular and overtime

            System.out.println("Hours worked \n" + "Regular hours = " + hoursWorkedIfOvertime); //Displays total hours not overtime
            System.out.println("Overtime hours = " + overtimeHoursWorked);// Displays hours worked in overtime
            System.out.println("Total Hours = " + hoursWorked + "\n"); //Displays total hours
            System.out.printf("Regular Pay = %.2f\n", regularPay ); //Displays pay for regular hours with 2 decimal points
            System.out.printf("Overtime pay = %.2f\n", overtimePay); //Displays pay for time worked overtime with 2 decimal places
            System.out.printf("Gross pay = %.2f\n", grossPay); // Displays total pay of both regular and overtime
        }
    }
}

/* Sample Output:

Hours worked: 48
Rate of pay: 12.00

Hours worked
Regular hours = 40
Overtime hours = 8
Total Hours = 48

Regular Pay = 480.00
Overtime pay = 144.00
Gross pay = 624.00



Hours worked: 12
Rate of pay: 12.00

Hours worked
Regular hours = 12
Overtime hours = 0
Total Hours = 12

Gross pay = 144.00

 */
