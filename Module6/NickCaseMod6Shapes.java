/*Program Name: Shapes
Assignment: Module 6, Lesson 6, Assignment 1
Author: Nick Case
Date: 11/13/19
Version: 1.0
Program Description:  This program gets the number of rows and the character you want and then prints out a triangle with that number of rows.
What I learned from this program: how to use nested loops
What difficulties did I have and how I solved them: I wasn't sure how to get the character to increase with the row and then I realized that I needed to use a second loop that incremented each time a row was printed, and then have the inside loop that actually prints the character follow and use the incremented variable.
Comments: I wasn't sure on how to store all the different inputs for each of the triangles and have them change in the loop each time, so I just had every triangle print out after and the choice to continue and print out more is after the print.
*/

import java.util.*;
public class NickCaseMod6Shapes
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);//Creating Scanner Object
        int rows1, answer = 1; //Declaring and initalizing variables
        char char1 ;

        while (answer == 1) //while answer = 1
        {
            System.out.print("How many rows: "); //Get number of rows
            rows1 = userInput.nextInt();
            System.out.print("What character: "); //Get the character
            char1 = userInput.next().charAt(0);

            for (int count = 0 ;count < rows1; count++) //Increments count in order to tell how many chars to print on 1 line
            {
                for (int count2 = 0; count2 <= count; count2++) //Prints out the character and loops depending on how many times the first loop has looped
                {
                    System.out.print(char1);
                }
                System.out.println();  //Creating new line
            }
            System.out.println("Do you want to print another shape? Yes = 1, No = 2"); //Ask for new line?
            answer = userInput.nextInt(); //If answer is 1, go back to while loop, if something else (2), end program.
        }
    }
}

/* Sample Output:
How many rows: 3
What character: A
A
AA
AAA
Do you want to print another shape? Yes = 1, No = 2
1
How many rows: 7
What character: X
X
XX
XXX
XXXX
XXXXX
XXXXXX
XXXXXXX
Do you want to print another shape? Yes = 1, No = 2
1
How many rows: 1
What character: R
R
Do you want to print another shape? Yes = 1, No = 2
1
How many rows: 5
What character: T
T
TT
TTT
TTTT
TTTTT
Do you want to print another shape? Yes = 1, No = 2
1
How many rows: 4
What character: W
W
WW
WWW
WWWW
Do you want to print another shape? Yes = 1, No = 2
2


 */