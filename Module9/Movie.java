import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Movie
{
    private String movieName; //Declaring variables to set default values
    private String genre;
    private int rating;
    private double costBuy;
    private double costRent;

    public Movie() //Default constructor
    {
        movieName = "";
        genre = "";
        rating = 0;
        costBuy = 0.00;
        costRent = 0.00;
    }

    public void printInfo() throws FileNotFoundException //Prints out the info
    {
        File file = new File("/Users/nickcase/Desktop/MovieFiles.txt"); //Creating file object that holds the .txt file
        Scanner sc = new Scanner(file); //Creating scanner in order to read the .txt file

        while (sc.hasNextLine()) //while the file has text, for prints could set the sc.nextLine()s to the variables above to keep more neat, but this way is more efficient, uses less code and processes
        {
                System.out.println(sc.nextLine()); //Print spaces
                System.out.println("Movie: " + sc.nextLine()); //Print title
                System.out.println("Genre: " + sc.nextLine()); //Print genre
                System.out.println("Rating (out of 10): " + sc.nextLine()); //Print rating
                System.out.println("Cost of the movie: $" + sc.nextLine()); //Print cost
                System.out.println("Movie rental: $" + sc.nextLine() + "\n"); //Print rental
        }
    }
}
