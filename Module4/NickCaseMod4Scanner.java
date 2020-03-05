/*Program Name: Lesson 7 Scanner
Assignment: Module 4, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 9/24/19
Version: 1.0
Program Description: This programs asks for 2 integers then multiplies them, asks for 2 doubles and displays the first, asks for a string and then prints the before the delimiter and then after the delimiter, and then finally prints the entire string.
What I learned from this program: how to create a object, how to create a Scanner object, how to use .nextInt,.next(),.nextDouble(),.nextLine() and how to use them correctly
What difficulties did I have and how I solved them: I was working on the last part in the last video and I went to ran it and BlueJ kept returning an error. I figured it was because I had the other code above from the previous videos. I then tried commenting the entire part above it and it worked. So when I want to use or see the output of that final line of code, I just need to Multi-line comment everything above it out.
*/

import java.io.*; //Importing packages for the Scanner class
import java.util.*;
public class NickCaseMod4Scanner
{
  public static void main (String [] args)
  {
      Scanner kbReader = new Scanner(System.in); //Creating Scanner object kbReader
      
      System.out.print("Enter your integer here. "); //Asking for integer
      int i = kbReader.nextInt(); //Inputting 2 integers
      int j = kbReader.nextInt();
      System.out.println(j*i); //Mutiplying the 2 inputted integers
      
      /* Sample Output:
       * i*j
       * Ex; Input= 2 5
       * "10"
       */
      
      System.out.print("Enter your double here. "); //Asking for double
      double d = kbReader.nextDouble(); //Inputting 2 doubles
      double dd = kbReader.nextDouble();
      System.out.println(d); //Printing out the 1st double inputted
      
      /* Sample Output:
       * d
       * Ex: Input 2 5
       * "2"
       */
      
      System.out.print("Enter your String here. "); //Enter One Two, Asking for a string
      String s = kbReader.next(); //Inputting a the string up until the delimiter
      System.out.println ("This is the first part of the String,..." + s); //Prints before the delimiter
      s = kbReader.next(); //Gets the second part of th string ater the delimiter
      System.out.println ("This is the next part of the String,..." + s); //Prints the part after the delimiter.
      
      /* Sample Output:
       * This is the first part of the String,... s
       * This is the next part of the String,...  s
       * Ex: Input = One Two 
       * "This is the first part of the String,... One
       *  This is the next part of the string,... Two"
       */
      
      System.out.print("Enter your String here. "); //Enter One Two Three, Asking for a string
      String x = kbReader.nextLine(); //Inputting an enire string, not stopping at the delimiter
      System.out.println(x); //Printing the input
      
      /* Sample Output:
       * x
       * Ex: Input = One Two Three
       * "One Two Three"
       */
  }
}
