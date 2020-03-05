/*Program Name: Top Secret
Assignment: Module 4, Lesson 2, Assignment 1
Author: Nick Case
Date: 9/25/19
Version: 1.0
Program Description: This program asks for initials and then converts them to ASCII code and then displays it. If a number or other character is entered, an error message is displayed and the program stops.
What I learned from this program: how to use Scanner class, how to use .toUpperCase(), how to use .charAt(), how to use if statements, how to use Character class, how to use .isLetter, how to negate conditionals, how to quit programs, how to convert from string to ASCII
What difficulties did I have and how I solved them: I wasn't sure how to turn a string into a char, so I looked it up and found the .charAt() method and how to use it. I then put it in my program to convert a string to a char and it worked.
I wasn't sure how to use the if statement so I just tried many different things and used the error messages to get it right. Eventually I did and was able to print the error messages.
I tried the System.exit() statement, but it kept telling me something was wrong. I looked up how to use it on google and found that I needed to put a 0 inside the argument.
I forgot how to convert a char into ASCII so I went back to the notes and watched the video and then remembered to do the type casting in order to get it.
*/
import java.io.*;
import java.util.*;
public class NickCaseMod4TopSecret
{
    public static void main(String [] args)
    {
       Scanner inputScanner = new Scanner(System.in); //Creating Scanner object
       
       System.out.print("Enter the first initial of your first name: "); 
       String firstInitial = inputScanner.next(); //Getting input
       firstInitial = firstInitial.toUpperCase(); //String to Upper Case
       char firstInitialChar = firstInitial.charAt(0); //Taking the character at the 0th index and putting it into char firstInitialChar
       
       if (!Character.isLetter(firstInitialChar)) //If the input is not a letter,
       {
           System.out.print("Invalid Input");
           System.exit(0); //Quit
       }
       
       System.out.print("Enter the first initial of your last name: ");
       String lastInitial = inputScanner.next(); //Getting input
       lastInitial = lastInitial.toUpperCase(); //String to Upper Case
       char lastInitialChar = lastInitial.charAt(0); // Taking the character at the 0th index in putting it into char lastInitialChar
       
       if (!Character.isLetter(lastInitialChar)) //If input is not a letter, 
       {
           System.out.print("Invalid Input");
           System.exit(0); //Quit
       }
       
       int finalFirst = (int)firstInitialChar; //Taking the characters in firstInitialChar and lastInitialCharand turn it into ASCII through type casting
       int finalLast = (int)lastInitialChar;
        System.out.println ("Intials: " + firstInitial + " " + lastInitial); //Printing encrypted initials
        System.out.println ("Encrypted Name: " + finalFirst + " " + finalLast);
   }
}
/*Sample Output:
Enter the first intial of your first name: N 
Enter the first intial of your last name: C
Intials: N C (These two would change depending on what characters are put in)
Encrypted Name: 78 67 

If something other than a number is inputted:
Enter the first intial of your first name: 6
"Invalid Input" (And then it quits)

or 

Enter the first intial of your first name: N 
Enter the first intial of your last name: 4
"Invalid Input" (And then it quits)
*/