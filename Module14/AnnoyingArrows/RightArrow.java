
public class RightArrow extends Figure
{
    private int base; //class variables
    private int tail;
    int[][] arrowArray;
    private final int star = 1; //constants on where to put stars and blanks
    private final int space = 0;

    public RightArrow()
    {
        super();
    } //default inherited contructor

    public RightArrow(int base1, int tail1, int offset1) //constructor
    {
        base = base1 - 1;
        tail = tail1;
        setOffset(offset1);
        int arrayX = tail + (base/2);
        arrowArray = new int[base][(arrayX + getOffset()) + 2];

    }

//Draws the figure at the current line

    public void drawHere()
    {
        clearArrow();
        setArrow();
        printRightArrow();
    }




    public void clearArrow() //clears the entire array, puts 0s in every spot
    {
        for (int row = 0; row < arrowArray.length; row++)
        {
            for (int col = 0; col < arrowArray[row].length; col++)
            {
                arrowArray[row][col] = space;
            }
        }
    }

    public void setArrow() //sets 1s and 0s in the array to draw the shape
    {
        for (int col = getOffset(); col < (tail+getOffset()); col++) //draws the tail
        {
            arrowArray[base/2][col] = star;
        }


       for (int row = 0 ; row < base; row++) //draws the vertical line base
        {
            arrowArray[row][tail + getOffset()] = star;
        }

        int topX = 0; //coordinates for the top star and the bottom star of the vertical line so it has a place to start.
        int topY = getOffset() + tail;
        int botX = base - 1;
        int botY = getOffset() + tail;

        for(int count = 1; count < (base / 2); count ++) //draws the stairs part of the arrow
        {
            arrowArray[topX + count][topY + count] = star;
            arrowArray[botX - count][botY + count] = star;
        }

       arrowArray[base / 2 ][getOffset() + tail + (base/2)] = star; //draws the point

    }

    public void printRightArrow() //prints out the drawing, converting 1s to stars and 0s to blanks
    {
        System.out.println();
        for (int i = 0; i < arrowArray.length; i++)
        {
            for (int j = 0; j < arrowArray[i].length; j++)
            {
                if (arrowArray[i][j] == star)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }




    //sets the indicated number of spaces
    private static void spaces (int number)
//this method was made static because it does not need a calling object.  The class
//would work fine if spaces were not made static but it is clearer if you make spaces
//static
    {
        int count;
        for (count = 0; count < number; count++)
            System.out.print (' ');
    }
}
