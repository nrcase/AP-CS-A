public class Patron
{
    private String FName;
    private String LName;
    private String libNumber;
    private Media myMedia;

    public Patron() //default constructor
    {
        FName = null;
        LName = null;
        libNumber = null;
        myMedia = null;
    }

    public Patron(String f, String l, String ln , Media m) //normal constructor
    {
        FName = f;
        LName = l;
        libNumber = ln;
        myMedia = m;
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

    public Media getMedia()
    {
        return myMedia;
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

    public void setmyMedia(Media b)
    {
        myMedia = b;
    }

    public String toString() //Default method, print the specs of the Media object
    {
        String str = "The specs of this patron are: ";
        str += "\n\t First Name: " + FName;
        str += "\n\t Last Name: " + LName;
        str += "\n\t Library Number: " + libNumber;
        str += "\n\t" + myMedia;
        return  str;
    }
}
