/*Program Name: Array Fun
Assignment: Module 10, Lesson 3, Assignment 1
Author: Nick Case
Date: 2/10/20
Version: 1.0
Program Description: This program takes 20 numbers from a text file, stores them in an array and then finds statistics about them
What I learned from this program: how to use arrays, how to read text files into an array, how to add and subtract with arrays
What difficulties did I have and how I solved them: I wasn't sure how to separate the IDs and the scores. Initially I had 1 array1 and then had it sorting the data based on whether the index is odd or even. I realized that it would so much easier if I just had 2 separate arrays and after that it was easier to finish.
*/

import java.io.*;
import java.util.Scanner;

public class NickCaseMod10Fun
{
    public static void main(String [] args) throws IOException
    {
        File file = new File("/Users/nickcase/Desktop/arrayFun.txt"); //Creating File Object
        Scanner fileInput = new Scanner(file); //Creating Scanner to read file

        int[] idArray = new int[20]; //Creating array for ID #'s
        int[] scoreArray = new int[20]; // Creating array for Scores
        int index = 0;
        double total = 0;


        while (fileInput.hasNext()) //does this while there is something inside the text file
        {
                idArray[index] = fileInput.nextInt(); //Alternates between storing the next number in the ID and score arrays
                scoreArray[index] = fileInput.nextInt();

                total = scoreArray[index] + total; //finds the total

                index++; //increments the index
        }

        double average = (Math.round((total / index) * 100.0)) / 100.0; //finding the average and then rounding it to 2 decimal places

        System.out.println("The file has ended");
        fileInput.close(); //Closing file
        System.out.println("Sum = " + total); //Printing total
        System.out.println("Average = " + average); //Printing average
        System.out.println("Count = " + index); //Printing count

        System.out.println("ID \t" + "Score \t" + "Diff \t"); //Printing column headers

        for (int count = 0; count < 20; count++) //Loop to print all the IDs and scores
        {
            System.out.print(idArray[count] + "\t"); //print ID number
            System.out.print(scoreArray[count] + "\t"); //print score
            System.out.printf("%.2f \n",(scoreArray[count] - average)); //print the difference between the score, and the average and then round it to 2 decimal places.
        }
    }
}

/* Sample Output:

The file has ended
Sum = 4853.0
Average = 242.65
Count = 20
ID 	Score 	Diff
115	257	14.35
123	253	10.35
116	246	3.35
113	243	0.35
112	239	-3.65
104	239	-3.65
110	238	-4.65
218	243	0.35
208	242	-0.65
222	223	-19.65
223	230	-12.65
213	229	-13.65
207	228	-14.65
203	224	-18.65
305	265	22.35
306	262	19.35
311	256	13.35
325	246	3.35
321	245	2.35
323	245	2.35

The file has ended
Sum = 10463.0
Average = 523.15
Count = 20
ID 	Score 	Diff
113	334	-189.15
114	456	-67.15
112	345	-178.15
123	456	-67.15
986	123	-400.15
123	561	37.85
325	452	-71.15
131	347	-176.15
199	901	377.85
246	864	340.85
347	153	-370.15
678	974	450.85
138	101	-422.15
124	653	129.85
765	903	379.85
153	872	348.85
973	127	-396.15
459	953	429.85
222	333	-190.15
444	555	31.85


 */

