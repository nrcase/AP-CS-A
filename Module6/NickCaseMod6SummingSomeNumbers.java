/*Program Name: Summing Some Numbers
Assignment: Module 6, Lesson 3, Assignment 1
Author: Nick Case
Date: 11/5/19
Version: 1.0
Program Description: This program adds all the numbers and finds the average of numbers given a starting and ending number
What I learned from this program: how to use a do while loop
What difficulties did I have and how I solved them: I was not getting the last number of the range included in the sum or being printed out. Then I realized I needed less than or equal to in my while boolean instead of not equal to.
*/


import java.util.Scanner;

public class NickCaseMod6SummingSomeNumbers
{
    public static void main (String [] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner Object

        int startValue, endValue, sum = 0, count = 0; //Declaring and Initializing variables
        double average;

        System.out.print("Enter Starting Value: ");
        startValue = userInput.nextInt(); //getting starting number

        

        System.out.print("Enter Ending Value: ");
        endValue = userInput.nextInt(); //getting ending number

        System.out.print("\n"); //new line



        do // do
            {
            count++; //addone to the count
            sum = sum + startValue; //add the previous sum and the start value
            System.out.println(startValue); //print start value
            startValue++;//increment start value by one
        }
        while (startValue <= endValue); // while startValue is less than or equal to end value

        average = (double)sum/count; //find the average by dividing the sum by the count and casting it as a double

        System.out.println("Sum of the numbers: " + (startValue - count) + ".. " + endValue + "is " + sum); //Print out Sum
        System.out.println("The average of the numbers: " + (startValue - count) + ".. " + endValue + "is " + average); //Print out Average

    }
}

/* Sample Output:

Enter Starting Value: 22
Enter Ending Value: 25

22
23
24
25
Sum of the numbers: 22.. 25is 94
The average of the numbers: 22.. 25is 23.5

Enter Starting Value: 1
Enter Ending Value: 5

1
2
3
4
5
Sum of the numbers: 1.. 5is 15
The average of the numbers: 1.. 5is 3.0

Enter Starting Value: 8
Enter Ending Value: 15

8
9
10
11
12
13
14
15
Sum of the numbers: 8.. 15is 92
The average of the numbers: 8.. 15is 11.5

Enter Starting Value: 50
Enter Ending Value: 100

50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100

Enter Starting Value: 4
Enter Ending Value: 9

4
5
6
7
8
9
Sum of the numbers: 4.. 9is 39
The average of the numbers: 4.. 9is 6.5

 */
