/*Program Name: Phone Book 2
Assignment: Module 10, Lesson 5, Assignment 1
Author: Nick Case
Date: 2/13/20
Version: 1.0
Program Description: This program acts like a phone book, adding, removing and checking contacts
What I learned from this program: how to use object arrays, how to linear search, how to manipulate arrays
What difficulties did I have and how I solved them: I wasn't sure how to get all the people with the same last name to print out if the first name was blank, so I went back and looked at the notes for array of objects and then got the idea that the method could return an array with all the people who have the same name.
*/

import java.util.Scanner;

public class PhoneBookTester
{
    public static void main(String [] args)
    {
        PhoneBook pb = new PhoneBook(); //Creating phone book object


        Scanner userInput = new Scanner(System.in); //Creating Scanner

        String choice = "1";
        while (choice.equals("1") || choice.equals("2") || choice.equals("3"))  //Loop to keep the menu going
        {

            System.out.print("What would you like to do? \n 1. Check Phone Book \n 2. Add a new Contact \n 3. Remove a Contact \n Anything else will quit \n Choice: "); //Menu
            choice = userInput.nextLine();

            if (choice.equals("1")) //If you choose check phone book
            {
                System.out.print("Last Name? "); //Get last name
                String lastName = userInput.nextLine();

                System.out.print("First Name? "); //Get first name
                String firstName = userInput.nextLine();


                PhoneEntry[] entry = pb.search(lastName.toUpperCase(), firstName.toUpperCase()); //search for last name and first name in uppercase, returns an array
                if (entry.length > 0) // the entry array has something in it,
                {
                    for (int count = 0; count < entry.length; count++) //print out first name and last name
                    {
                        System.out.println(entry[count].firstName + " " + entry[count].lastName + ": " + entry[count].phone + "\n");
                    }
                } else if (lastName.equals("quit")) //if last name equals quit, quit the program
                {
                    System.out.println("Good-bye");
                    System.exit(1);
                } else {
                    System.out.println("Name not found"); //else print
                }
            } else if (choice.equals("2"))  //if want to add name
            {
                System.out.print("First Name: ");
                String addFirstName = userInput.nextLine(); //get first name

                System.out.print("Last Name: ");
                String addLastName = userInput.nextLine(); //get last name

                System.out.print("Phone Number: ");
                String addPhoneNumber = userInput.nextLine();//get phone number

                pb.addEntry(addFirstName, addLastName, addPhoneNumber);//add contact with method
            } else if (choice.equals("3")) {//if want to delete
                System.out.print("First Name: ");//get first name
                String removeFirstName = userInput.nextLine();

                System.out.print("Last Name: ");//get second name
                String removeLastName = userInput.nextLine();

                pb.deleteEntry(removeFirstName, removeLastName); //Delete entry with method
            } else {
                System.out.println("Quitting");//if enter anything else, quit
                System.exit(1);
            }
        }
    }
}

class PhoneEntry //Phone entry class to hold phone entries
{
    public String firstName;
    public String lastName;
    public String phone;
    PhoneEntry( String fName, String lName, String p )
    {
        firstName = fName;
        lastName = lName;
        phone = p;
    }
}

class PhoneBook
{
    PhoneEntry[] phoneBook; //creating object array of entries
    private int numberOfEntries; //int that is manipulated to add and subtract the number of entries in the array
    private int lastFoundIndex; //index of the last item in the array

    PhoneBook()
    {
        phoneBook = new PhoneEntry[ 10 ] ; //Create array with 10 spots

        phoneBook[0] = new PhoneEntry( "James".toUpperCase(), "Barclay".toUpperCase(), "(418) 665-1223" ); //Putting in entries to array
        phoneBook[1] = new PhoneEntry( "Grace".toUpperCase(), "Dunbar".toUpperCase(), "(860) 399-3044" );
        phoneBook[2] = new PhoneEntry( "Paul".toUpperCase(), "Kratides".toUpperCase(), "(815) 439-9271" );
        phoneBook[3] = new PhoneEntry( "Violet".toUpperCase(), "Smith".toUpperCase(), "(312) 223-1937" );
        phoneBook[4] = new PhoneEntry( "John".toUpperCase(), "Wood".toUpperCase(), "(913) 883-2874" );
        phoneBook[5] = new PhoneEntry("Bob".toUpperCase(),"Smith".toUpperCase(), "(234) 234-8765" );
        phoneBook[6] = new PhoneEntry("Fred".toUpperCase(),"Smith".toUpperCase(), "(234) 234-8765" );

        numberOfEntries=7;
    }

