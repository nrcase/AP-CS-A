/*Program Name: Reversing Strings
Assignment: Module 7, Lesson 2, Assignment 1
Author: Nick Case
Date: 12/2/19
Version: 1.0
Program Description: This program reverses strings and asks if you want to do it again
What I learned from this program: how to manipulate strings, how to convert between char and String
What difficulties did I have and how I solved them: I wasn't sure how to use the .ToUpperCase and I tried and it gave me an error. I realized it was a char and needed to be a string so I converted it with a method and it worked.
*/

import java.util.Scanner;

public class NickCaseMod7ReverseString
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //creating Scanner
        String input; //Declaring variables
        int another = 0;
        int length, counter;

        while (another <= 0 ) //Loop for whether to put another string in or not
        {
            System.out.print("What string would you like to enter? ");
            input = userInput.nextLine(); //Geting String
            System.out.println("You entered " + input);

             length = input.length(); //getting length of input

             System.out.print("The string reversed is ");
             for (counter = 0; counter != (length); counter++ ) //loop printing out the input, character by character in reverse
             {
               System.out.print(input.charAt((length - 1)-counter));
             }

             System.out.println(); //New Line

             System.out.print("The reversed string in capital letters is ");
            for (counter = 0; counter != (length); counter++ ) //Loop printing out the input, character by character and then converting it to a string and then making it upper case.
            {
                System.out.print(Character.toString((input.charAt((length - 1)-counter))).toUpperCase());
            }

            System.out.println(); //New Line

            System.out.println("Would you like to enter another string (Y = 0 / N = 1 )");
            another = userInput.nextInt(); //type in if you want to quit or not
            String none = userInput.nextLine(); //Clears input for next run
        }
    }
}

/* Sample Output:

What string would you like to enter? Hello
You entered Hello
The string reversed is olleH
The reversed string in capital letters is OLLEH
Would you like to enter another string (Y = 0 / N = 1 )

What string would you like to enter? Welcome to my house
You entered Welcome to my house
The string reversed is esuoh ym ot emocleW
The reversed string in capital letters is ESUOH YM OT EMOCLEW
Would you like to enter another string (Y = 0 / N = 1 )

 */
