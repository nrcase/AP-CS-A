public class Number
{
    private int currentNumber;
    private boolean isNotCrossedOut;

    public Number(int number) //defualt constructor setting the number
    {
        currentNumber = number;
        isNotCrossedOut = true;
    }

    public boolean isNotCrossedOut() //returning boolean if crossed out or not
    {
        return isNotCrossedOut;
    }

    public int getCurrentNumber() //gets the current number
    {
        return currentNumber;
    }

    public void setNotCrossedOut(boolean crossedOut) //sets whether something is crossed out or not
    {
        isNotCrossedOut = crossedOut;
    }
}
