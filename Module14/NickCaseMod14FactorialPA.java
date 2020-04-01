/*Program Name: Factorials using Recursion
Assignment: Module 14, Lesson 4, Practice Assignment 1
Author: Nick Case
Date: 4/1/20
Version: 1.0
Program Description: This program prints out 4! using recursion
What I learned from this program: what is recursion, how to follow recursion, how and why to use recursion
What difficulties did I have and how I solved them: N/A, just followed the video
*/

public class NickCaseMod14FactorialPA
{
    public static void main(String [] args)
    {
        System.out.println(factorial(4)); //printing 4!
    }

    public static int factorial(int n) //factorial method
    {
        if (n == 1) //stopping value, stops recursion
        {
            return 1;
        }
        else //if not the end of the factorial
        {
            return n * factorial(n - 1); //return the current n value given times the factorial of the numbers below it, looping and multiplying all the number together
        }
    }
}
/* Sample Output:

24

 */