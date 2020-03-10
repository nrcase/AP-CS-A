/*Program Name: Adding Columns and Arrays
Assignment: Module 12, Lesson 1, Assignment 1
Author: Nick Case
Date: 3/9/20
Version: 1.0
Program Description: This program takes a 2D array and adds the rows and columns
What I learned from this program: how to add columns, how to add rows, how to use an 1D array to count vertically
What difficulties did I have and how I solved them: I wasn't sure how to get the computer to count vertically, but then I realized that you don't have to. You still go by row and as you go row by row, add the current value to it's column's sum value in the other array. You are finding the column values but not actually counting vertically. 
*/


public class NickCaseMod12Assignment1
{
    public static void main(String[] args)
    {
        int[][] data = {{3, 2, 5}, //declaring Array
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}};

        int sumRow; //Declaring Array Sums
        int sumColumn;
        // declare the sum

        // compute the sums for each row
        for (int row = 0; row < data.length; row++)
        {
            // initialize the sum
            sumRow = 0;

            for (int col = 0; col < data[row].length;col++)
            {// compute the sum for this row
                sumRow = sumRow + data[row][col];
            }

            // write the sum for this row
            System.out.println(sumRow);
        }
        int maxColumnLength = 0;

        for (int count = 0; count < data.length; count++) //get max column length of the array
        {
           if (data[count].length > maxColumnLength)
           {
               maxColumnLength = data[count].length;
           }
        }

        int[] columnSums = new int[maxColumnLength]; //create array to hold the sums

        for (int row = 0; row < data.length; row++) //for iterating over each row
        {
            // initialize the sum
            sumColumn = 0;
            // compute the sum for this row
            for (int col = 0; col < data[row].length;col++) //for each column
            {
                columnSums[col] = columnSums[col] + data[row][col]; //add the current value to it's index that will hold the sum of it's column
            }

            // write the sum for this row

        }

        System.out.println();

        for (int temp : columnSums) //printing out sums
        {
            System.out.println(temp);
        }

    }
}

/* Sample Output:

10
30
12
2

13
9
15
13
12
-8

 */
