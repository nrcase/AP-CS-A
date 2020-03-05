/*Program Name: Quantity Ordering
Assignment: Module 5, Lesson 9, Assignment 1
Author: Nick Case
Date: 10/20/19
Version: 1.0
Program Description: Finds the price per song based on how many songs are bought and finds the total price
What I learned from this program: How to use the switch conditional, how to use the switch conditional to do a range, syntax for switch
What difficulties did I have and how I solved them: I wasn't sure how use a range inside of a switch statement, but after a while realized that I could use manuel casting as an integer to get 1 number that represented the range and then do it based of that. 
*/
import java.util.Scanner;
public class NickCaseMod5QtyOrdering
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner object
        double costOfSong; //Declaring variable

        System.out.print("Enter quantity ");
        int numberOfSongs = userInput.nextInt();  //Getting input

        switch ((int)numberOfSongs/20) //If the number of songs cast as an integer is equal to
        {
            case(0): //0 then the cost is 1.29
                costOfSong = 1.29;
                break;
            case(1): //1 then the cost is 1.19
                costOfSong = 1.19;
                break;
            case(2): //2 then the cost is 1.09
                costOfSong = 1.09;
                break;
            default: //If it doesn't fit any of those
                costOfSong = 0.99; //the cost is .99
                break;
        }
        double finalPrice = costOfSong * numberOfSongs; //Final Price is cost of song * number of Songs

        System.out.println("Price = " + costOfSong); //Print cost of song
        System.out.printf("Amount due = $" + "%.2f",finalPrice); //Print final cost with 2 decimal points
    }
}

/* Sample Output:

Enter quantity 5
Price = 1.29
Amount due = $6.45

Enter quantity 25
Price = 1.19
Amount due = $29.75

Enter quantity 55
Price = 1.09
Amount due = $59.95

Enter quantity 70
Price = 0.99
Amount due = $69.30

 */