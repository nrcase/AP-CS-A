/*Program Name: Pizza
Assignment: Mod 4, Lesson 1, Assignment 1
Author: Nick Case
Date: 9/24/19
Version: 1.0
Program Description: This program asks for a type of crusts and 3 different toppings and then displays them in a sentence.
What I learned from this program: how to use scanner class, how to get inputs
What difficulties did I have and how I solved them: I was trying to make the Scanner, but I kept getting errors so I went back to the notes and looked up the correct syntax. I put the keyword "new" in and then it worked.
 * 
 * 
 * 
 */

import java.io.*;
import java.util.*;
public class NickCaseMod4Pizza
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Scanner object
        String crustType, toppingOne, toppingTwo, toppingThree; //Declare Variables 
        System.out.print ("Enter the type of crust (thin, hand tossed, deep dish): "); 
        crustType = in.next(); //asking for crust
        System.out.print ("Enter topping 1: "); //Next prints all show text for input
        toppingOne = in.next(); //asking for 1st topping
        System.out.print ("Enter topping 2: ");
        toppingTwo = in.next(); //asking for 2nd topping
        System.out.print ("Enter topping 3: ");
        toppingThree = in.next(); //asking for 3rd topping
        System.out.println ("You have ordered a " + crustType + " pizza with " + toppingOne + ", " + toppingTwo + " and " + toppingThree + "." + " Enjoy!"); //Printing Output
    }
}
/*
 * System Output:
 *  Enter the type of crust (thin, hand tossed, deep dish): thin
Enter topping 1: cheese
Enter topping 2: pepporoni
Enter topping 3: cheese
You have order a thin pizza with cheese, pepporoni and cheese. Enjoy!

 * 
 * 
 */