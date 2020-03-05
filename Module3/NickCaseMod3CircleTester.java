/*Program Name: Circle Assignment (was Practice Activity)
Assignment: Module 3, Lesson 7, Assignment 1
Author: Nick Case
Date: 9/19/19
Version: 1.0 
Program Description: This program uses the class Circle and sets 1 radius to its variables. Then the first circle's diameter is found using the .diameter method in Class NickCaseMod3Circle.
What I learned from this program: how to create a Class, how to use the class to make methods, why are classes useful, how to use constructors, how to use the return keyword..
What difficulties did I have and how I solved them: I made the method, but then realized the variable I was using wasn't declared, I declared it to make sure it worked.
*/
public class NickCaseMod3CircleTester
{
    public static void main(String[] args)
    { NickCaseMod3Circle cir1 = new NickCaseMod3Circle(35.5); // Setting cir1 of NickCaseMod3Circle class's radius
      System.out.println(cir1.diameter()); // Printing out Cir1's diameter using the .diameter method in the NickCaseMod3Circle class.
    }
}

/* Sample Output:
 * 71.0
 */