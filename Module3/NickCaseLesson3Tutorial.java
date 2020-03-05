
/*
Program Name: Lesson 3 Tutorial
Assignment: Module 3, Lesson 3, Practice Assignment 1
Author: Nick Case
Date: 9/12/19
Version: 1.0
Program Description: This program does 2 seperate things. The first part does integer divison to find the quotient and then uses modulus to find the remainder and then finds the original based of both of those values.
The second part takes whatever is set as x (in this case 5) and determines whether it is even or odd using modulus and the "==" operator. 
What I learned from this program: how to use modulus, how to do calcualtions inside prints, how to use if else, how to use "==".
What difficulties did I have and how I solved them: I wasn't sure what to put inside the if parenthesis in order to find out if something is odd or even. I then went back to the notes and saw the "==" sign, so I googled it and learned that it is used to compare primitive data type values and returns a boolean which I needed for the if else.

 */
public class NickCaseLesson3Tutorial
{
     public static void main(String [] args)
    {
       int quotient, remainder; //Declaring Variables
       quotient = 19/3; //Integer Division
       remainder= 19%3; // Modulus to find Remainder
        System.out.println("The quotient:" + quotient); //Print Quotient
        System.out.println("The remainder:" + remainder); //Print Remainder
        System.out.println("The original:" + (quotient*3+remainder)); //Prints the original by doing the quotient * divsor + remainder
       
       int number = 5; 
       if (number%2 ==0) //If 5/2's remainder is equal to 0 (which means doesn't have a remainder, which means it is even)
        System.out.println(number+" is even"); //Then Print  number +"is even"
       else // If not,
        System.out.println(number+ " is odd"); //Then Print number  + "is odd"
    }
}      
 /* Sample Output:
The quotient:6
The remainder:1
The original:19
5 is odd
  */   
  



