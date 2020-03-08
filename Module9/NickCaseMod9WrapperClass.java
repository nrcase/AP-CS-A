/*Program Name: Wrapper Class
Assignment: Module 9, Lesson 5, Practice Activity 1
Author: Nick Case
Date: 1/27/20
Version: 1.0
Program Description: This program converts a string to a double
What I learned from this program: how to use wrapper classes and the methods inside them
What difficulties did I have and how I solved them: N/A, just followed the video
*/

public class NickCaseMod9WrapperClass
{
    public static void main(String [] args)
    {
        String s = "282.8026"; //Creating String with double inside
        double d = Double.parseDouble(s); //Using parsing and the Double wrapper class to convert string to double
        System.out.println(d); //Print the double
    }
}

/* Sample Output;

282.8026

 */
