/*Program Name: Multiplication Tables
Assignment: Module 6, Lesson 4, Assignment 2
Author: Nick Case
Date: 12/2/19
Version: 1.0
Program Description: This program prints a multiplication table
What I learned from this program: how to use nested loops
What difficulties did I have and how I solved them: No problems! =)
*/


public class NickCaseMod6MultiplicationTables
{
    public static void main(String [] args)
    {
        for (int rows = 1; rows <= 12; rows++ ) //Creates Rows
        {
            for (int insideNumber = 1; insideNumber <= 12; insideNumber++) //Prints the inside numbers
            {
                System.out.print( rows * insideNumber); // what row it is * the column number
                System.out.print("  "); //Spacing
            }
            System.out.println(); //Creating new lines
        }
    }
}

/* Sample Output: (it's a little offset because of the numbers growing)

1  2  3  4  5  6  7  8  9  10  11  12
2  4  6  8  10  12  14  16  18  20  22  24
3  6  9  12  15  18  21  24  27  30  33  36
4  8  12  16  20  24  28  32  36  40  44  48
5  10  15  20  25  30  35  40  45  50  55  60
6  12  18  24  30  36  42  48  54  60  66  72
7  14  21  28  35  42  49  56  63  70  77  84
8  16  24  32  40  48  56  64  72  80  88  96
9  18  27  36  45  54  63  72  81  90  99  108
10  20  30  40  50  60  70  80  90  100  110  120
11  22  33  44  55  66  77  88  99  110  121  132
12  24  36  48  60  72  84  96  108  120  132  144

 */
