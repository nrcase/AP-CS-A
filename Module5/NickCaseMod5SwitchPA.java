/*Program Name: Lesson 9 PA
Assignment: Module 5, Lesson 9, Practice Assignment 1
Author: Nick Case
Date: 10/21/19
Version: 1.0
Program Description: This program allows you to add, subtract, multiply, or divide 2 numbers
What I learned from this program: how to use the switch statement, why you need the break statement, why you need a default case, how to create a basic menu
What difficulties did I have and how I solved them: I finished the videos, but the program still wouldn't compile so I looked back through my code and I had missed 2 semi-colons. I put them in place and then it worked.
*/

import java.util.*;
public class NickCaseMod5SwitchPA
{
    public static void main(String [] args)
    {
        System.out.println("Make your arithmetic selection from the choices below: \n"); //Creating a menu
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division \n ");
        System.out.print("   Your choice? ");

        Scanner kbReader = new Scanner(System.in); //Creates Scanner object
        int choice = kbReader.nextInt(); //Gets choice

        System.out.print("\n Enter first operand ");
        double op1 = kbReader.nextDouble(); //Gets first operand

        System.out.print("\n Enter second operand ");
        double op2 = kbReader.nextDouble(); //Gets second operand

        switch (choice)
        {
            case 1: //addition
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2)); //if choice is equal to 1, then add
                break;
            case 2: //subtraction
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2)); //if choice is equal to 2, then subtract
                break;
            case 3: //Multiplication
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2)); //if choice is equal to 3, then multiply
                break;
            case 4: //Division
                System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2)); //if choice is equal to 4, then divide
                break;
            default: //If it doesn't fit 1,2,3 or 4
                System.out.println("Please enter only 1, 2, 3, or 4"); //Print
        }
    }
}

/* Sample Output:

Make your arithmetic selection from the choices below:

1. addition
2. subtraction
3. multiplication
4. division

   Your choice? 1

 Enter first operand 2

 Enter second operand 2
2.0 plus 2.0 = 4.0

Make your arithmetic selection from the choices below:

1. addition
2. subtraction
3. multiplication
4. division

   Your choice? 2

 Enter first operand 2

 Enter second operand 2
2.0 minus 2.0 = 0.0

Make your arithmetic selection from the choices below:

1. addition
2. subtraction
3. multiplication
4. division

   Your choice? 3

 Enter first operand 2

 Enter second operand 2
2.0 times 2.0 = 4.0

Make your arithmetic selection from the choices below:

1. addition
2. subtraction
3. multiplication
4. division

   Your choice? 4

 Enter first operand 2

 Enter second operand 2
2.0 divided by 2.0 = 1.0


 */