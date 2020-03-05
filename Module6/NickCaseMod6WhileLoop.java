/*Program Name: While Loops
Assignment: Module 6, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 10/29/19
Version: 1.0
Program Description: This program adds 3 to sum until j is equal to 79
What I learned from this program: how to use while loops
What difficulties did I have and how I solved them: It wasn't compiling and then I realized I put a semicolon instead of curly brackets at the end of the while loop.
*/

public class NickCaseMod6WhileLoop
{
    public static void main (String [] args)
    {
        int sum = 0; //Declaring Variable
        int j = 3;
        while (j <= 79) //While J is less than or equal to 79
        {
            sum = sum + j; // sum is equal to sum + j
            j++; //Increment J by 1
        }
        System.out.println(sum); //Print Sum
    }
}

/*
Sample Output:
3157

 */
