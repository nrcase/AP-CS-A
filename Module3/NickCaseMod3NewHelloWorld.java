/*Program Name: New Hello World
Assignment: Module 3, Lesson 6, Practice Assignment One
Author: Nick Case
Date: 9/17/19
Version: 1.0
Program Description: This program prints out Hello World and then my high school on the second line, on a new line puts Tigers in quotes and 2 tabs later "Go Tigers!"
What I learned from this program: how to use \n (new line), how to use \" (quotes) and how to use \t (one tab space))
What difficulties did I have and how I solved them: ()I had made the entire program, but I kept getting errors. I double checked and I was using the wrong type of slashes, I went back and replaced all of them with the correct slashes.
I was putting the quotes around Tiger and BlueJ kepy saying I needed to put a parenthesis instead. I realized that I had put the " in \" on the wrong side. I fixed that and that line was worked. 
*/
public class NickCaseMod3NewHelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World\n" + "Chapel Hill High School"); //Printing Hello World and Chapel Hill High School on different lines
        System.out.println("I'm a " + "\"Tiger\"!\t \t" + "Go Tigers!"); //Printing Tigers! with quotes and then 2 tab spaces and then printing Go Tigers!
    }
}
/* Sample Output:
Hello World
Chapel Hill High School
I'm a "Tiger"!	 	Go Tigers!
 */