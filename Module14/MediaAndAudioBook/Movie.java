import java.util.Calendar;

public class Movie extends Media
{
    private int year;

    public Movie()
    {
        super();
        year = 0;
    }

    public Movie(String t, int y, Calendar c)
    {
        super(t,c);
        year = y;
    }

    public Movie(Movie m)
    {
        super(m.title, m.today);
        year = m.year;
    }

    //Set

    public void setYear(int year) {
        this.year = year;
    }


    //Get

    public int getYear()
    {
        return year;
    }


    //Other

    public Calendar getReturnDate() //Calculates Due Date
    {

        Calendar dueDate = Calendar.getInstance();
        dueDate.set(Calendar.MONTH, today.get(Calendar.MONTH));
        dueDate.set(Calendar.YEAR, today.get(Calendar.YEAR));
        dueDate.add(today.DATE,7);
        return dueDate;
    }

    public String toString() //Default method, print the specs of the Book object
    {
        String str = "The specs of this movie are: ";
        str += "\n\t Title: " + title;
        str += "\n\t Year: " + year;
        str += "\n\t Check Out Date: " + (getReturnDate().MONTH + 1)+ "/" + getReturnDate().DAY_OF_MONTH;
        return  str;
    }

}
