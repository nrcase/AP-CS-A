/*Program Name: Linear Equation Solver
Assignment: Module 5, Lesson 4, Assignment 1
Author: Nick Case
Date: 10/7/19
Version: 1.0
Program Description: This program asks for 2 inputs to be 2 variables and then solves a linear equation using those variables.
What I learned from this program: how to use multiple if statements, how to use nested if statements, how to use if else if statements, how to use boolean operators
What difficulties did I have and how I solved them: I was having trouble figuring how how to get the subtraction sign to show if the variableB was negative and then I realized that I could use a nested if statement and Math.abs() to figure that out. I implemented my idea on how I would use them and I got the correct input I wanted.
*/

import java.util.*;
public class NickCaseMod5Linear
{
    public static void main(String [] args)
    {
        double stepOne, stepTwo;
        Scanner userInput = new Scanner(System.in); //Creating Scanner

        System.out.print("Enter A: ");
        double variableA = userInput.nextDouble(); //Getting input

        System.out.print("Enter B: ");
        double variableB = userInput.nextDouble(); //Getting input

        if (variableA == 0 && variableB == 0) // if both variables = 0
        {
            System.out.println("0x +0 = 0 --> There are infinite solutions"); //Print out infinite solutions and exit
            System.exit(0);
        }
        else if (variableA == 0 && variableB > 0) //if one variable is 0,
        {
            System.out.println("0x + " + variableB + " = 0 --> There are no solutions"); //Print out no solutions and exit
            System.exit(0);
        }
        else if (variableA > 0 && variableB == 0) //if the other variable is 0,
        {
            System.out.println(variableA + "x + " + variableB + "= 0 --> There are no solutions"); //Print out no solutions and exit
            System.exit(0);
        }

        if (variableB >= 0) //If B is greater than or equal to 0
        {
            stepOne = 0 - variableB; // Subtract it from 0
            stepTwo = stepOne / variableA; //Take the first part and divide it by A

            if (variableB < 0) // if B is less than 0
            {
                System.out.println(variableA + "x - " + variableB + " -->" + "x = "  + stepTwo); //Print out output with minus sign
            }
            else
            {
                System.out.println(variableA + "x + " + variableB + " -->" + "x = "  + stepTwo); //Print out output with plus sign
            }

        }
        else
        {
            stepOne = Math.abs(variableB); //find the absolute value of B and add it to 0 to get stepOne
            stepTwo = stepOne / variableA; //Divide the first step answer by A

            if (variableB < 0) // If B is less than 0 or negative
            {
                variableB = Math.abs(variableB); //find abs of B and set it to B (to simulate adding B to the other side with inverse operations)
                System.out.println(variableA + "x - " + variableB + " = 0 -->" + "x = " + stepTwo); // Print out output with minus sign
            }
            else
            {
                System.out.println(variableA + "x + " + variableB + "= 0 -->" + "x = " + stepTwo); //Print out output with plus sign
            }
        }

    }
}

/* Sample Output:

Enter A: 4
Enter B: -5
4.0x - 5.0 = 0 -->x = 1.25

Enter A: 7
Enter B: 12
7.0x + 12.0 = 0 -->x = -1.7142857142857142 (wasn't sure how to round just this number and not the others)

Enter A: 0
Enter B: 0
0x +0 = 0 --> There are infinite solutions

Enter A: 0
Enter B: 7
0x + 7.0 = 0 --> There are no solutions

Enter A: 7
Enter B: 0
7.0x + 0= 0 --> There are no solutions

Enter A: 3.5
Enter B: -1.6
3.5x - 1.6 = 0 -->x = 0.4571428571428572
 */