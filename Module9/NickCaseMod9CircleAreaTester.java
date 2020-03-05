/*Program Name: Circle and Area
Assignment: Module 9, Lesson 1, Practice Assignment 2
Author: Nick Case
Date: 12/19/19
Version: 1.0
Program Description: This program gets and sets the radius of circle objects and can find the area and circumference.
What I learned from this program: how to use classes, how to create new objects, how to create setters and getters
What difficulties did I have and how I solved them: no problems, pretty easy to follow the video =)
*/

public class NickCaseMod9CircleAreaTester
{
    public static void main(String [] args)
    {
        NickCaseMod9Circle cir1 = new NickCaseMod9Circle(5.1); //Creating objects
        NickCaseMod9Circle cir2 = new NickCaseMod9Circle(20.6);

        System.out.println(cir1.getRadius()); //printing radius of cir1
        cir1.setRadius(20); //setting radius
        System.out.println(cir1.area()); //getting area
        System.out.println(cir1.getRadius()); //getting changed radius
        System.out.println(cir2.circumference()); //getting circumference
    }
}
/* Sample Output:

5.1
1256.6370614359173
20.0
129.4336173278995


 */
