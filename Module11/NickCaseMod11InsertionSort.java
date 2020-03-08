/*Program Name: Insertion Sort
Assignment: Module 11, Lesson 2, Practice Activity
Author: Nick Case
Date: 2/20/2020
Version: 1.0
Program Description: This program does a basic insertion sort
What I learned from this program: how to make a insertion sort algorithm, how insertion sorts work
What difficulties did I have and how I solved them: N/A, just followed the video
*/

public class NickCaseMod11InsertionSort
{
    public static void main(String [] args)
    {
        int[] list = {4,5,6,782,245,798,67983,1,10,7}; //Create list

        sort(list); //sort

            for (int var : list) //print list
            {
                System.out.print(var + ", ");
            }

    }

    public static void sort(int a[])
    {
        int itemToInsert = 0, j;
        boolean keepGoing;

        for (int k = 1; k < a.length; k++) // on kth time through, pass intem k into correct position among the first k items in the array
        {
            //Go backwards through the list, looking for a slot to insert a[k]
            itemToInsert = a[k]; //get current value
            j = k - 1;
            keepGoing = true;

            while ((j >= 0) && keepGoing)
            {
                if (itemToInsert < a[j]) //if the current item (itemToInsert) is less than the last item
                {
                    a[j + 1] = a[j]; //Salient Feature, set the last one one index forward
                    j--;
                    if (j == -1) //special case if inserting something at index 0
                    {
                        a[0] = itemToInsert;
                    }
                }
                else // When leaving loop, J + 1 is the index where itemToInsert is. If current is not less than last item
                {
                    keepGoing = false; //not loop again
                    a[j + 1] = itemToInsert; // put the current item at the end of the sub array
                }

            }
        }
    }
}
/* Sample Output:

1, 4, 5, 6, 7, 10, 245, 782, 798, 67983,

 */