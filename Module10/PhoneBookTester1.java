/*Program Name: Phone Book
Assignment: Module 10, Lesson 5, Practice Assignment 1
Author: Nick Case
Date: 2/13/20
Version: 1.0
Program Description: This program creates a phone book and then does a linear search with the name to find a phone number
What I learned from this program: how to create a linear search algorithm
What difficulties did I have and how I solved them: N/A
*/


public class PhoneBookTester
{
    public static void main(String [] args)
    {
        PhoneBook pb = new PhoneBook(); //Creating phone book object

        //search for "Violet Smith"

        PhoneEntry entry = pb.search("Violet Smith");
        if (entry != null) //if entry is found
        {
            System.out.println(entry.name + ": " + entry.phone); //print name and phone
        }
        else
        {
            System.out.println("Name not found"); //else print
        }
    }

}

class PhoneEntry //Phone entry class to hold phone entries
{
    public String name;
    public String phone;
    PhoneEntry( String n, String p )
    {
        name = n; phone = p;
    }
}

 class PhoneBook
{
    PhoneEntry[] phoneBook; //creating object array of entries

    PhoneBook()
    {
        phoneBook = new PhoneEntry[ 5 ] ; //Create array with 5 spots

        phoneBook[0] = new PhoneEntry( "James Barclay", "(418) 665-1223" ); //Putting in entries to array
        phoneBook[1] = new PhoneEntry( "Grace Dunbar", "(860) 399-3044" );
        phoneBook[2] = new PhoneEntry( "Paul Kratides", "(815) 439-9271" );
        phoneBook[3] = new PhoneEntry( "Violet Smith", "(312) 223-1937" );
        phoneBook[4] = new PhoneEntry( "John Wood", "(913) 883-2874" );
    }

    PhoneEntry search(String targetName) //Searching for a string within array
    {
        for (int j=0; j<phoneBook.length; j++) //while j is less than the length
        {
            if ( phoneBook[ j ].        name.equals( targetName)) //if the current index equals the target string
        {
            return phoneBook[ j ]; //return what is inside the target index
        }

        }
        return null; //if no find, then return null
    }
}

/* Sample Output:

Violet Smith: (312) 223-1937

 */

