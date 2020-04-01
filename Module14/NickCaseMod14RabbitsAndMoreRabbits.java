/*Program Name: Rabbits and More Rabbits
Assignment: Module 14, Lesson 5, Practice Activity 1
Author: Nick Case
Date: 4/1/20
Version: 1.0
Program Description: This program finds the 8th number in the fibonacci sequence
What I learned from this program: how to create recursive methods, how recursion works
What difficulties did I have and how I solved them: N/A, followed the video
*/

public class NickCaseMod14RabbitsAndMoreRabbits
{
    public static void main(String [] args)
    {
        System.out.println(fib(8)); //printing 8th number of fibonacci sequence
    }

    public static int fib(int n) //method to find fibonacci with recursion
    {
        if (n == 0) //base conditions
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else //recursion
        {
            return fib(n - 1) + fib(n - 2); //the last number plus the number before that equals the number, repeats through recursion chain until reaching end index
        }
    }

}

/* Sample Output:

21

 */
