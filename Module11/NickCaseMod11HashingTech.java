/*Program Name: Hashing Practice
Assignment: Module 11, Lesson 5, Practice Assignment 1
Author: Nick Case
Date: 2/26/20
Version: 1.0
Program Description: This program does a basic hashing algorithm with user input
What I learned from this program: how to make a hashing method, what is hashing, how hashing works.
What difficulties did I have and how I solved them: N/A, just followed the video and added a bit more for context.
*/

import java.util.Scanner;

public class NickCaseMod11HashingTech
{
    public static void main(String [] args)
    {
        Scanner user = new Scanner(System.in); //Get user input

        System.out.println("Select Key");
        int choice = user.nextInt();

        double hash = hashCode(choice);

        System.out.println(hash); //print the hashed version of the input

    }

    public static int hashCode(int key) //Hash code method
    {
        final int TABLE_SIZE = 75; //Creates hash by taking the key and modulues it by the table size
        return key % TABLE_SIZE; //Will return hash
    }
}

/* Sample Output:

Select Key
1872461048
23.0

 */
