
/*Program Name: Resistance Pool Re-Tiling
Assignment: Module 3, Lesson 4, Practice Assignment 1
Author: Nick Case
Date: 9/16/19
Version: 1.0
Program Description: This program calculates the square meters needed in order to retile a circular pool with a hole in the middle.
What I learned from this program: how to use double, how to set constants, how to use parenthesis, how to square something
What difficulties did I have and how I solved them: I wrote the entire program and then did the math by hand to double check the program, but I got a different number. I went back through the calculations I had and I saw that I accidently put poolRadius instead of islandRadius when calculating the area of the island. I then put the right variable in and the right answer came out.
 */
public class NickCaseMod3ResistancePool
{
    public static void main(String[] args)
    {
        double diameterPool, diameterIsland, radiusPool, //Declaring Variables
        radiusIsland, poolArea, islandArea,bottomArea;
        final double pi = 3.1415; //Declaring Constant
        diameterPool = 8.32; //Setting Variables
        diameterIsland = 1.91;
            radiusPool = diameterPool/2; // Finding Radius of the Pool and the Island
            radiusIsland = diameterIsland/2;
            poolArea= pi*(radiusPool*radiusPool); // Finding the Area of the Pool and the Island
            islandArea= pi*(radiusIsland*radiusIsland);
            bottomArea= poolArea - islandArea; //Finding the bottom of the Pool's area by subtracting the area of the pool minus the area of the island.
                System.out.println ("A resistance pool with a diameter of 8.32 meters that contains a circular island of 1.91 meters has " 
                + bottomArea + " square meters that needs tile."); // Printing out result
        
    }
}

/* Sample Output:
A resistance pool with a diameter of 8.32 meters that contains a circular island of 1.91 meters has 
51.500415862500006 square meters that needs tile.
 */

