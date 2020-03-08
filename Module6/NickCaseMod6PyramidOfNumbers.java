/*Program Name: Pyramid of Numbers
Assignment: Module 6, Lesson 7, Assignment 2
Author: Nick Case
Date: 12/2/19
Version: 1.0
Program Description: This program prints a tree of ascending and descending numbers in rows
What I learned from this program: how to use nested loops, how to use for loops, how to use multiple loops
What difficulties did I have and how I solved them: I was getting a compile error and then I realized that I forgot to initialize rows. Once I initialized it to 1, it complied and printed out what I wanted.
*/

public class NickCaseMod6PyramidOfNumbers
{
    public static void main(String [] args)
    {
        for (int rows = 1; rows <= 9; rows++) //Loop that creates the rows of the pyramid
        {
            for (int up = 1; up <= rows; up++) //Creates the ascending numbers
            {
                System.out.print(up);
            }
            for (int down = rows - 1; down >= 1; down--) //Creates the descending numbers
            {
                System.out.print(down);
            }
            System.out.println(); //Moves each row to a new line after each row is finished printing  
        }
    }
}

/* Sample Output:

               1
              121
             12321
            1234321
           123454321
          12345654321
         1234567654321
        123456787654321
       12345678987654321

 */