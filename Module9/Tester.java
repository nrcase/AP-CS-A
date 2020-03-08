/*Program Name: Encapsulation Tutorial
Assignment: Module 9, lesson 4, Practice Activity 1
Author: Nick Case
Date: 1/21/20
Version: 1.0
Program Description: This program tests the different keywords of private and public to test encapsulation
What I learned from this program: How private and public keywords affect methods and variables
What difficulties did I have and how I solved them: N/A, pretty easy to follow
*/

public class Tester
{
    public static void main(String [] args)
    {
        Recipe yummyStuff = new Recipe("Watermelon Salad"); //Creating basic Recipe object
        //double ff = yummyStuff.cost; doesn't work because cost is a private variable
        //double ff = yummyStuff.pricePerCalorie; doesn't work because pricePerCalorie is a private method

    }
}
