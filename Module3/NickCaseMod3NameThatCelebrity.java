/*
Program Name: Name That Celebrity
Assignment: Module 3, Lesson 6, Assignment 1
Author: Nick Case
Date:9/17/19
Version: 1.0
Program Description: This program prints out a celebrity's name with the first two and last three letters dropped and all in lower case to see if people can guess who it is.
What I learned from this program: reminded how to use .subtring() and indexs, how to use the .toLowerCase method, how to use \n escape sequence
What difficulties did I have and how I solved them: I set s1 final and the others by doing toLowerCase(s1.substring(2,9)); but then BlueJ said that method could not be found. I looked up online of some examples of it being used and it was being used like a regualar method, so I just attatched it like a regular method and it worked.
I put the \n next to the s1Final, but then BlueJ wouldn't compile it so I put in in a string and that make it work.
 */
public class NickCaseMod3NameThatCelebrity
{
    public static void main(String[] args)
    {
        String s1= "Taylor Swift"; //Setting Strings
        String s2= "John Boyega";
        String s3= "Emma Stone";
        String s1Final; //Declaring Variables to use for .substring
        String s2Final;
        String s3Final;
        s1Final = (s1.substring(2,9).toLowerCase()); //Taking a substring from the 2nd index to the 9th index (8th character) and putting it in lower case and then setting it to s1Final
        s2Final = (s2.substring(2,8).toLowerCase()); //Taking a substring from the 2nd index to the 8th index (7th character) and putting it in lower case and then setting it to s2Final
        s3Final = (s3.substring(2,7).toLowerCase()); //Taking a substring from the 2nd index to the 7th index (6th character) and putting it in lower case and then setting it to s3Final
        System.out.println ("Taylor Swift>>>" + s1Final +"\n" + "John Boyega>>>" + s2Final + "\n" + "Emma Stone>>>"+ s3Final);//Printing out the new substrings with a new line between each one.
    }
}
 /* Sample Output:
Taylor Swift>>>ylor sw
John Boyega>>>hn boy
Emma Stone>>>ma st
  */