import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 * 
 * Added keywords for " ", "sports", "phone", "pet" and "because"
 * Respones in order are: Please say something, What kind of phone do you have?, What is your favorite sport?, What kind of pet do you like?, and
 * Wow!, because is a big word! It has "stringLength" letters
 * 
 * Program Name: Keywords
Assignment: Module 7, Lesson 3, Assignment 2 
Author: Nick Case
Date: 12/3/19
Version: 1.0 
Program Description: Basic chat bot with added keywords and response
What I learned from this program: how to use classes, create methods, how to add keywords to a chatbot
What difficulties did I have and how I solved them: Wasn't sure where to get the Magpie files, but looked through the notes and found them. No problems other than that.
 * 
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
