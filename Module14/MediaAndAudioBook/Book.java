import java.util.Calendar;

public class Book extends Media
{
    private String author;



    public Book() //default constructor
    {
        super();
        author = null;

    }

    public Book(String t, String a, Calendar c) //Normal constructor for book object
    {
        super(t,c);
        author = a;
    }

    public Book(Book b)
    {
        super(b.title, b.today);
        author = b.author;
    }


    // Accessors (getters)


    public String getAuthor()
    {
        return author;
    }


    // Mutator (setters)

    public void setAuthor(String a)
    {
        author = a;
    }


    /////

    public Calendar getReturnDate() //Calculates Due Date
    {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(today.MONTH, today.get(Calendar.MONTH));
        dueDate.set(today.YEAR, today.get(Calendar.YEAR));
        dueDate.add(today.DATE,21);
        return dueDate;
    }

    public String toString() //Default method, print the specs of the Book object
    {
        String str = "The specs of this book are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Author: " + author;
        str += "\n\t Check Out Date: " + (getReturnDate().MONTH+1) + "/" + getReturnDate().DATE;
        return  str;
    }



}
