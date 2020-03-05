/*Program Name: Conversion
Assignment: Module 8, Lesson 1, Assignment 1
Author: Nick Case
Date: 12/9/19
Version: 1.0
Program Description: This program converts between miles, km and yards
What I learned from this program: how to use methods to simplify work, method syntax
What difficulties did I have and how I solved them: I wasn't sure what syntax I need to use for the methods so I went back to the notes and saw what was needed. From that, I was able to make the method with the right syntax so it can be used and it worked.
*/

import java.util.Scanner;

public class NickCaseMod8ConversionRun
{
    public static void main(String [] args)
    {
     Scanner userInput = new Scanner(System.in); //Creating scanner
     int choice, mileage = 0; //declaring ints
     double finalAnswer;
     
     System.out.print("Choose 1 for miles, 2 for km, 3 for yards: ");
     choice = userInput.nextInt(); //Getting input

     System.out.print("Enter your mileage: ");
     mileage = userInput.nextInt(); //Getting mileage
     
     if (choice == 1)
     {
         System.out.println("You entered " + mileage + " miles"); //Print input

         finalAnswer = milesToKM(mileage); //Conversion method
         System.out.printf("This is " + "%.0f",finalAnswer); //printing conversion
         System.out.println(" km");

         finalAnswer = milesToYards(mileage); //Conversion method
         System.out.printf("This is " + "%.0f",finalAnswer); //Printing conversion
         System.out.println(" yards");
     }
     else if (choice == 2)
        {
            System.out.println("You entered " + mileage + " kilometers");

            finalAnswer = kmToMiles(mileage); //converison method
            System.out.printf("This is " + "%.0f",finalAnswer); //printing conversion
            System.out.println(" miles");

            finalAnswer = kmToYards(mileage); //converison method
            System.out.printf("This is " + "%.0f",finalAnswer); //printing conversion
            System.out.println(" yards");
        }
     else if (choice == 3)
        {
            System.out.println("You entered " + mileage + " yards");

            finalAnswer = yardsToKM(mileage); //conversion method
            System.out.printf("This is " + "%.0f",finalAnswer); //printing conversion
            System.out.println(" km");

            finalAnswer = yardsToMiles(mileage); //conversion method
            System.out.printf("This is " + "%.0f",finalAnswer); //printing conversion
            System.out.println(" miles");
        }


     
    }

    public static int milesToKM(double miles) //Method doing Miles To Kilometers
    {
        int km;
        km = (int) (miles / .621371); //conversion between miles to km
        return km;
    }

    public static double kmToMiles(double km) //KM to Miles
    {
        double miles;
        miles = km * .621371; //conversion between km to miles
        return miles;
    }

    public static double milesToYards(double miles) //Miles to yards
    {
        double yards;
        yards = (miles * 1760); //conversion between miles to yards
        return yards;
    }

    public static double kmToYards(double km) //KM to Yards
    {
        double yards;
        yards = (km * 1093.613); //conversion between km to yards
        return km;
    }

    public static double yardsToMiles(double yard) //Yards to miles
    {
        double mile;
        mile = yard / 1760; //conversion between yards to miles
        return mile;
    }

    public static double yardsToKM(double yard) //yards to KM
    {
        double km;
        km = (int) (yard / 1093.613); //conversion between yards to KM
        return km;
    }
}

/* Sample Output: I wasn't sure how to get the rounding right, but I tried with printf

Choose 1 for miles, 2 for km, 3 for yards: 1
Enter your mileage: 160
You entered 160 miles
This is 257 km
This is 281600 yards

 */
