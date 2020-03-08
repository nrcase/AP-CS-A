public class Patron //header in test Patron
{
    private String FName;
    private String LName;
    private String libNumber;
    private Book patBook;

    public Patron() //default constructor
    {
        FName = null;
        LName = null;
        libNumber = null;
        patBook = null;
    }

    public Patron(String f, String l, String ln , Book b) //normal constructor
    {
        FName = f;
        LName = l;
        libNumber = ln;
        patBook = b;
    }

    // Accessors (gettors)

    public String getFName()
    {
        return FName;
    }

    public String getLName()
    {
        return LName;
    }

    public String getLibNumber()
    {
        return libNumber;
    }

    public Book getBook()
    {
        return patBook;
    }


    //Mutators


    public void setFName(String f)
    {
        FName = f;
    }

    public void setLName(String l)
    {
        LName = l;
    }

    public void setLibNumber(String lib)
    {
        libNumber = lib;
    }

    public void setPatBook(Book b)
    {
        patBook = b;
    }

    public String toString() //Default method, print the specs of the book object
    {
        String str = "The specs of this patron are: ";
        str += "\n\t First Name: " + FName;
        str += "\n\t Last Name: " + LName;
        str += "\n\t Library Number: " + libNumber;
        str += "\n\t" + patBook;
        return  str;
    }
}
