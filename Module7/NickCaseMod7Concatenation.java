/*Program Name: Concatenation
Assignment: Module 7, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 11/25/19
Version: 1.0
Program Description: This program finds the length for 2 combined strings and gets a substring from a main string
What I learned from this program: how to use .length, how to add strings together
What difficulties did I have and how I solved them: N/A, pretty easy stuff we did earlier this year
*/

public class NickCaseMod7Concatenation
{
    public static void main(String [] args)
    {
        String nm = "Hello"; //Setting variables
        String nx = "good buddy";
        String c = nm + " " + nx; //Combining strings
        System.out.println(c.length()); //printing length of strings


        String myPet = "Sparky the dog"; //Setting variables
        String smallPart = myPet.substring( 4 , 12 ); //creates substring from 4th index to 11th index
        System.out.println(smallPart);  //Prints the substring

    }
}
/* Sample Output:

16
ky the d

 */