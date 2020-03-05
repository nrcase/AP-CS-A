
/*Program Name: NickCaseMod3Rectangle
Assignment: Module 3, Lesson 2, Assignment 1
Author: Nick Case
Date: 9/10/19
Version: 1.0
Program Description: This program calculates the area and perimeter of a 4x5 rectangle and then adds one to the length and width and then does the area and perimeter calcualtions again.
What I learned from this program: how to use nesting parenthesis, Order of Operations, how to declare variables, 
What difficulties did I have and how I solved them: When I was doing the system prints at the end, after the string, I just put the variable there and then it wouldn't compile. I forgot that you need to add a "+" in order for the print to show both of the items.
I wasn't sure which interger data type to use for the variables, but then realized I have no decimals, so I could use int.
*/

public class NickCaseMod3Rectangle
{
    public static void main(String[] args)
    {
        int length, width, perimeter, area, bigPerimeter, bigArea;     //Declaring and Setting variables
        length = 5; 
        width = 4;
            area = length * width;                                     //Finding Area
            perimeter = (2*length) + (2*width);                        //Finding Perimeter
                bigPerimeter = (2*(length+1)) + (2*(width+1));         //Finding Perimeter with +1 to the length and width
                bigArea = (length+1) * (width+1);                      //Finding Area with +1 to the length and width
                    System.out.println ("Length = " + length);         //Bunch of System Prints printing out all the variables including the ones that had calcualtions.
                    System.out.println ("Width = " + width);
                    System.out.println ("Perimeter = " + perimeter);
                    System.out.println ("Area = " + area);
                    System.out.println ("BigPerimeter = " + bigPerimeter);
                    System.out.println ("BigArea = " + bigArea);
    }
}
 
/* Sample Output:
" Length = 5
Width = 4
Perimeter = 18
Area = 20
BigPerimeter = 22
BigArea = 30"
 */