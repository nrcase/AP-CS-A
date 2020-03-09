/*Program Name: Circle Practice Activity
Assignment: Module 3, Lesson 7, Practice Activity 1
Author: Nick Case
Date: 9/18/19
Version: 1.0 
Program Description: This program uses the class Circle and sets 2 radii to their variables. Then the first circle's cirumference is found using the .circumference method in Class Circle.
What I learned from this program: how to create a Class, how to use the class to make methods, why are classes useful, how to use constructors.
What difficulties did I have and how I solved them: I had trouble with creating the Circle class and how to make the radius private. I tried a few different things and then I googled it, and found that the syntax is just private.
In the circle class, the video told me to put in radius=r underneath the .getRadius() method, but when I tried that BlueJ kept telling me that it was invalid. So I asked my dad for help (he uses Java for his work) and he told me what that is supposed to do and why it doesn't fit there. So I just commented it out because the videos said to put it in there, but it doesn't make sense and does it work.
*/
public class NickCaseMod3CircleTester
{
    public static void main(String[] args)
    { NickCaseMod3Circle cir1 = new NickCaseMod3Circle(5.1); // Setting variables of NickCaseMod3Circle class's radii
      NickCaseMod3Circle cir2 = new NickCaseMod3Circle(20.6);
      cir1.setRadius(20); // Changing cir1 with .setRadius method in NickCaseMod3Circle class
      System.out.println(cir1.circumference()); // Printing out Cir1's circumference using the .circumference method in the NickCaseMod3Circle class.
    }
}

/* Sample Output:
 * 125.66370614359172
 */