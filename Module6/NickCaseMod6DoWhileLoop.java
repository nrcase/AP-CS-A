/*Program Name: Do While Loop
Assignment: Module 6, Lesson 3, Practice Assignment 1
Author: Nick Case
Date: 11/5/19
Version: 1.0
Program Description: This program adds 3 until j reaches 79 with a do while loop
What I learned from this program: how to use a do while loop. difference between do while and a while loop
What difficulties did I have and how I solved them: I forgot to put a semi colon at the end of the do while loop on the loop statement and it wouldn't compile, so I looked back at the code in the video and saw the semi-colon there and put it in and it worked.
*/

public class NickCaseMod6DoWhileLoop
{
    public static void main(String [] args)
    {
        int sum = 0; //Declaring variables
        int j =3;

        //while(j <= 79)
        {

        }

        do //Do
        {
            sum = sum + j; // Sum + j
            j++; // Increment j by 1
        }
        while (j <= 79); //while j is less than or equal to 79

        System.out.println(sum); //Print Sum
    }
}
/*
Sample Output:
3157
 */