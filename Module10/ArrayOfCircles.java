/*Program Name: Array of Circles
Assignment: Module 10, Lesson 2, Practice Assignment 1
Author: Nick Case
Date: 2/3/20
Version: 1.0
Program Description: This program first sets the circles into the array individually and then does it with a loop.
What I learned from this program: how to create an object array, how to add objects to the object array through different methods
What difficulties did I have and how I solved them: No problems, pretty straight forward
*/


public class ArrayOfCircles
{
    public static void main(String [] args)
    {
        Circle cir[] = new Circle[500]; //Declaring object array

        /*cir[1]=new Circle (57.2);
        cir[2]=new Circle (57.2);
        cir[3]=new Circle (57.2);
        cir[4]=new Circle (57.2);
        cir[5]=new Circle (57.2);
        cir[6]=new Circle (57.2);
        cir[7]=new Circle (57.2);
        cir[8]=new Circle (57.2);
        cir[9]=new Circle (57.2);
        cir[10]=new Circle (57.2);  I didn't do 500, after 10, I got the idea */

        for (int j = 0; j < 500; j++) //Doing it with a loop, looping 500 times
        {
            cir[j] = new Circle(10); //adding the radius 10 to a new circle object and storing it in the array
        }

    }
}
/* Sample Output:
None, just assigning objects into the array, not printing anything

Answer to Question:
THe loop would be the easiest because the loop does the work of entering the object statement with the incrementing variable acting as the index to which to set that object to.

 */

