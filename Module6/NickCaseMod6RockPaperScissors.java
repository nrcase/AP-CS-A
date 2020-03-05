/*Program Name: Rock, Paper, Scissors
Assignment: Module 6, Lesson 8, Assignment 2
Author: Nick Case
Date: 11/19/19
Version: 1.0
Program Description: This program plays rock, paper, scissors and can be repeated
What I learned from this program: how to use while loops, using sentinel values to exit loops
What difficulties did I have and how I solved them: I had everything right, but the computer's choice kept printing out at the beginning. I looked back through my code and I saw that I left a print statement there when I was testing the random number generator. I removed it and I got the output I wanted.
I wasn't sure if you wanted it to run multiple times, but I saw that as the only way to put a loop in without using the while loop like a if statement like my last program with a system exit. I figured I would do this this program with an actual loop. Could you clarify it in the assignment document next time just to make it easier to understand?
*/

import java.util.*;

public class NickCaseMod6RockPaperScissors
{
    public static void main(String [] args)
    {
        Scanner userinput = new Scanner(System.in); //Creating Scanner
        double rndmnum, choice, exit = 0;


        while (exit == 0)  //Loop to play the game multiple times
        {
            System.out.println("Game choices are 1 for rock, 2 for scissors, or 3 for paper");
            System.out.print("Enter your game choice (1, 2, or 3): ");
            choice = userinput.nextInt(); //Getting input

            rndmnum = (int) (3 * Math.random()); //getting random number

            if (choice == 1) //If statements printing out what was chosen
            {
                System.out.println("You entered  rock");
            }
            else if (choice == 2)
            {
                System.out.println("You entered scissors");
            }
            else if (choice == 3)
            {
                System.out.println("You entered paper");
            }

            if (rndmnum == 1) //If statements printing out what the computer's choice is
            {
                System.out.println("Computer choses rock");
            }
            else if (rndmnum == 2)
            {
                System.out.println("Computer choses scissors");
            }
            else if (rndmnum == 3)
            {
                System.out.println("Computer choses paper");
            }

            if (rndmnum ==1 && choice == 1 ) //If statements printing the winner if the computer chooses rock and your choice is any of the three
            {
                System.out.println("It's a tie!");
            }
            else if (rndmnum ==1 && choice == 2)
            {
                System.out.println("Computer Wins!, Rock beats scissors ");
            }
            else if (rndmnum ==1 && choice == 3)
            {
                System.out.println("You win! Paper beats Rock");
            }

            if (rndmnum == 2 && choice == 1 ) //If statements printing the winner if the computer chooses scissors and your choice is any of the three
            {
                System.out.println("You win! Rock beat scissors");
            }
            else if (rndmnum == 2 && choice == 2)
            {
                System.out.println("It's a tie!");
            }
            else if (rndmnum == 2 && choice == 3)
            {
                System.out.println("Computer Wins! Scissors beats paper");
            }

            if (rndmnum == 3 && choice == 1 ) //If statements printing the winner if the computer chooses paper and your choice is any of the three
            {
                System.out.println("Computer Wins! Paper beats Rock");
            }
            else if (rndmnum == 3 && choice == 3)
            {
                System.out.println("It's a tie!");
            }
            else if (rndmnum == 3 && choice == 2)
            {
                System.out.println("You win! Scissors beats paper");
            }

            System.out.println("Do you want to play again? (Yes = 0 ) (No = 1 ) ");
            exit = userinput.nextInt(); //Getting input to see if they want to play again.
        }


    }
}

/* Sample Output:

Game choices are 1 for rock, 2 for scissors, or 3 for paper
Enter your game choice (1, 2, or 3): 1
You entered  rock
Computer choses rock
It's a tie!
Do you want to play again? (Yes = 0 ) (No = 1 )
0

Game choices are 1 for rock, 2 for scissors, or 3 for paper
Enter your game choice (1, 2, or 3): 2
You entered scissors
Computer choses rock
Computer Wins! Scissors beats paper
Do you want to play again? (Yes = 0 ) (No = 1 )
0

Game choices are 1 for rock, 2 for scissors, or 3 for paper
Enter your game choice (1, 2, or 3): 3
You entered paper
Computer choses scissors
Computer Wins! Scissors beats paper
Do you want to play again? (Yes = 0 ) (No = 1 )


 */
