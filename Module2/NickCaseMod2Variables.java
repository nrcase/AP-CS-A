/*Program Name: NickCaseMod2Variables
Assignment: M2L2 Assignment
Author: Nick Case   
Date: 9/3/19
Version: 1.0
Program Description: This program displays my name, current age and my age 5 years from now.
What I learned from this program: How to create integer variables, string variables and continue to memorize and cement the Java skeleton.
What difficulties did I have and how I solved them: I was unsure of how to delcare my integer variables, so I went back to the 4th page of the notes to find out.
I was confused on how to create a variabe that wasn't a number, so I googled and found how to declare the date type as a String instead of a integer or floating point.
*/

public class NickCaseMod2Variables
{
    public static void main (String[] args)
    {
        int Age,FutureAge;
        String Name;
        Name= "Nick Case";
        Age= 17;
        FutureAge = Age+5;
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(FutureAge); 
    }
}
