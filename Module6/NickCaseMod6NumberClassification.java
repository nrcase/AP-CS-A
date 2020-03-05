/*Program Name: Number Classification
Assignment: Module 6, Lesson 8, Assignment 3
Author: Nick Case
Date: 12/2/19
Version: 1.0
Program Description: This program takes numbers and counts which are odd, even or equal to 0
What I learned from this program: how to used switch statements inside loops, how to boolean expressions
What difficulties did I have and how I solved them: I forgot how to do the switch statement, so I googled it and found the correct syntax and then it worked.
*/


import java.util.Scanner;

public class NickCaseMod6NumberClassification {
    public static void main(String[] args)
    {
        int count = 0, number = 0, even = 0, odd = 0, count2 = 0, zerocounter = 0; //Declaring Variables
        Scanner userInput = new Scanner(System.in); //Creating Scanner

        System.out.print("List the numbers you want analyzed: ");
        while (count < 10) {

            number = userInput.nextInt(); //Getting all the numbers
            count++;
            while (count2 < count) //increments baed on when numbers are even or odd
            {
                switch (number % 2) {
                    case (0):
                        even++;
                        count2++;
                        break;

                    default:
                        odd++;
                        count2++;
                        break;
                }
                if (number == 0) //increments if a 0 is inputted
                {
                    zerocounter++;
                }
            }
        }
        System.out.println("You entered " + count); //Printing total
        System.out.println("The number of even numbers: " + (even - zerocounter)); //Printing even - the zeros  (zero is even ) counted
        System.out.println("The number of odd numbers: " + odd); //Print odd
        System.out.println("The number of zeroes: " + zerocounter); //Print number of zeros
    }
}

/* Sample Ouput:

List the numbers you want analyzed: 2 5 9 0 -8 6 0 -2 2 4
You entered 10
The number of even numbers: 6
The number of odd numbers: 2
The number of zeroes: 2

List the numbers you want analyzed: 100 -102 105 -99 -42 25 66 85 -2 0
You entered 10
The number of even numbers: 5
The number of odd numbers: 4
The number of zeroes: 1

 */

