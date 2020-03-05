/*Program Name: Insertion Sort
Assignment: Module 11, Lesson 2, Assignment 1
Author: Nick Case
Date: 2/24/20
Version: 1.0
Program Description: This program creates a changeable size array with every 10th number's range increased and then sorts it and finds median and average.
What I learned from this program: how to use an insertion sort, how an insertion sort works, how to find median, how to generate random numbers
What difficulties did I have and how I solved them: I wasn't sure how to get random numbers and using Math.random was not useful because I needed to control the range and be able to change it. I googled it and found the random class and objects and they provided what I wanted to do.
*/

import java.util.*;

public class NickCaseMod11InsertionSort
{
    public static void insertionSort (int[] list) //Insertion sort
    {       //  For each unsorted integer
        for (int j = 1; j < list.length; j++)
        {           //  Keep swapping with its left neighbor           //  until it is larger or equal to left neighbor
            int k = j;
            while (k > 0 && list[k-1] > list[k] )
            {
                int temp  = list[k-1];
                list[k-1] = list[k];
                list[k]   = temp;
                k--;
            }
        }
    }

    public static void isSorted(int a[], int size) //method to check if the array is sorted or not
    {
        int count = 0;
        for (int index = 0; index < a.length - 1; index++) //for all the numbers in the array
        {
            if (a[index] <= a[index + 1]) //if they are in the right order, add one
            {
                count++;
            }
        }

        if(count + 1 == size )  //if count + 1 (Starts at 0) equals the size, all the numbers are less than one index greater than them.
        {
            System.out.println("Sorted");
        }
        else
        {
            System.out.println("Not Sorted"); //else not sorted b/c at least one number out of order
        }
    }

    public static void main ( String[] args )
    {
        Scanner userInput = new Scanner(System.in); //creating Scanner Object
        Random random = new Random(); //creating random object

        System.out.print("What is the size of the array? ");
        int size = userInput.nextInt();  //getting size

        System.out.println("Size of the array ---> " + size); //printing size

        int[] values = new int[size]; //initializing array

        for (int index = 0; index < values.length; index++ ) //loop to put values into the array
        {

            if (index % 10 == 0 && index != 0) //every 10th index spot, the range of the numbers that could be in there is increased by 1000
            {
                values[index] = random.nextInt(size + 10000);
            }
            else //if not a 10th index, normal range
            {
                values[index] = random.nextInt(size);
            }
        }

        if (size > 50) //if the size is greater than 50
        {
            System.out.print("\nBefore: ");
            isSorted(values, size); //Do sorted method to see if sorted or not and print out results
        }
        else
        {
            System.out.println("\nBefore: ");
            for ( int val : values ) // print out the array
            {
                System.out.print( val + ", " );
            }
        }

        long startTime = System.currentTimeMillis();
        insertionSort( values );
        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + " milliseconds"); //get running time

        if (size > 50) //if the size is greater than 50
        {
            System.out.print("\nAfter: ");
            isSorted(values, size); //print out whether it is sorted or not
        }
        else //if below 50 size, print out the array
        {
            System.out.println("\nAfter: ");
            for ( int val : values )
            {
                System.out.print( val + ", " );
            }
        }

        double median;
        double median1;
        double median2;

        if (size % 2 == 0) //if the size is even
        {
            median1 = values[(size + 1) / 2]; //get the 2 middle numbers
            median2 = values[((size + 1) / 2) - 1];

            median = ((median1 + median2) / 2); //find the average of them to get the median

        }
        else //if it is odd
        {
            median = values[(size) / 2]; //get the median
        }

        System.out.println("\nThe median is " + median); //print median

        double average = 0;
        for (int value : values) //get average
        {
            average = average + value;
        }

        average = average / size;

        System.out.printf("The average is %.2f",average); //print average

    }

}
/* Sample Output:

New:
What is the size of the array? 100
Size of the array ---> 100

Before: Not Sorted

Total execution time: 0 milliseconds

After: Sorted

The median is 59.0
The average is 369.26

Old:
What is the size of the array? 100
Size of the array ---> 100

Before: Not Sorted

Total execution time: 0 milliseconds

After: Sorted

The median is 54.0
The average is 91.03

The median is generally the same, but the average or mean is completely different.
 */
