/*Program Name: Boolean AND, ORs and Order of Operations
Assignment: Module 5, Lesson 1, Practice Assignment 1
Author: Nick Case
Date: 10/1/19
Version: 1.0
Program Description: This program follows the series of videos in the Practice Assignment to learn about booleans and their operations.
What I learned from this program: How to use &&, How to use ||, how to use !, which operators take precedent over others.
What difficulties did I have and how I solved them: I was having trouble with the negation operator, but then I looked back at the video and the ! was in front of the expression, not inside it. I put it outside and then it worked.
*/

public class NickCaseMod5BooleansPA
{
    public static  void main(String args[])
    {
        int x = 37; //Declaring Integers
        int y = 49;
        int z = 37;
        boolean a = (x >= y); // Is x greater than or equal to Y? False
        boolean b = !(x < y ) && (x == z); // Is x not less than y and x not equal to y? False
        boolean c = (x > y) || (x < z); //  Is x greater than y or x less than z? False
        boolean d = true || false && false; // True or (False & False) >> False or True >>>> True
        System.out.println(a); //Printing all the outputs of previous boolean statements
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
/* Sample Output:
false
false
false
true
 */

