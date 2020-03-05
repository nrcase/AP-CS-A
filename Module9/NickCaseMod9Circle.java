public class NickCaseMod9Circle
{
    public NickCaseMod9Circle(double r) //default constructor
    {
       radius = r;
    }

    public double area() //finding area
    {
        double a = Math.PI * radius * radius;
        return a;
    }

    public double circumference() //find circumference
    {
        double c = 2 * Math.PI * radius;
        return c;
    }

    private double radius;

    public double getRadius() //getter method
    {
        return radius;
    }

    public void setRadius(double r) //setter method
    {
        radius = r;
    }
}
