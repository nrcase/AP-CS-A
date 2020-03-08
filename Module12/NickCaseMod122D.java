/*Program Name: 2D Arrays
Assignment: Module 12, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 3/8/20
Version: 1.0
Program Description: This program grows through different aspects of using and creating 2D arrays
What I learned from this program: how to use and create 2D arrays
What difficulties did I have and how I solved them: N/A
*/


import java.util.Arrays;

public class NickCaseMod122D
{
    public static void main(String [] args)
    {
        int a[][] = new int[3][2]; //declare array
        a[0][0] = 22; //Below is setting values
        a[0][1] = 23;
        a[1][0] = 24;
        a[1][1] = 25;
        a[2][0] = 26;
        a[2][1] = 27;

        int b[][] = { //initializing and setting values
                {22,33},
                {24,25},
                {26,27}
        };

        int c[][] = new int[][]{ //another way to initialize and set values for 2D array
                {22,23},
                {24,25},
                {26,27}
        };

        System.out.println(a.length); //Printing out the length of array, number of rows
        System.out.println(a[0].length); //printing out number of columns for row 0

        int a2[][] = { //Declaring and setting another 2D array
                {3,9,2,1},
                {5,7,6,0}
        };

        int b2[][] = { //Declaring and setting another 2D array
                {0,2,8,4},
                {3,9,2,1}
    };

        System.out.println(Arrays.equals(a2,b2)); //always false, won't compare 2 2D arrays
        System.out.println(Arrays.equals(a2[0],b[1]));//false, compares row 0 of A to row 1 of b

        //Arrays.sort(a); Does not work
        Arrays.sort(a2[0]); //Can sort one row

        System.out.println(Arrays.binarySearch(a2[0], 9)); //searching through first row for 9

        //Arrays.fill(a,22); can't fill 2D array
        Arrays.fill(a2[1],22); //But can fill one row

    }
}
/* Sample Output:

3
2
false
false
3

 */
