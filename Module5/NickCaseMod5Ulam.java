/*
 * Author: Nick Case
 * Program name: Ulam's Hypothesis
 * Date: 10/10/19
 * Description: This program tests Ulam's Hypothesis for numbers 1-25
 * Numbers 1-25 converge to 1 by these rules: If odd, multiply by 3 and add 1. If even, divide by 2.
 * Difficulties: I kept getting the number 4 being repeated and then eventaully it took up too much storage and crashed my computer. I when back through to see why my number inside the do loop wasn't changing and then I realized that I was changing the variable that decided when to stop the loop, so it would never stop.
 * Things learned: How to use if else loops, how to use do while loops, how to use for loops,
 */

public class NickCaseMod5Ulam
{
        public static void main(String args[])
        {

            //Variables
            int num;
            int print;

            //Counting loop to repeat for 2-25
            for (num = 1; num <= 25 ; num++)
            {

                //Reset print to num
                print = num;

                //Print the first number of the sequence.
                System.out.print(print + ":  ");

                //Result controlled loop: keeps doing calculations and printing the sequence until 1 is reached
                do
                {
                   if (print % 2 == 0) //If number is even
                   {
                       print= print / 2; //Divide by 2 and then print
                       System.out.print(print + " ");
                   }
                   else //If number is odd
                   {
                      print = (print * 3) + 1; // multiple by 3 and then add 1 and then print
                       System.out.print(print + " ");
                   }

                }//end do
                while (print != 1); //do the above loop until print = 1

                //Start the next line
                System.out.println();  //Starts new line for formatting

            }//end for loop

        }//end main method

}//end class

/* Sample Output:

1:  4 2 1
2:  1
3:  10 5 16 8 4 2 1
4:  2 1
5:  16 8 4 2 1
6:  3 10 5 16 8 4 2 1
7:  22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
8:  4 2 1
9:  28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
10:  5 16 8 4 2 1
11:  34 17 52 26 13 40 20 10 5 16 8 4 2 1
12:  6 3 10 5 16 8 4 2 1
13:  40 20 10 5 16 8 4 2 1
14:  7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
15:  46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
16:  8 4 2 1
17:  52 26 13 40 20 10 5 16 8 4 2 1
18:  9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
19:  58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
20:  10 5 16 8 4 2 1
21:  64 32 16 8 4 2 1
22:  11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
23:  70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
24:  12 6 3 10 5 16 8 4 2 1
25:  76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1


 */



