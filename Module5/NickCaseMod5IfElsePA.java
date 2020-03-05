/*Program Name: Practicing If Else
Assignment: Module 5, Lesson 2, Practice Assignment 1
Author: Nick Case
Date: 10/2/19
Version: 1.0
Program Description: This programs asks for your grade and tells you if you passed with a 70 or higher.
What I learned from this program: how to use if else statement, syntax for that statement
What difficulties did I have and how I solved them: I followed the video, but I forgot to put a semi-colon behind one of my println statements. I put the semi-colon where it needed to be and then the program compiled.
*/

import java.io.*;
import java.util.*;
public class NickCaseMod5IfElsePA
{
    public static void main(String[] args)
    {
        Scanner kbReader = new Scanner(System.in); // Creating Scanner
        System.out.print("What is your grade? ");
        int myGrade = kbReader.nextInt(); //Getting input

        if(myGrade >= 70) //if grade is equal to or higher than 70
        {
            System.out.println("Congratulations, you passed!"); //then print Congratulations, you passed!
        }
        else // if grade is not equal to or higher than 70,
        {
            System.out.println("Better luck next time!"); //then print "Better Luck next time!"
        }
    }
}

/* Sample Output:

What is your grade? 85
Congratulations, you passed!

What is your grade? 25
Better luck next time!

 */