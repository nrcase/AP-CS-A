/*Program Name: Snake Eyes/TV
Assignment: Module 9, Lesson 3, Assignment 3
Author:  Nick Case
Date: 1/13/20
Version: 1.0
Program Description: This program simulates a TV, changing the power status, volume and channel
What I learned from this program: how to use objects, how to create methods, how to create setters and getters
What difficulties did I have and how I solved them: I was inputting values into my strings in order to turn on and off the TV, but it wasn't changing. I looked back and then realized that I had == instead of .equals inside the booleans. I replaced it with .equals and then it started working.
*/


import java.util.Scanner;

public class NickCaseMod9SnakeEyesTVTester
{
    public static void main(String [] args)
    {
        String powerStatus; //Declaring variables
        int channelStatus;
        String exit = "y";

        Scanner userInput = new Scanner(System.in); //Creating Scanner

        TV TV1 = new TV(); //Creating TV object

        System.out.print("Would you like the TV on or off? ");
        powerStatus = userInput.next();
        TV1.setOnOrOff(powerStatus); //Setting TV on or off with method

        System.out.print("What channel number would you like it set on? ");
        channelStatus = userInput.nextInt();
        TV1.setChannelNumber(channelStatus); //Changing channel with method

        while(exit.equals("y")) //while loop to continue changing the volume
        {

            System.out.print("Increase or Decrease the volume? ");
            String choice = userInput.next(); //Getting increase or decrease
            TV1.setVolume(choice); //Increasing or decreasing depending on input
            System.out.print("Would you like to continue changing the volume? (y/n) ");
            exit = userInput.next(); //Getting exit value
        }

        System.out.println("The TV is " + TV1.getOnOrOff() + " and is on channel " + TV1.getChannelNumber() + ". " + "The volume is " + TV1.getVolume()); //Getting current values
    }
}
/* Sample Output:

Would you like the TV on or off? On
What channel number would you like it set on? 9
Increase or Decrease the volume? increase
Would you like to continue changing the volume? (y/n) n
The TV is On and is on channel 1. The volume is 6

Would you like the TV on or off? Off
What channel number would you like it set on? 2
Increase or Decrease the volume? Increase
Would you like to continue changing the volume? (y/n) y
Increase or Decrease the volume? Increase
Would you like to continue changing the volume? (y/n) y
Increase or Decrease the volume? Increase
Would you like to continue changing the volume? (y/n) y
Increase or Decrease the volume? decrease
Would you like to continue changing the volume? (y/n) n
The TV is Off and is on channel 2. The volume is 7

 */
