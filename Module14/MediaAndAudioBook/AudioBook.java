import java.util.Calendar;

public class AudioBook extends Media
{
    public AudioBook()
    {
        super();
        narr = null;
        year = 0;
    }

    public AudioBook(String t, Calendar c, String n, int y)
    {
        super(t, c);
        narr = n;
        year = y;
    }

    private String narr;
    private int year;

    //Get

    public int getYear()
    {
        return year;
    }

    public String getNarr()
    {
        return narr;
    }

    //Set

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setNarr(String n)
    {
        this.narr = n;
    }

    //Other

    public String toString() //Default method, print the specs of the Book object
    {
        String str = "The specs of this audio book are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Year: " + year;
        str += "\n\t Narrator: " + narr;
        str += "\n\t Check Out Date: " + (getReturnDate().MONTH+1) + "/" + getReturnDate().DATE;
        return  str;
    }

    public Calendar getReturnDate() //Calculates Due Date
    {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(today.MONTH, today.get(today.MONTH));
        dueDate.set(today.YEAR, today.get(today.YEAR));
        dueDate.add(today.DATE,14);
        return dueDate;
    }

}
