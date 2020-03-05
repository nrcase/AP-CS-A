/*Program Name: Rectangle
Assignment: Module 9, Lesson 2, Assignment 2
Author: Nick Case
Date: 1/8/20
Version: 1.0
Program Description: This program does the area and perimeter of a rectangle
What I learned from this program:  how to use objects, how to create classes to define objects
What difficulties did I have and how I solved them: I wasn't sure how to create a default constructor, so I went back to the notes and then that showed me how to do it.
*/

import java.util.Scanner;

public class NickCaseMod9RectangleRunner
{
    public static void main(String [] args)
    {
        LoopRepeat choice = new LoopRepeat("y"); //Creates LoopRepeat object with y stored as a string
        Scanner userInput = new Scanner(System.in); //Creating Scanner

        while(choice.getString().equals("y")) //Repeat while the string inside the loopRepeat object is equal to y
        {

            System.out.print("Please enter the length of the rectangle (in inches)? ");
            Rectangle Rec1 = new Rectangle(userInput.nextInt()); //getting the length of the rectangle with object Rec1

            System.out.print("Please enter the width of the rectangle (in inches)? " );
            Rectangle Rec2 = new Rectangle(userInput.nextInt()); //getting the length of the rectangle with object Rec2

            System.out.print("The area of the rectangle is " + (Rec1.getLength() * Rec2.getLength())); //Finding area by multiplying the 2 lengths
            System.out.print(". The perimeter is " + ((2 * Rec1.getLength()) + (2 * Rec2.getLength()))); //Finding perimeter
            System.out.print(". Would you like to run another (y/n)?");
            choice.setString(userInput.next());//getting input to run again or not

        }
    }
}
/* Sample Output:

Please enter the length of the rectangle (in inches)? 4
Please enter the width of the rectangle (in inches)? 2
The area of the rectangle is 8. The perimeter is 12. Would you like to run another (y/n)?y
Please enter the length of the rectangle (in inches)? 3
Please enter the width of the rectangle (in inches)? 2
The area of the rectangle is 6. The perimeter is 10. Would you like to run another (y/n)?n


 */
