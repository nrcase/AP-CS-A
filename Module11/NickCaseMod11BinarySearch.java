/*Program Name: Binary Search
Assignment: Module 11, Lesson 4, Assignment 1
Author: Nick Case
Date: 2/25/20
Version: 1.0
Program Description: This program reads data from a text file, puts it in a array and can search for a number
What I learned from this program: how to create a binary search and how it works
What difficulties did I have and how I solved them: I couldn't remember how to read a file input, but I screenshoted the code at the start of the class so I could use it later. I went back to that picture and then realized that I had to create a file object inside of a scanner object and then that would input data.
*/

import java.io.*;
import java.util.*;

public class NickCaseMod11BinarySearch
{
    public static void main(String [] args) throws IOException
    {
        Scanner fileInput = new Scanner(new File("C:\\Users\\ModuleElevenLessonFourAssignmentDataFile.txt")); //importing text file
        Scanner userInput = new Scanner(System.in); //creating Scanner
            
            int[] array = new int[60]; //creating array
            int output, choice;

            for (int index = 1; index < array.length; index++) //putting data file into the array
            {
                array[index] = fileInput.nextInt();
            }

            System.out.print("Enter a number to search for: "); //getting user search
            choice = userInput.nextInt();

            output = binarySort(array, choice); //doing the binary search

            if (output == -1) //if the number doesn't exist, print does not exist
            {
                System.out.println("Your number does not occur in this list. ");
            }
            else //else print out the index where the number exists
            {
                System.out.println("Your number occurs at position " + output);
            }
    }

    private static int binarySort(int a[], int searchKey) //binary search method
    {
        int ub = a.length - 1; //creating upper limit
        int lb = 0; //creating lower limit


        while (lb <= ub) //while the limits don't overlap
        {
            int mid = (ub + lb) / 2; //create middle index

            if (a[mid] == searchKey) //if mid is equal to the key, return mid
            {
                return mid;
            }
            else if (searchKey > a[mid]) // if the searchKey is greater than the value at mid, set the lower boundary to mid + 1
            {
                lb = mid + 1;
            }
            else // if searchKey is less than the value at mid, set the upper boundary to mid - 1
            {
                ub = mid - 1;
            }
        }

        return -1; //if no number was found, return -1
    }
}

/* Sample Output:

Enter a number to search for: 110
Your number does not occur in this list.

Enter a number to search for: 60
Your number occurs at position 41

 */
