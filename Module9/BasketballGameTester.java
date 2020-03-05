/*Program Name: Basketball game
Assignment: Module 9, Lesson 5, Assignment 1
Author: Nick Case
Date: 1/28/20
Version: 1.0
Program Description: This program simulates a basketball game with 2 teams.
What I learned from this program: how to use objects, how to use classes, how to randomize numbers, OOP
What difficulties did I have and how I solved them: The loop for the max score wasn't working as it was always running past the loop conditional. I then realized that I had || instead of &&. I drew a truth table to figure this out and once I did, it worked.
*/

import java.util.Scanner;

public class BasketballGameTester
{
    public static void main(String [] args)
    {
        int maxScore;

        Scanner userInput = new Scanner(System.in); //Creating Scanner
        BasketballGame game1 = new BasketballGame(); //Creating Basketball game

        System.out.print("What is team 1's name? ");
        game1.setTeam1Name(userInput.nextLine()); //getting team 1's name

        System.out.print("What is team 2's name? ");
        game1.setTeam2Name(userInput.nextLine()); //getting team 2's name

        System.out.print("Enter max score: ");
        maxScore = userInput.nextInt(); //getting max score

        game1.getMaxScore(maxScore); //passing the max score into the class

        game1.scoreShot(); //Deciding the actual shots and printing
    }
}
