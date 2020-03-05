/*Program Name: Compound This
Assignment: Module 6, Lesson 2, Assignment 1
Author: Nick Case
Date: 11/5/19
Version: 1.0
Program Description: This program gets an interest rate and starting amount and then finds how long it takes to double based the times it is compounded per year.
What I learned from this program: how to use a while loop, how to check inputs
What difficulties did I have and how I solved them: I wanted to validate my output, but I couldn't remember how to do it. So I wrote down the basics of what I wanted to do on paper and then figured I all I needed was an if statement. I put that in and was able to do verifiation.
*/

import java.util.*;
public class NickCaseMod6CompoundThis
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner class

        double interestRate; //Declaring Variables
        double balance, dayBalance, monthBalance, yearBalance;
        double dayCounter = 0, monthCounter = 0, yearCounter = 0 ;
        double twiceBalance;
        int period;


        System.out.print("Enter account balance: ");
        balance = userInput.nextInt(); //Getting input for the starting amount
        twiceBalance = 2 * balance; // Want to get 2 * balance, will use in boolean later


        System.out.print("Enter interest rate (as a decimal): ");
        interestRate = userInput.nextDouble(); //Getting input

        dayBalance = balance; //Setting individual balances to the balance variable so I can change them in the loop
        monthBalance = balance;
        yearBalance = balance;

        System.out.println("\n\t\t\t\t\t Years to Double   Ending Balance"); //Printing Years and Ending Balance on a new line with 5 tab spaces

        System.out.print("Enter Period: ");
        period = userInput.nextInt(); //Getting the period

        if (period == 1) //if the period is 1
            {
                while (dayBalance <= twiceBalance) //while the balance is less than or equal to twice balance
                {
                    dayBalance = dayBalance * (interestRate / 365) + dayBalance; // take the interest rate compounded daily times the original balance and add the balance from the last time
                    dayCounter++; // Add one to the day counter
                    dayBalance = (double) (Math.round((100d * dayBalance))) / 100d; //Round the final balance
                }

                System.out.printf("\t\t\t\t\t\t %.2f", (dayCounter/365)); //print out years by dividing the days it takes /365 wth 7 tabs
                System.out.println("   \t\t\t\t$" + dayBalance); //Print out final balance and 4 tab spaces
            }

        if (period !=1) //if the period is not one
        {
            System.out.println("Wrong input, Please enter 1 (Yearly), 12 (Monthly) or 365 (Daily) to find the interest"); //Print
            System.exit(1);//Exit
        }

            System.out.print("Enter Period: ");
            period = userInput.nextInt();//Get next period

        if (period == 12) //if the period is 12
            {
                while (monthBalance <= twiceBalance) //while the balance is less than or equal to twice balance
                {
                    monthBalance = monthBalance * (interestRate / 365) + monthBalance; // take the interest rate compounded daily times the original balance and add the balance from the last time
                    monthCounter++; // Add one to the counter
                    monthBalance = (double) (Math.round((100d * monthBalance))) / 100d; //Round the final balance
                }

                System.out.printf("\t\t\t\t\t\t %.2f", (monthCounter/12)); //print out years by dividing the days it takes /12 wth 7 tabs
                System.out.println("   \t\t\t\t$" + monthBalance); //Print out final balance and 4 tab spaces
            }

        if (period != 12) //if the period is not 12
        {
            System.out.println("Wrong input, Please enter 1 (Yearly), 12 (Monthly) or 365 (Daily) to find the interest");
            System.exit(1); //Exit
        }

        System.out.print("Enter Period: ");
        period = userInput.nextInt(); //get next period

        if (period == 365) //if the period is 365
            {
                while (yearBalance <= twiceBalance) //while the balance is less than or equal to twice balance
                {
                    yearBalance = yearBalance * (interestRate / 365) + yearBalance; // take the interest rate compounded daily times the original balance and add the balance from the last time
                    yearCounter++; // Add one to the counter
                    yearBalance = (double) (Math.round((100d * yearBalance))) / 100d; //Round the final balance
                }

                System.out.printf("\t\t\t\t\t\t %.2f", (yearCounter)); //print out years with 7 tabs
                System.out.println("   \t\t\t\t$" + yearBalance); //Print out final balance and 4 tab spaces
            }
        if (period != 365) //if the period is not 365
        {
            System.out.println("Wrong input, Please enter 1 (Yearly), 12 (Monthly) or 365 (Daily) to find the interest");
            System.exit(1); //Exit
        }
    }
}

/*
Sample Output:

Enter account balance: 1000
Enter interest rate (as a decimal): .05

					 Years to Double   Ending Balance
Enter Period: 1
						 13.87   				$2000.11
Enter Period: 12
						 421.83   				$2000.11
Enter Period: 365
						 5062.00   				$2000.11

 */
