import java.util.Scanner;

public class GuessGame
{
    private int number1;  //Creating Instance variables
    private int number2;
    private int number3;
    private int counter;
    private int upperRange;
    private int lowerRange;
    private int guess;
    private int player;

    public GuessGame() //Default Constructor
    {
    }

    public void setHigh(int upper)
    {
        upperRange = upper;
    } //setting high range

    public void setLowerRange(int low)
    {
        lowerRange = low;
    } //setting low

    public void startGame() //start game does most
    {
        player = 1;

        number1 = (int) ((Math.random() * ((upperRange - lowerRange) + 1)) + lowerRange);  //gets random numbers
        number2 = (int) ((Math.random() * ((upperRange - lowerRange) + 1)) + lowerRange);
        number3 = (int) ((Math.random() * ((upperRange - lowerRange) + 1)) + lowerRange);

        System.out.println("Computer has generated a random number for Player" + player + ".");

        DoPlay(number1,1); //Does method which does the actual guessing
        player++;
        System.out.println("Computer has generated a random number for Player" + player + "."); //Does method that does guessing with player 2
        DoPlay(number2, 2);
        player++;
        System.out.println("Computer has generated a random number for Player" + player + "."); //Does method that does guessing with player 3
        DoPlay(number3, 3);

    }

    private void DoPlay(int randomNumber, int player1) //method that does the actual guessing
    {
        Scanner userInput = new Scanner(System.in); //Scanner

        System.out.print("Player" + player + " should guess a number: ");
        counter = 0;
        int guess;

        player = player1;

        do { //do until guess = random number
            guess = userInput.nextInt();  //get guess

            if (guess > randomNumber)
            {
                System.out.print("Lower, guess again "); //Lower Message

            }

            else if (guess < randomNumber)
            {
                System.out.print("Higher, guess again "); //Higher message
            }
                counter++; //counter to show many times guess
            }while (guess != randomNumber);

        System.out.println("Correct!!! Player" + player + " took " + counter + " guesses. "); //print out if correct
        if (player >= 3) //if there are more than 3 players, quit
        {
            System.exit(1);
        }
        System.out.print("Would Player " + (player + 1) + " like to play? (y/n) "); //if the next player would like to play
        String again = userInput.next();
        if (again.equals("n")) //if no, quit
            //if yes, run the loop again
        {
            System.exit(1);
        }
    }
}
