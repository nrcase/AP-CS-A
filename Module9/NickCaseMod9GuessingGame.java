/*Program Name: Guessing Game
Assignment: Module 9, Lesson 5, Assignment 2
Author: Nick Case
Date: 1/29/20
Version: 1.0
Program Description: This program plays a competing guessing game.
What I learned from this program: how to use objects, how to use classes, how to make methods
What difficulties did I have and how I solved them: I wasn't sure how to do the different players and then I realized that I just need a variable for them with the player number and just send that to every method to keep track of who is playing.
*/


import java.util.Scanner;


public class NickCaseMod9GuessingGame
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner
        GuessGame game1 = new GuessGame(); //Creating game object

        System.out.print("What is the lower range number of your game? ");
        game1.setHigh(userInput.nextInt()); //getting low end

        System.out.print("What is the upper range number of your game? ");
        game1.setLowerRange(userInput.nextInt()); //getting high end

        game1.startGame(); //big method that does most

    }
}

/* Sample Output:

What is the lower range number of your game? 0
What is the upper range number of your game? 5
Computer has generated a random number for Player1.
Player1 should guess a number: 1
Higher, guess again 2
Higher, guess again 3
Correct!!! Player1 took 3 guesses.
Would Player 2 like to play? (y/n) y
Computer has generated a random number for Player2.
Player2 should guess a number: 3
Higher, guess again 4
Correct!!! Player2 took 2 guesses.
Would Player 3 like to play? (y/n) y
Computer has generated a random number for Player3.
Player3 should guess a number: 3
Lower, guess again 2
Lower, guess again 1
Correct!!! Player3 took 3 guesses.

 */
