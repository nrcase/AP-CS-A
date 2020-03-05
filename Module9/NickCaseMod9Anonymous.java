/*Program Name: Anonymous
Assignment: Module 9, Lesson 2, Practice Assignment 1
Author: Nick Case
Date: 1/6/20
Version: 1.0
Program Description: This program creates 2 circle objects and compares them
What I learned from this program: how to create an anonymous object, how equality works with objects
What difficulties did I have and how I solved them: No problems, pretty easy to follow the video, just needed to create the classes needed.
*/

public class NickCaseMod9Anonymous
{
    public static void main(String [] args)
    {
        Circle cir1 = new Circle(12.1); // Creates first object with radius of 12.1
        Circle cir2 = new Circle(12.1); //Creates second object with same radius
        //cir2 = cir1; //setting the equal to each other, they are the same object with this statement
        System.out.println(cir1.equals(cir2)); //returns false b/c comparing objects not values inside

        /*Recipe yummyStuff; Creating object, but not instantiating it
        yummyStuff = new Recipe("Watermelon Salad"); Creating object and instantiating it


        yummyStuff.setServings(new Circle(13.2));   Creating anonymous object for the constructor for .setServings
        */
    }
}
/* Sample Output:

false

 */
