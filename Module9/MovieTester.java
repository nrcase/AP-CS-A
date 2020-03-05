/*Program Name: Movie Sorter
Assignment: Module 9, Lesson 4, Assignment 3
Author: Nick Case
Date: 1/23/20
Version: 1.0
Program Description: This program takes movies from a text file and prints and formats it
What I learned from this program: how to use objects, how to use classes, how to read from a text file
What difficulties did I have and how I solved them: I wasn't sure how to read from a text file, but then I looked back on my notes and found that you have to create objects (scanner and file)
*/

public class MovieTester
{
    public static void main(String [] args) throws Exception
    {
        Movie movieSorter = new Movie(); //Creating object for movie

        movieSorter.printInfo(); //Doing method to import the file and then format it
    }
}

/* Sample Output:

Movie: Avenger's Endgame
Genre: Action
Rating (out of 10): 9
Cost of the movie: $18.00 //New Movie so more
Movie rental: $8.00


Movie: Fast and the Furious
Genre: Action
Rating (out of 10): 5
Cost of the movie: $19.99 //Example Movie
Movie rental: $6.00


Movie: One Flew over the Cuckoo's Nest
Genre: Classic
Rating (out of 10): 7
Cost of the movie: $12.99 //Example Movie
Movie rental: $3.00


Movie: Blues Brothers
Genre: Comedy
Rating (out of 10): 10
Cost of the movie: $5.00 // Really old movie from 1970s so cheaper
Movie rental: $1.00


Movie: Jumanji
Genre: Adventure
Rating (out of 10): 8
Cost of the movie: $15.00 // Newer movie, but not as popular as avengers
Movie rental: $7.00


Movie: National Treasure
Genre: Adventure
Rating (out of 10): 10
Cost of the movie: $9.00 //Fairly old movie, early 2000s, but still good
Movie rental: $2.00


Movie: National Treasure 2
Genre: Adventure
Rating (out of 10): 8
Cost of the movie: $13.00 //Slightly newer movie, but still kind of old
Movie rental: $6.00


Movie: Peabody and Sherman
Genre: Adventure
Rating (out of 10): 4
Cost of the movie: $14.00 //Kind of new movie, but was received bad
Movie rental: $6.00


Movie: The Martian
Genre: Action
Rating (out of 10): 9
Cost of the movie: $15.00 //Older movie, but was received well in the theaters
Movie rental: $8.00


Movie: The Emoji Movie
Genre: Cartoon
Rating (out of 10): 1
Cost of the movie: $1.00 //Kind of new movie, but was horrible, worst movie in a while.
Movie rental: $00.05

 */
