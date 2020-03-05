/*Program Name: Array Time
Assignment: Module 11, Lesson 1, Assignment 1
Author: Nick Case
Date: 2/19/20
Version: 1.0
Program Description: This program creates an array with a variable size and then sorts it and then counts duplicates
What I learned from this program: how to create arrays, how to fill arrays with random numbers, how to find duplicates, how to sort using selection sort
What difficulties did I have and how I solved them: I kept getting the same numbers in my arrays each time and then I realized I would set the size to 10,000 but the range of generated numbers is would only be up to 1,000. So I changed the upper limit on the random numbers to the size and then it started to work.
*/

import java.util.*;

public class NickCaseMod11ArrayTime
{
    public static void selectionSort( int[] array )
    {
        // Find the integer that should go in each cell of
        // the array, from cell 0 to the end
        for ( int j=0; j<array.length-1; j++ )
        {
            // Find min: the index of the integer that should go into cell j.
            // Look through the unsorted integers (those at j or higher)
            int min = j;
            for ( int k=j+1; k<array.length; k++ )
            {
                if ( array[k] < array[min] )
                {
                    min = k;
                }

            }
            // Swap the int at j with the int at min
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

    }

    public static void main ( String[] args )
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner
        int size = 0;

        System.out.print("What is the size of the array? ");
        size = userInput.nextInt(); //Getting size


        int[] values = new int[size]; //creating array based on wanted size

        Random r = new Random(); //creating random object

        for (int count = 0; count < values.length; count++) //putting random values inside the array
        {
            values[count] = r.nextInt(size);
        }

        System.out.println("Size of the array --> " + size); //Printing size

        if (size > 50) //if the size is greater than 50, don't print the array
        {
            System.out.print("Before: ");
            System.out.println("Not Sorted");
        }
        else
        {
            // print out the array
            System.out.println("initial values: "); //Print out array
            for ( int val : values )
            {
                System.out.print( val + ", " );
            }

            System.out.println( );
        }

        long startTime = System.currentTimeMillis(); //get start time for 1st run
        // sort the array
        selectionSort( values ); //sort 1 time

        long endTime = System.currentTimeMillis(); //get end time for 1st run
        System.out.println("\nTotal execution time: " + (endTime - startTime) + " Milliseconds " ); //print time for 1st run

        long startTime2 = System.currentTimeMillis(); //get start time for the 2nd run
        // sort the array
        selectionSort( values ); //running for the second

        long endTime2 = System.currentTimeMillis(); // get end time for the 2nd run
        System.out.println("Total execution time: " + (endTime2 - startTime2) + " Milliseconds \n" ); //print time for second run

        int duplicate = 0;
        int previous = -1;

        for (int index = 0; index < values.length - 1; index++ ) //duplicate finder, looking through array
        {
            if (values[index] == previous) //if the current value at index is equal to the previous number, increment duplicate
            {
                duplicate++;
            }
            else //if not equal
            {
                previous = values[index]; //set previous to the current value to use to compare the next numbers
            }
        }

        System.out.println("The number of duplicates are: " +  duplicate); //printing duplicates

        if (size > 50) //if the size is greater than 50
        {
            System.out.print("After: "); //don't print out, just say sort, says in doc
            System.out.println("Sorted");
        }
        else
        {
            // print out the array
            System.out.println("\nAfter");
            for ( int val : values )
            {
                System.out.print( val + ", " );
            }
            System.out.println( );
        }
    }
}
/* Answer to Question 4: The second time it sorts it is only slightly faster because a selection sort still has to consider every pair of numbers, but the second time it doesn't have to do any moves, so it is slightly faster.

Sample Output:

What is the size of the array? 50
Size of the array --> 50
initial values:
32, 33, 23, 7, 26, 25, 20, 46, 25, 0, 38, 3, 28, 33, 36, 17, 48, 48, 29, 16, 24, 4, 49, 20, 26, 10, 46, 32, 47, 6, 24, 36, 1, 8, 44, 18, 5, 28, 44, 2, 12, 11, 1, 21, 35, 23, 11, 46, 28, 17,

Total execution time: 0 Milliseconds
Total execution time: 0 Milliseconds

The number of duplicates are: 17

After
0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 11, 12, 16, 17, 17, 18, 20, 20, 21, 23, 23, 24, 24, 25, 25, 26, 26, 28, 28, 28, 29, 32, 32, 33, 33, 35, 36, 36, 38, 44, 44, 46, 46, 46, 47, 48, 48, 49,

What is the size of the array? 1000
Size of the array --> 1000
Before: Not Sorted

Total execution time: 4 Milliseconds
Total execution time: 1 Milliseconds

The number of duplicates are: 371
After: Sorted



 */

