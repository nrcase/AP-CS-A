/*Program Name: Address Formatter
Assignment: Module 9, Lesson 4, Assignment 1
Author: Nick Case
Date: 1/22/2020
Version: 1.0
Program Description: This program takes an address and formats like sending it through the mail
What I learned from this program: How to manipulate strings with substring, trim and indexOf, creating objects and classes
What difficulties did I have and how I solved them: I wasn't sure how to take apart the string, so I started looking at methods that manipulate strings and realized that I could use .indexOf to use inside of .substring
*/

import java.util.Scanner;

public class AddressTester
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner

        System.out.println("Enter an address with a street number or post office box number, city, state, and zip. ");
        Address Address1 = new Address(); //Creating object

        Address1.Address(userInput.nextLine()); //getting street address
        Address1.otherAddressStuff(userInput.nextLine()); //getting the rest of the address and then pulling it apart

        Address1.finalPrint(); // Printing out the address in the correct format
    }
}

/* Sample Output:

Enter an address with a street number or post office box number, city, state, and zip.
123 Main Street
New York, NY 01234

123 Main Street
New York
NY
01234

Enter an address with a street number or post office box number, city, state, and zip.
123 Main Street
New York, N 01234
Please enter a 2 digit state code

123 Main Street
New York, NC 1234567890
Please enter a 5 digit zip code

 */
