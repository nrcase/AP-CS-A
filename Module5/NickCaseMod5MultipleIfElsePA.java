/*Program Name: Multiple If Else Practice
Assignment: Module 5, Lesson 3, Practice Assignment 1
Author: Nick Case
Date: 10/2/19
Version: 1.0
Program Description:
What I learned from this program: how to use multiple if else statements
What difficulties did I have and how I solved them: I went ahead and put most of the code in ahead of the video, but I forgot to put in the if after the else in order to continue the if statement. I put the ifs and then the conditional worked.
*/

import java.util.*;
import java.io.*;

public class NickCaseMod5MultipleIfElsePA
{
    public static void main(String [] args)
    {
        Scanner kbReader = new Scanner(System.in); //Creating Scanner
        System.out.print("What is your grade? ");
        int theGrade = kbReader.nextInt(); //Getting Integer

        if(theGrade >= 90) //if grade is greater than or equal to 90
        {
            System.out.println("You made an A."); //Print You made an A
        }
        else if (theGrade >= 80) //if grade is not greater than or equal to 90 and is greater than or equal to 80
        {
            System.out.println("You made a B."); //Print You made a B
        }
        else if (theGrade >= 70)  // if grade is not >= 90, >= 80 and is greater than or equal to 70,
        {
            System.out.println("You made a C."); //Print You made a C
        }
        else //If your grade is below a 70
        {
            System.out.println("You failed."); // Print You failed
        }

    }
}

/* Sample Output:

What is your grade? 95
You made an A.

What is your grade? 85
You made an B.

What is your grade? 75
You made an C.

What is your grade? 65
You failed.

 */
