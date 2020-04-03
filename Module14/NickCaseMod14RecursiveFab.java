/*Program Name: Recursive Fibonacci
Assignment: Module. 14, Lesson 5, Assignment 1
Author: Nick Case
Date: 4/2/20
Version: 1.0
Program Description: This program does the Fibonacci sequence using methods and recursion
What I learned from this program: how to use recursion to simplify things, how recursion works
What difficulties did I have and how I solved them: N/A, no problems. The assignment on canvas said to do it in BlueJ but then the worksheet said to do it on paper. I just did it in BlueJ b/c it's easier to submit and upload. If you need me to do it on paper, I did it on paper as well and I can just submit that instead.
*/

import java.util.Scanner;

public class NickCaseMod14RecursiveFab
{
    public static void main (String [] args)
    {
        Scanner userInput = new Scanner(System.in); //creates Scanner object
        System.out.print("What number of the fibonacci sequence do you want? "); //gets user input
        int  choice = userInput.nextInt();
        System.out.println(fibonacci(choice)); //print the number of the sequence based on the user input
    }

    public static int fibonacci(int n)
    {
        if (n == 1) //base case
        {
            return 1;
        }
        else if (n == 2) //base case
            return 1;
        else
        {
            return fibonacci( n - 1) + fibonacci(n -2); //recursive call to the method again, adding the result for the n-1 in the method and n-2 in the method, causing a recursive chain down until n reaches 1 or 2.
        }
    }
}

/* Sample Output:

What number of the fibonacci sequence do you want? 4
3

What number of the fibonacci sequence do you want? 20
6765

What number of the fibonacci sequence do you want? 15
610

 */