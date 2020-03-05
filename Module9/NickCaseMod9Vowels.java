/*Program Name: Vowels
Assignment: Module 9 Lesson 1 Assignment 1
Author: Nick Case
Date: 1/2/20
Version: 1.0
Program Description: This program gets a string and then checks char by char if it is a vowel or consonant and counts how many of each.
What I learned from this program: how to create methods, how to use methods to simplify actions
What difficulties did I have and how I solved them: I was getting more consonants than I was supposed to do. Then I realized that the program was counting spaces as consonants. Once, I added an if statement not counting the spaces, it worked correctly.

*/

import java.util.Scanner;

public class NickCaseMod9Vowels
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner
        String entry;
        String choice = "y";
        while (choice.equals("y")) //Loop to repeat getting String
        {
            System.out.print("Please enter a string of characters. ");
            entry = userInput.nextLine(); //Getting String

            System.out.println("The string " + entry + " contains " + constCounter(entry) + " consonants and " + vowelCounter(entry) + " vowels."); //Doing the methods to count and printing it
            System.out.println("Would you like to enter a new string? (y/n)");
            choice = userInput.nextLine(); //getting exit value
        }
    }

    private static boolean isAVowel(char entry) //method to return boolean about whether the char is a vowel or not
    {
        boolean entryIsVowel;
        entryIsVowel = entry == 'a' || entry == 'e' || entry == 'i' || entry == 'o' || entry == 'u'; //true if it is a vowel
        return entryIsVowel;
    }

    private static boolean isConsonants(char entry) //method to return a boolean value about whether the passed char is a consonant or not
    {
        boolean entryIsVowel;
        entryIsVowel = !(entry == 'a' || entry == 'e' || entry == 'i' || entry == 'o' || entry == 'u'); //true if it is not a vowel
        return entryIsVowel;
    }

    private static int vowelCounter(String entry) //method to count vowels
    {
        int numberOfVowels = 0;
        for (int count = 0; count < entry.length(); count++) //loops through every char using the length
        {
            if (entry.charAt(count) != ' ' && entry.charAt(count) != '.' && entry.charAt(count) != ',') //if the char at the current index is a space, period or comma,  move on
            {
                if (isAVowel(entry.charAt((count)))) //If the char at the current index is a Vowel (true)
                {
                    numberOfVowels++;//increment the number of vowels.
                }
            }
        }
        return numberOfVowels;
    }
    private static int constCounter(String entry) //method to count consonants
    {
        int numberOfConst = 0;
        for (int count = 0; count < entry.length(); count++) //loops through every char until it hits the end of the string
        {
            if (entry.charAt(count) != ' ' && entry.charAt(count) != '.' && entry.charAt(count) != ',') //if the current char is a space or period or comma , don't add
            {
                if (isConsonants(entry.charAt((count)))) // if the method that checks that is consonant is true at the current char, add one to the number of consonants
                {
                    numberOfConst++;
                }
            }
        }
        return numberOfConst;
    }

}

/* Sample Output:

Please enter a string of characters. Little Miss Muffet sat on her tuffet.
The string Little Miss Muffet sat on her tuffet. contains 20 consonants and 10 vowels.
Would you like to enter a new string? (y/n)
y
Please enter a string of characters. Little Miss Muffet sat on her tuffet.
The string Little Miss Muffet sat on her tuffet. contains 20 consonants and 10 vowels.
Would you like to enter a new string? (y/n)
n

 */
