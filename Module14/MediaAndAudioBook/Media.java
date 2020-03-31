import java.util.Calendar;

public abstract class Media
{
    public String title;
     public Calendar today;

    public Media() //default
    {
        title = null;
        today = Calendar.getInstance();
    }

    public Media(String t, Calendar c) //normal constructor
    {
        title = t;
        today = c;
    }

    public String getTitle() //getters
    {
        return title;
    }

    public Calendar getToday()
    {
        return today;
    }

    public void setTitle(String title) //setters
    {
        this.title = title;
    }

    public void setToday(Calendar today)
    {
        this.today = today;
    }

    public abstract Calendar getReturnDate();

}
