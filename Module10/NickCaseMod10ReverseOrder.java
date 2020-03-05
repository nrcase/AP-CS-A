/*Program Name: Reverse Order
Assignment: Module 10, Lesson 1, Assignment 1
Author: Nick Case
Date: 2/3/20
Version: 1.0
Program Description: This program takes a preset string entered with a static number of items in it and reverses it.
What I learned from this program: how to create an array, how to use the .length variable call, how to print arrays
What difficulties did I have and how I solved them: No real problems, not sure if I did this right.
*/

public class NickCaseMod10ReverseOrder
{
    public static void main(String [] args)
    {
        int[] val = {0, 1, 2, 3}; //Creating Array
        int temp = val.length; //Setting variable temp equal to the length of the array
        System.out.println( "Original Array: "          + val[0] + " " + val[1] + " " + val[2] + " " + val[3] ); //Printing the original array
        // reverse the order of the numbers in the array
        System.out.println( "Reversed Array: "          + val[temp - 1] + " " + val[temp - 2] + " " + val[temp - 3] + " " + val[temp - 4] ); //printing the reverse array by taking the length and subtracting from the end to find then indexes of the reversed order
    }
}
/* Sample Output:

Original Array: 0 1 2 3
Reversed Array: 3 2 1 0

 */