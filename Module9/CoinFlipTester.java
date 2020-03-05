/*Program Name: Coin Flipping
Assignment: Module 9, Lesson 3, Assignment 1
Author: Nick Case
Date: 1/13/20
Version: 1.0
Program Description: This program flips 3 coins until they are the same
What I learned from this program: how to create objects, how to manipulate objects and instance variables
What difficulties did I have and how I solved them: I wasn't sure how to stop when they are all the same. Then I realized that I could use a method within the boolean in order to compare the strings that returned that would all me to stop the loop.
*/

public class CoinFlipTester
{
    public static void main(String [] args)
    {
        int count = 0; // creating counter
        Coin coin1 = new Coin(); //Creating coin object
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();

        do //loop until they all flip on the same side
            {
                coin1.flipCoin(); //flipping coins
                coin2.flipCoin();
                coin3.flipCoin();
                count++;
                System.out.println("Coin 1 is on " + coin1.getFlipsText() + ", coin 2 is on " + coin2.getFlipsText() + ", and coin 3 is on " + coin3.getFlipsText()); //Printing current side

            } while (!((coin1.getFlipsText() == "heads" && coin2.getFlipsText() == "heads" && coin3.getFlipsText() == "heads") || (coin1.getFlipsText() == "tails" && coin2.getFlipsText() == "tails" && coin3.getFlipsText() == "tails")));

        System.out.println("The coins were flipped a total of " + count + " times "); //Printing total times flipped

    }
}

/* Sample Output:

Coin 1 is on heads, coin 2 is on heads, and coin 3 is on tails
Coin 1 is on heads, coin 2 is on tails, and coin 3 is on tails
Coin 1 is on tails, coin 2 is on tails, and coin 3 is on tails
The coins were flipped a total of 3 times

Coin 1 is on heads, coin 2 is on heads, and coin 3 is on tails
Coin 1 is on tails, coin 2 is on heads, and coin 3 is on heads
Coin 1 is on heads, coin 2 is on tails, and coin 3 is on tails
Coin 1 is on tails, coin 2 is on heads, and coin 3 is on heads
Coin 1 is on heads, coin 2 is on tails, and coin 3 is on tails
Coin 1 is on heads, coin 2 is on heads, and coin 3 is on heads
The coins were flipped a total of 6 times

Coin 1 is on tails, coin 2 is on tails, and coin 3 is on tails
The coins were flipped a total of 1 times

 */
