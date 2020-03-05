/*Program Name:Module 3 Mints
Assignment: Module 3, Lesson 3, Assignment 1
Author: Nick Case
Date: 9/13/19
Version: 1.0
Program Description: This determines how many bags of 3 mints will be created with a starting amount of 500 and how many will be left over.
What I learned from this program: How to use integer divison, how to modulus divison
What difficulties did I have and how I solved them: I got to the part when I needed to do the calculations, but it kept saying I needed to put in a variable and that I had a value in there. So I created a variable called "numberOfMintsInBag" and put that in instead of the number 3. That also didn't work and I started to get really frustrated. I then googled the error message it gave me and found a site where someone eas having a similar problem.
That site suggested that I had the operation and the variable on the wrong side and as I looked at it, I realized I did the same exact thing. I put "totalMints/3 = numberOfBags" instead "numberOfBags = totalMints/3". I repalced that for both the integer divison and modulus divison and then it compiled.
*/

public class NickCaseMod3Mints
{
    public static void main (String[] args)
    {
        int totalMints, numberOfBags, mintsLeftOver; //Declaring Variables
        totalMints = 500; 
            numberOfBags = totalMints/3; //Finding numberOfBags,Used integer divison because needed to find how many bags of 3 can be made with 500 without having decimals (no decimals of mints!, so integer) ) 
            mintsLeftOver = totalMints%3; //Finding mintsLeftOver, Used Modulus divison because I needed the number of leftover mints that would be left over after splitting the 500 into bags (modulus gives you what is left after you divide by the integer).
                System.out.println ("Total Mints = " + totalMints); //Printing out results
                System.out.println ("Number of Bags = " + numberOfBags);
                System.out.println ("Mints leftover = " + mintsLeftOver);
    }
}
/* Sample Output:
"Total Mints = 500
Number of Bags = 166
Mints leftover = 2"
 */