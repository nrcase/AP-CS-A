/*Program Name: Library Project
Assignment: Module 9, Lesson 1, Practice Assignment 1, Part 1 and 2
Author: Nick Case
Date: 12/18/19
Version: 1.0
Program Description: This program uses objects to set who is checking out a book and what book is being checked out
What I learned from this program: how to create our own objects, syntax for that, how to create getters and setters, how to use other classes
What difficulties did I have and how I solved them: No difficulties, pretty easy to follow the video
*/

public class testPatron
{
    public static void main(String [] args)
    {
        Book myBook = new Book("ABC", "Lucy Wells"); //Creating book object
        Book myBook2 = new Book("Hiking", "Go Trails"); //Creating Second book object
        Patron pat1 = new Patron(); //creating Patron with default constructor
        Patron pat2 = new Patron("Henry", "Wells", "nash294", myBook); //Creating patron with parameters

        System.out.println("" + pat2);

        pat1.setFName("Mary"); //Using setters
        pat1.setLName("Suzel");
        pat1.setLibNumber("nash65498");
        pat1.setPatBook(myBook2);
        System.out.println("" + pat1);


    }


}
