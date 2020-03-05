/*Program Name: Guessing Game v2.0
Assignment: Module 6, Lesson 5, Assignment 1
Author: Nick Case
Date: 11/8/19
Version: 2.0
Program Description: This program plays a guessing game with you, but each guess costs a 25 cents.
What I learned from this program: how to use a sentinel loop, how to use the break statement inside a loop
What difficulties did I have and how I solved them: I wasn't sure how to find the amount spent and then I realized that each time through the loop is 25 cents, so I just made a counter variable and then did that times .25 to find out how much money has been spent.  
*/
import java.util.*;
public class NickCaseMod6GuessingGamev2
{
    public static void main(String [] args)
    {
        double payout = 2.00; //Declaring Variables
        int humanGuess, computerNumber, count = 0;
        Scanner userInput = new Scanner(System.in); //Creating Scanner

        computerNumber = (int) (100 * (Math.random())); //Creating Random number

        do
            {
                System.out.printf("Payout is $" + "%.2f", payout); //Printing prompt with formatting
                System.out.print( ". Your guess is ");
                humanGuess = userInput.nextInt(); //Getting number

                if (humanGuess == computerNumber) //if the guesses are the same
                {
                    System.out.println("Congratulations! Computer's number is " + computerNumber + ". This guess cost you $" + (count * .25)); //Print this
                }
                else if (humanGuess > computerNumber) //else if human is more than computer
                {
                    System.out.println("Your guess is too high."); //Print this
                }
                else if (humanGuess < computerNumber) //else if human is less than computer
                {
                    System.out.println("Your guess is too low."); //Print this
                }

                payout = payout - .25; //Subtracting the cost to guess
                count++; //Count in order to find money left

                if (payout == 0) //if you have no money
                {
                    System.out.println("You ran out of money. =("); //print this
                    break; //end the loop
                }
            }
        while ( computerNumber != humanGuess); //do while computer number is not equal to human guess
    }
}
/* Sample Output:

Payout is $2.00. Your guess is 50
Your guess is too high.
Payout is $1.75. Your guess is 25
Your guess is too low.
Payout is $1.50. Your guess is 40
Your guess is too low.
Payout is $1.25. Your guess is 48
Your guess is too high.
Payout is $1.00. Your guess is 46
Your guess is too high.
Payout is $0.75. Your guess is 44
Congratulations! Computer's number is 44. This guess cost you $1.5

Payout is $2.00. Your guess is 1
Your guess is too low.
Payout is $1.75. Your guess is 1
Your guess is too low.
Payout is $1.50. Your guess is 1
Your guess is too low.
Payout is $1.25. Your guess is 1
Your guess is too low.
Payout is $1.00. Your guess is 1
Your guess is too low.
Payout is $0.75. Your guess is 1
Your guess is too low.
Payout is $0.50. Your guess is 1
Your guess is too low.
Payout is $0.25. Your guess is 1
Your guess is too low.
You ran out of money. =(

 */
