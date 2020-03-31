/*Program Name: Annoying Arrows
Assignment: Module 14, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 3/31/20
Version: 1.0
Program Description: This program draws left and right arrows with an offset using inheritance
What I learned from this program: how inheritance works, 2D arrays
What difficulties did I have and how I solved them: I wasn't sure how to start off drawing the shapes, but then I realized that I could use a 2D array like a graph and then draw it using coordinates on the graph. This approach made much more sense and led me to the end.
*/

import java.util.Scanner;

public class NickCaseMod14AnnoyingArrowsTester
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //creating scanner

        System.out.print("What is the tail length of the arrow? "); //getting tail length
        int tailLength = userInput.nextInt();

        System.out.print("What is the base length of the arrow? (Has to be even) "); //getting base length
        int baseArrow = userInput.nextInt();

        if (baseArrow % 2 != 0) //checking for odd number for base arror
        {
            System.out.print("Invalid Input, please put an even number in to the base length. ");
            System.exit(1);
        }

        System.out.print("What is the offset from the side? "); //getting offset
        int offset = userInput.nextInt();

        System.out.print("Is this a left arrow or right arrow? "); //getting left or right arrow
        String answer = userInput.next();
        if (answer.toLowerCase().equals("right")) //if right, draw right arrow
        {
           RightArrow myRightArrow = new RightArrow(baseArrow, tailLength, offset);
           myRightArrow.drawOffset();
           myRightArrow.drawHere();
        }
        else if (answer.toLowerCase().equals("left")) //if left, draw left arrow
        {
            LeftArrow myLeftArrow = new LeftArrow(baseArrow, tailLength, offset);
            myLeftArrow.drawOffset();
            myLeftArrow.drawHere();
        }
        else //if type something else, invalid input
        {
            System.out.println("Please choose again, invalid input");
        }


    }
}
/* Sample Output:

What is the tail length of the arrow? 10
What is the base length of the arrow? (Has to be even) 10
What is the offset from the side? 10
Is this a left arrow or right arrow? right

                    *
                    **
                    * *
                    *  *
          ***********   *
                    *  *
                    * *
                    **
                    *

What is the tail length of the arrow? 36
What is the base length of the arrow? (Has to be even) 36
What is the offset from the side? 36
Is this a left arrow or right arrow? left

                                                     *
                                                    **
                                                   * *
                                                  *  *
                                                 *   *
                                                *    *
                                               *     *
                                              *      *
                                             *       *
                                            *        *
                                           *         *
                                          *          *
                                         *           *
                                        *            *
                                       *             *
                                      *              *
                                     *               *
                                    *                ************************************
                                     *               *
                                      *              *
                                       *             *
                                        *            *
                                         *           *
                                          *          *
                                           *         *
                                            *        *
                                             *       *
                                              *      *
                                               *     *
                                                *    *
                                                 *   *
                                                  *  *
                                                   * *
                                                    **
                                                     *

 */
