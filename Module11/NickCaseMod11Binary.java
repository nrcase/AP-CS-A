/*Program Name: Binary Searches
Assignment: Module 11, Lesson 4, Practice Assignment 1
Author: Nick Case
Date: 2/25/20
Version: 1.0
Program Description: This program does both a regular and recursive binary search of an array
What I learned from this program: how to create a binary search, how to create a recursive binary search and how both of them work.
What difficulties did I have and how I solved them: N/A, just followed the video =)
*/


public class NickCaseMod11Binary
{
        public static void main(String [] args)
        {
            int i[] = {-7,15,21,22,43,49,51,67,78,81,84,89,95,97}; //creating array
            System.out.println(binarySearch(i,22)); //searching with the regular binary search
            System.out.println(binarySearch(i,89));
            System.out.println(binarySearch(i,-100));
            System.out.println(binarySearch(i,72));
            System.out.println(binarySearch(i,102));

            int lb = 0; //defining upper bound and lower bound
            int ub = i.length - 1;

            System.out.println(recursiveBinarySearch(i,22, lb, ub)); //searching with recursive binary search
            System.out.println(recursiveBinarySearch(i,89, lb, ub));
            System.out.println(recursiveBinarySearch(i,-100, lb, ub));
            System.out.println(recursiveBinarySearch(i,72, lb, ub));
            System.out.println(recursiveBinarySearch(i,102, lb, ub));
        }

        private static int binarySearch(int a[], int searchValue)
        {
            int lb = 0; //define upper and lower bounds
            int ub = a.length - 1;

            while (lb <= ub) //while upper bounds and lower bounds are not equal to each other
            {
                int mid = (lb + ub) / 2; //get the mid

                if (a[mid] == searchValue ) //if mid = search, return mid
                {
                    return mid;
                }
                else if (searchValue > a[mid]) //if search value is greater than mid, set the lower boundary to current spot + 1
                {
                    lb = mid + 1;
                }
                else //if search value is less than mid, set the upper boundary to the current mid - 1
                {
                    ub = mid - 1;
                }
            }

            return -1; //return -1 if not found after going through
        }

        private static int recursiveBinarySearch(int a[], int searchValue, int lb, int ub)
        {
            if (lb > ub) //if the lower bound is greater than the upper boundary, return -1
            {
                return -1;
            }
            else
            {
                int mid = (lb + ub) / 2; //find mid
                if (a[mid] == searchValue) //if mid equal, return mid index
                {
                    return mid;
                }
                else if (searchValue > a[mid]) //if search value is greater than mid, do search again with lower bounday changed to current mid + 1
                {
                    return recursiveBinarySearch(a, searchValue, mid + 1, ub);
                }
                else //if search value is less than mid, do search again with upper boundary changed to mid - 1
                {
                    return recursiveBinarySearch(a, searchValue, lb, mid - 1);
                }
            }
        }
}

/* Sample Output;

3
11
-1
-1
-1
3
11
-1
-1
-1

 */
