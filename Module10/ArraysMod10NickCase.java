/*Program Name: Arrays
Assignment: Module 10, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 2/2/20
Version: 1.0
Program Description: This program follows 3 videos and ends up creating a double array and prints out the default and then splits a string based on whitespace and stores it inside an array.
What I learned from this program: How to create arrays, how to add numbers and strings to arrays, how to use .length, how to use .split()
What difficulties did I have and how I solved them: No problems, just followed the video =)
*/

public class ArraysMod10NickCase
{
    public static void main(String [] args)
    {
       /* int grade1 = 97; Way to do w/o array
        int grade2 = 62;
        int grade3 = 85;*/

       //int grade[] = {97, 62, 85, 26}; //preferred way of creating an array

        /*int grade[] = new int[400]; Create array
        grade[0] = 97; setting array
        grade[1] = 62;*/

       // int grade[] = new int[] {97, 62, 85, 26}; another way to create and set array

        /*int sq[] = new int[1000]; //how to initialize an array

        for (int j = 0; j < sq.length; j++) //loop to print out the indexes of a the array
        {
            sq[j] = j * j;
        }

        System.out.println(sq[5]); printing the 5th index*/

        double d[] = new double[1000]; //new double array with 1000 as the length
        System.out.println(d[500]); //printing default value at 500

        String s = "Hello again"; //Declaring string
        String sp[]; //creating string array

        sp = s.split("\\s"); //splitting string by white space and then storing the pieces inside the arrAy

        for (int j = 0; j < sp.length; j++) //Loop to print out indexes of array
        {
            System.out.println(sp[j]);
        }

       //System.out.println(grade[1]);
       //System.out.println(grade.length);

    }
}
/* Sample Output:

0.0
Hello
again

 */



