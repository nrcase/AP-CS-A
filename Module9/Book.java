public class Book // header in testPatron
{
    private String title;
    private String author;



    public Book() //default constructor
    {
        title = null;
        author = null;
    }

    public Book(String t, String a) //Normal constructor for book object
    {
        title = t;
        author = a;
    }

    public Book(Book b)
    {
        title = b.title;
        author = b.author;
    }


    public String toString() //Default method, print the specs of the book object
    {
        String str = "The specs of this book are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Author: " + author;
        return  str;
    }

    // Accessors (getters)


    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    // Mutator (setters)


    public void setTitle(String t)
    {
        title = t;
    }

    public void setAuthor(String a)
    {
        author = a;
    }
}
