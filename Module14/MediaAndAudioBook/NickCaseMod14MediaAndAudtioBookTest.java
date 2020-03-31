/*Program Name: Media and AudioBook
Assignment: Module 14, Lesson 3, PA 1
Author: Nick Case
Date: 3/31/20
Version: 1.0
Program Description: This creates books, audiobooks, and movies and prints their details
What I learned from this program: polymorphism, inheritance, OOP
What difficulties did I have and how I solved them: I got everything to work except the dates with the calendar object. I was able to fix the null pointer error that she had in the video, but I couldn't figure out why the day never changed. I spent so much time working on trying to get it fixed and work. 
*/

import java.util.Calendar;

public class NickCaseMod14MediaAndAudtioBookTest
{
    public static void main(String[] args)
    {
        Patron Emily = new Patron(); //create Patron

        Media myBook = new Book(); //Creates 2 Media Book Type
        Media myBook2 = new Book("ACD", "Bob", Calendar.getInstance());

        Media myMovie = new Movie(); //Create 2 Media Type Movie
        Media myMovie2 = new Movie("456", 1986, Calendar.getInstance());

        Media myAudioBook = new AudioBook(); //Create 2 Media Type AudioBook
        Media myAudioBook2 = new AudioBook("Hello", Calendar.getInstance(), "Shawn", 763);

        myMovie.setTitle("Garden State"); //setting for 1st movie
        ((Movie) myMovie).setYear(2008);

        myBook.setTitle("ABC"); //setting for 1st book
        ((Book) myBook).setAuthor("Suzie Smith");

        myAudioBook.setTitle("123"); //setting for 1st audiobook
        ((AudioBook) myAudioBook).setYear(1111);
        ((AudioBook) myAudioBook).setNarr("Joe Williams");

        System.out.println(myBook);//printing books
        System.out.println(myBook2);

        System.out.println(myMovie); //printing movies
        System.out.println(myMovie2);

        System.out.println(myAudioBook); //printing audiobooks
        System.out.println(myAudioBook2);
    }
}

/* Sample Output:

The specs of this book are:
	 Title: ABC
	 Author: Suzie Smith
	 Check Out Date: 3/5
The specs of this book are:
	 Title: ACD
	 Author: Bob
	 Check Out Date: 3/5
The specs of this movie are:
	 Title: Garden State
	 Year: 2008
	 Check Out Date: 3/5
The specs of this movie are:
	 Title: 456
	 Year: 1986
	 Check Out Date: 3/5
The specs of this audio book are:
	 Title: 123
	 Year: 1111
	 Narrator: Joe Williams
	 Check Out Date: 3/5
The specs of this audio book are:
	 Title: Hello
	 Year: 763
	 Narrator: Shawn
	 Check Out Date: 3/5

 */