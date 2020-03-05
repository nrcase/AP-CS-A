/*Program Name: Sorting Arrays
Assignment: Module 11, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 2/18/20
Version: 1.0
Program Description: This program sorts 2 programs, one with bubble sort and the other with selection sorting
What I learned from this program: how to create bubble and selection sort algorithms.
What difficulties did I have and how I solved them: no problems, just followed the videos.
*/

public class NickCaseMod11SortArrays
{
    public static void main(String [] args)
    {
         int[] theArray = {1,3,5,6,2,35,67,8}; //Initializing Arrays
         int[] theArray2 = {3,245,6,789,876,5,31,4};

         sortBubble(theArray); //Sorting with bubble
         sortSelection(theArray2);//Sorting with selection

         for (int count = 0; count < theArray.length; count++) //printing bubble sorted
         {
             System.out.print(theArray[count] + " ");
         }

         System.out.println();

        for (int count = 0; count < theArray2.length; count++) //print selection sorted
        {
            System.out.print(theArray2[count] + " ");
        }

    }

    public static void sortBubble(int a[])
    {
        boolean loopSomeMore;
        do {
            loopSomeMore = false;
            for (int index = 0; index < a.length - 1; index++)
            {
                if(a[index] > a[index + 1]) // if the current number is greater than the next number
                {
                    int temp = a[index]; //Swap places
                    a[index] = a[index + 1];
                    a[index + 1] = temp;
                    loopSomeMore = true; //run again and move on to next set of numbers on the big loop
                }
            }
        } while (loopSomeMore); //loop until the current index is not greater than the next index
    }

    public static void sortSelection(int a[])
    {
     int min, minIndex;

     for (int i = 0; i < a.length; i++)
     {
      min = a[i]; //get current min
      minIndex = i; //get the index of that min

        for (int j = i + 1; j < a.length; j++)
        {
          if (a[j] < min) //if the current index is less than the min
          {
              min = a[j]; //set the new min
              minIndex = j; //set the new min index
          }
        }

        a[minIndex] = a[i]; //set the value at minIndex to the current index
        a[i] = min; //set min value to current index

     }
    }
}
/* Sample Output:

1 2 3 5 6 8 35 67
3 4 5 6 31 245 789 876

 */