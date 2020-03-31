
public class LeftArrow extends Figure
{
    private int base;
    private int tail;
    int[][] arrowArray;
    private final int star = 1; //all stars are 1s inside of the 2D array
    private final int space = 0; //all blanks are 0s

    public LeftArrow() {
        super();
    } //default constructor inheriting from Figure class

    public LeftArrow(int base1, int tail1, int offset1) { //constructor
        base = base1 - 1;
        tail = tail1;
        setOffset(offset1);
        int arrayX = tail + (base / 2);
        arrowArray = new int[base][(arrayX + getOffset()) + 2]; //creating 2D array to draw on

    }

//Draws the figure at the current line

    public void drawHere() {
        clearArrow();
        setArrow();
        printRightArrow();
    }


    public void clearArrow() { //sets all the spaces in the array to 0 or blanks
        for (int row = 0; row < arrowArray.length; row++) {
            for (int col = 0; col < arrowArray[row].length; col++) {
                arrowArray[row][col] = space;
            }
        }
    }

    public void setArrow()//method to set all the 1s and 0s
    {
        arrowArray[base / 2][getOffset()] = star; //setting main point at the tip of the left Arrow

        int pointX = base/2; //get the x and y coordinates of the leading star
        int pointY = getOffset();

        for(int count = 1; count < (base / 2); count ++) //setting 1s to the stair stepping part of the arrow
        {
            arrowArray[pointX + count][pointY + count] = star; //stepping down
            arrowArray[pointX - count][pointY + count] = star; //stepping up
        }

        for (int row = 0 ; row < base; row++) //setting 1s to the base of the arrow
        {
            arrowArray[row][getOffset() + (base/2)] = star;//straight vertical line
        }

        for (int col = getOffset() + (base / 2); col < (base/2) + getOffset() + tail; col++) //getting the last horizontal line
        {
            arrowArray[base/2][col] = star;
        }

    }

    public void printRightArrow() //prints the array out with stars and blanks
    {
        System.out.println();
        for (int i = 0; i < arrowArray.length; i++) {
            for (int j = 0; j < arrowArray[i].length; j++) {
                if (arrowArray[i][j] == star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }


    //sets the indicated number of spaces
    private static void spaces(int number)
//this method was made static because it does not need a calling object.  The class
//would work fine if spaces were not made static but it is clearer if you make spaces
//static
    {
        int count;
        for (count = 0; count < number; count++)
            System.out.print(' ');
    }
}