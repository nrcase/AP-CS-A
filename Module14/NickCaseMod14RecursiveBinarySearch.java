/*Program Name: Recursive Binary Search
Assignment: Module 14, Lesson 6, Practice Assignment 1
Author: Nick Case
Date: 4/2/20
Version: 1.0
Program Description: This program does a binary search on a list of numbers in a text file and finds the index of a chosen number
What I learned from this program: how to use recursion, recursion for binary search, how to turn iterative into recursive
What difficulties did I have and how I solved them: I was getting errors for big numbers towards the end of the array, so I went back and checked what my lower boundary and upper boundary numbers were and I realized I set them to the actual numbers inside the array when they needed to be the indexes of the start and the end, not the actual start and end numbers.
*/

import java.io.*;
import java.util.Scanner;

public class NickCaseMod14RecursiveBinarySearch
{
    public static void main(String [] args) throws FileNotFoundException
    {
        File file = new File("C:/Users/sort-1.txt"); //Creating file object and scanner to read file
        Scanner fileReader = new Scanner(file);
        
        Scanner userInput = new Scanner(System.in); //creating userInput
        
        int index = 0;
        int[] values = new int[60]; //creating int array

        while (fileReader.hasNext()) //putting values from the file into the array
        {
            values[index] = fileReader.nextInt();
            index++;
        }

        System.out.print("Enter a number to search for: "); //getting user input
        int choice = userInput.nextInt();

       int finalAnswer = binaryRecursiveSearch(choice,values, 0, 59); //doing the search and setting the result to final answer

        if (finalAnswer == -1) //if the number is not found
        {
            System.out.print("Your number does not occur in this list"); //print not found
        }
        else //else, print the index at where the number is
        {
            System.out.print("Your number occurs at position " + (finalAnswer + 1));
        }

    }

    public static int binaryRecursiveSearch(int search, int[] array, int start, int end)
    {

        int mid = (start + end)/2; // get the middle

        if(end < start){
            return -1; // going too far
        }


        if (search < array[mid]){
            return binaryRecursiveSearch(search, array, start, mid - 1); // find if search is below
        }

        if (search > array[mid]){
            return binaryRecursiveSearch(search, array, mid + 1, end); // find is search is above
        }

        if (search == array[mid]){
            return mid; // if the search is right in the middle
        }

        return -1;
    }
}

/* Sample Output:

Enter a number to search for: 60
Your number occurs at position 41

Enter a number to search for: 92
Your number occurs at position 53

Enter a number to search for: 110
Your number does not occur in this list

 */
