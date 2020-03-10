/*Program Name: Max and Min and Largest Integer
Assignment: Module 12, Lesson 1, Assignment 2
Author: Nick Case
Date: 3/9/20
Version: 1.0
Program Description: This program finds the max and min of a 2D array and also finds the biggest Integer per row
What I learned from this program: how to find min and max of 2D array, how to find a specific type of number per row
What difficulties did I have and how I solved them: N/A, pretty straightforward
*/

public class NickCaseMod12Assignment2
{
    public static void main(String[] args)
    {
        int[][] data = {{3, 2, 2369}, //declaring and setting 2D array
                {1, 4, 4, 8, -654},
                {9, 1, 0, 9},
                {0, 0, 0, 0, 0, 0}};

        // declare and initialize the max and the min
        int max = 0, min = 0, largestInt = 0;

        //loops for getting max and min
        for (int row = 0; row < data.length; row++) //going through rows
        {
            for (int col = 0; col < data[row].length;col++) //going through columns
            {
                if (data[row][col] > max) //if the current data point is greater than the max
                {
                    max = data[row][col]; //make the new max that data point
                }

                if (data[row][col] < min) //if the current data point is less than the min
                {
                    min = data[row][col]; //make the new min that data point
                }
            }
        }

        // write out the results
        System.out.println( "max = " + max + "; min = " + min );

        for (int row = 0; row < data.length; row++) //going through rows
        {
            largestInt = 0; //setting largest Int back to 0 for each Row, want biggest in each row, not entire array

            for (int col = 0; col < data[row].length; col++) //going through columns
            {
                if (data[row][col] > largestInt) //if the current data point is greater than the largest Integer in the row so far
                {
                    largestInt = data[row][col]; //set the data point as the new Largest Integer in the row
                }
            }
            System.out.println("Largest Int is " + largestInt); //print the largest Integer per row
        }

    }
}
/* Sample Output:

max = 2369; min = -654
Largest Int is 2369
Largest Int is 8
Largest Int is 9
Largest Int is 0

 */