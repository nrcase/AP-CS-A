/*Program Name: Gym Signup
Assignment: Module 8, Lesson 2, Assignment 3
Author: Nick Case
Date: 12/12/19
Version: 1.0
Program Description: This program determines how much you are paying for a gym membership including discounts
What I learned from this program: how to use methods, method syntax
What difficulties did I have and how I solved them: I was getting a compile error, and then I realized that in one of my methods, it needed a integer, but the variable that I wanted in there was a double. I changed the variable to integer and then it would compile, and the program worked.
*/

import java.util.Scanner;

public class NickCaseMod8Fitness
{
    public static void main(String []args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner
        String again = "Yes", firstName, lastName, personalTrainingString; //Declaring Variables
        int age, numberofMonths = 0, personalTrainingInt = 0,perMonthOr12Months = 0, trainingCost ;
        double totalDiscount, totalCost, finalCost;

        while (again.equals("Yes")) //Loop to see if another wants to sign up
        {
        System.out.print("Welcome to Today's Gym. Are you a new member? (y/n) ");
        String choice = userInput.next();

        if (choice.equals("y")) // if they are a new member
        {
            basicInfo(); //print basic info
            System.out.print("First Name: ");
            firstName = userInput.next(); //Get first name

            System.out.print("Last Name: ");
            lastName = userInput.next(); //get last name

            System.out.print("Age: ");
            age = userInput.nextInt(); //get age

            if (age < 60) // printing if qualify for senior discount
            {
                System.out.println("You do not qualify for a senior discount");
            }
            else
            {
                System.out.println("You do qualify for a senior discount");
            }

            System.out.print("Are you paying per month or for 12 months (number of months)? ");
            numberofMonths = userInput.nextInt(); //Getting number of months

            totalDiscount = discountInfo(age, numberofMonths, personalTrainingInt); //Using method to find total discounts
            totalCost = totalCost(totalDiscount, numberofMonths); //Using a method to find total cost

            System.out.println("Total cost is $" + (totalCost) + " with a " + (totalDiscount * 100) + "% discount so purchase price would be: $" + (totalCost * ( 1 - totalDiscount))); //printing total cost and cost with discount applied

            System.out.print("Do you want any personal training sessions (y/n)? ");
            String answer = userInput.next(); //Seeing if want training session

            if (answer.equals("y")) //if they do want training sessions
            {
                System.out.print("How many? ");
                personalTrainingInt = userInput.nextInt(); //get how many
              trainingCost = trainingCost(personalTrainingInt); //get the price for those training sessions
              finalCost = (totalCost * (1 - totalDiscount)  + trainingCost); // getting the final cost with all costs and discounts

              System.out.println("Total Cost is $" + finalCost);
            }
            else
            {
                System.out.println("Total cost is $" + ((totalCost) * (1 - totalDiscount)));
            }


        }
        else if (choice.equals("n")) //if not a new member, print below
        {
            System.out.println("Congrats! You have already signed up! Welcome to the GYM!");
        }
        System.out.print("Is there another member?  (y/n)");
        again = userInput.next(); //Seeing if want to sign up someone else

        }
    }

    public static void basicInfo() //void method to print basic info
    {
        System.out.println("Cost per month is $30, personal training is $15 per half-hour session.");
        System.out.println("If the patron is a senior citizen, apply a 25% discount. If the patron purchases an entire 12 months at one time, apply a 15% discount. If the patron purchases 7 or more personal fitness training sessions, apply a 22% discount.");
    }

    public static double discountInfo(int age, int perMonthOr12Months, int personalTrainingInt) //method to find all the discounts a person qualifies for
    {
        double totalDiscount = 0, seniorDiscount = .15 , trainingDiscount = .22, monthDiscount = .15;
        if (age >= 60) //if older or equal to 60, qualify for senior discount
        {
            totalDiscount =+ seniorDiscount;
            System.out.println("You qualify for a discount");
        }
        if (perMonthOr12Months == 12 || perMonthOr12Months == 24 || perMonthOr12Months == 36 || perMonthOr12Months == 48 || perMonthOr12Months == 60) //if paying for increments 12 months at a time, get discount
        {
            totalDiscount = totalDiscount + monthDiscount;
            System.out.println("You qualify for a discount");
        }
        if (personalTrainingInt >= 7) //if buying more than 7 training sessions, apply discount
        {
            totalDiscount = totalDiscount + trainingDiscount;
            System.out.println("You qualify for a discount");
        }

        return totalDiscount;
    }

    public static double totalCost(double totalDiscount, int numberOfMonths) //method for total cost
    {
        double totalCost = 0;
        totalCost = (numberOfMonths * 30);
        return totalCost;
    }

    public static int trainingCost(int trainingSessionsInt) //method for training cost
    {
        int trainingCost = 0;
        trainingCost = 15 * trainingSessionsInt;
        return trainingCost;
    }
}

/* Sample Output:

Welcome to Today's Gym. Are you a new member? (y/n) y
Cost per month is $30, personal training is $15 per half-hour session.
If the patron is a senior citizen, apply a 25% discount. If the patron purchases an entire 12 months at one time, apply a 15% discount. If the patron purchases 7 or more personal fitness training sessions, apply a 22% discount.
First Name: John
Last Name: Smith
Age: 42
You do not qualify for a senior discount
Are you paying per month or for 12 months (number of months)? 12
You qualify for a discount
Total cost is $360.0 with a 15.0% discount so purchase price would be: $306.0
Do you want any personal training sessions (y/n)? y
How many? 2
Total Cost is $336.0
Is there another member?  (y/n)n

Welcome to Today's Gym. Are you a new member? (y/n) y
Cost per month is $30, personal training is $15 per half-hour session.
If the patron is a senior citizen, apply a 25% discount. If the patron purchases an entire 12 months at one time, apply a 15% discount. If the patron purchases 7 or more personal fitness training sessions, apply a 22% discount.
First Name: Nick
Last Name: Case
Age: 17
You do not qualify for a senior discount
Are you paying per month or for 12 months (number of months)? 3
Total cost is $90.0 with a 0.0% discount so purchase price would be: $90.0
Do you want any personal training sessions (y/n)? y
How many? 8
Total Cost is $210.0
Is there another member?  (y/n)n

 */