    PhoneEntry[] search(String lastN, String firstN) //Searching for a string within array
    {
        PhoneEntry[] lastNameArray = new PhoneEntry[numberOfEntries]; //creating a new array with the right number of entries
        int index = -1;

        for (int j=0; j < numberOfEntries; j++) //while j is less than the number of entries
        {
            if ( phoneBook[ j ].firstName.equals(firstN) && phoneBook[j].lastName.equals(lastN)) //if the current index equals the target string
            {
                lastNameArray = new PhoneEntry[1]; //set the lastName Arrray to only have 1 spot
                lastNameArray[0] = phoneBook[j]; //set that one spot to the match
                lastFoundIndex = j; //set the last index in the array
                return lastNameArray; //return the array with the one name in it
            }

            if (firstN.equals("")) //if there is nothing in the first name
            {

                if (phoneBook[j].lastName.equals(lastN)) //if the last name equals the last name in the array
                {
                    index++; //increase the index by one
                    lastNameArray[index] = phoneBook[j]; //put the contact into the other array of people with the same name in the next index spot
                }
            }
        }
        PhoneEntry[] finalArray = new PhoneEntry[index+1]; //Create new array with the index + 1 as the size, in order to avoid error

        for (int count = 0; count < index+1; count++) //for the number of contacts with the same last name
        {
            finalArray[count] = lastNameArray[count]; //put those contacts into a different array
        }

        return finalArray; // return the final array
    }

    public void addEntry(String firstName, String lastName, String phoneNumber) //method to add a contact
    {
        phoneBook[numberOfEntries] = new PhoneEntry(firstName.toUpperCase(), lastName.toUpperCase(), phoneNumber.toUpperCase()); //add the new contact to the phone book at the last index
        numberOfEntries++; //increase the index
        System.out.println("");
    }

    public void deleteEntry(String firstName, String lastName) //method to delete a contact
    {
        PhoneEntry[] deleteArray = this.search(lastName.toUpperCase(), firstName.toUpperCase()); //search for the name to delete

        if (deleteArray.length == 1) //if that array has something in it, (it found something)
        {
            phoneBook[lastFoundIndex] = null; //set the index it is at null
            for (int loop = lastFoundIndex; loop < numberOfEntries - 1; loop++) //loop through the array, moving all the objects up one index
            {
                phoneBook[loop] = phoneBook[loop + 1];
            }
            numberOfEntries--; //Subtracting the extra space with the null entry
        }

        System.out.println("");
    }

    public void showPhoneBook() //tester class to make sure adding and subtracting worked
    {
        for (int count = 0; count < numberOfEntries; count++) //for everything in the array
        {
            System.out.println(phoneBook[count].firstName + phoneBook[count].lastName + phoneBook[count].phone + "\n"); //print out all the names and numbers
        }
    }

}

/* Sample Output:

What would you like to do?
 1. Check Phone Book
 2. Add a new Contact
 3. Remove a Contact
 Anything else will quit
 Choice: 2
First Name: Nick
Last Name: Case
Phone Number: 2

What would you like to do?
 1. Check Phone Book
 2. Add a new Contact
 3. Remove a Contact
 Anything else will quit
 Choice: 3
First Name: Nick
Last Name: Case


What would you like to do?
 1. Check Phone Book
 2. Add a new Contact
 3. Remove a Contact
 Anything else will quit
 Choice: 1
Last Name? SmiTH
First Name? Violet
VIOLET SMITH: (312) 223-1937

What would you like to do?
 1. Check Phone Book
 2. Add a new Contact
 3. Remove a Contact
 Anything else will quit
 Choice: 1
Last Name? Smith
First Name?
VIOLET SMITH: (312) 223-1937

BOB SMITH: (234) 234-8765

FRED SMITH: (234) 234-8765

What would you like to do?
 1. Check Phone Book
 2. Add a new Contact
 3. Remove a Contact
 Anything else will quit
 Choice: 8
Quitting

 */
