/*Program Name: Finding Sum and Average
Assignment: Module 6, Lesson 1, Assignment 1
Author: Nick Case
Date: 10/29/19
Version: 1.0
Program Description: This program takes an input from a text file finds the sum, average and how many numbers there are.
What I learned from this program: how to use a while loop, reinforced reading from text file and using printf
What difficulties did I have and how I solved them: The numbers at the end had too many decimals to make sense for money in the output, so I put in a printf instead of a println and was able to round it.
*/

import java.io.*;
import java.util.*;
public class NickCaseMod6FindingSumAndAverage
{
    public static void main(String [] args) throws IOException
    {
        Scanner file = new Scanner(new File("/Users/nickcase/Desktop/M6L1.in")); //Importing txt file
        double itemCost, sum = 0; //Declaring variables
        int count = 0;
        while (file.hasNext()) //while the file has data
        {
            itemCost = file.nextDouble(); //set the next double to item cost
            sum = itemCost + sum; //Add item cost and the previous sum to get the new sum
            count++; //increment count by 1
            System.out.println(itemCost); //print item cost
        }
        System.out.printf("\nThe sum of the cost = $" + "%.2f",sum); //Print sum on a new line rounded with 2 decimal places
        System.out.println("\nThe number of costs = " + count); //Print Count
        System.out.printf("The average cost = $" + "%.2f",(sum/count)); //Print the average by dividing sum by count and then rounding that to 2 decimal places.
    }
}

/* Sample Output:

14.99
39.99
69.95
74.95
59.95
49.95
75.5
14.5
29.95
29.95
0.0
12.95
3.25
2.75
5.45
4.69

The sum of the cost = $488.77
The number of costs = 16
The average cost = $30.55

 */