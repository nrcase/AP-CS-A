/*Program Name: Small Factorials
Assignment: Module 6, Lesson 5, Assignment
Author: Nick Case
Date: 12/2/19
Version: 1.0
Program Description: This program finds small factorials with loops
What I learned from this program: how to use nested different loops
What difficulties did I have and how I solved them: I wasn't sure how to do an exit option with a String, so I just kind of guessed in the while conditional and got it right.
*/

import java.util.Scanner;

public class NickCaseMod6SmallFactorials
{
    public static void main(String [] args)
    {
        String exitValue;
        int finalValue = 1, count = 1; //Declaring Variables
        Scanner userInput = new Scanner(System.in); //Creating Scanner

        do
        {
            System.out.print("Enter a number: ");
            int value = userInput.nextInt(); //Getting input

            for (; count <= value; count++) //Getting factorial
            {
                finalValue = finalValue * count; //how many times the loop has run * the final value. Then repeats and uses value from the last loop run
            }

            System.out.println("The value of " + value + "! is " + finalValue + "\n"); //prints out final value and formats
            System.out.println("Would you like to calculate another number? ");
            exitValue = userInput.next(); //Gets escape String
        }
        while (exitValue.equals("Yes")); //Do this loop while the exit value is yes

        System.out.println("Thank you for running this program");
    }
}
/* Sample Output:

Enter a number: 1
The value of 1! is 1

Would you like to calculate another number?
Yes
Enter a number: 2
The value of 2! is 2

Would you like to calculate another number?
Yes
Enter a number: 3
The value of 3! is 6

Would you like to calculate another number?
Yes
Enter a number: 4
The value of 4! is 24

Would you like to calculate another number?
Yes
Enter a number: 5
The value of 5! is 120

Would you like to calculate another number?
Yes
Enter a number: 6
The value of 6! is 720

Would you like to calculate another number?
No
Thank you for running this program

 */