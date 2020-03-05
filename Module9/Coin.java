

public class Coin
{


    private final int heads = 60; //constants for getters and setters
    private final int tails = 1;
    private int flip = 0;

    public Coin() //default constructor
    {

    }


    public void setHeads() //setter for heads
    {
        flip = heads;
    }

    public void setTails() //setter for tails
    {
        flip = tails;
    }

    public String getFlipsText() //Prints heads or tails
    {
        return (flip == heads ? "heads" : "tails");
    }

    public int getFlip() //getter for flip number
    {
        return flip;
    }

    public void flipCoin() //method that flips the coin
    {

          flip = ((int)(Math.random()*((100-1)+1))+ 1); // gets a random number between 100 and 1
          flip = flip > 50 ? heads : tails; // if flip is less than 50, set flip to heads constant else set it to tails constant
    }

}
