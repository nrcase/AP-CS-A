
public class NickCaseMod3Circle
{
   public NickCaseMod3Circle(double r) //Constructer, setting input to radius variable 
   {
       radius=r;
    }
    public double area() //Creating Area method
   {
        double a = Math.PI * radius * radius; //Area calculation
        return a;
   }
   public double circumference() //Creating circumference method
   {
       double c = 2 * Math.PI * radius; //Circumference Calulation
       return c;
   }
   private double radius; //Declaring private variable radius
   private double finalDiameter;
   public double getRadius() //Creating .getRadius method
   {
       //radius=r; This was in the video, but it doesn't work
       return radius; //Returns the radius
   }
   public void setRadius(double nr) //Creating the .setRadius method
   {
       radius = nr; //Setting new input to variable radius
   }
   public double diameter() //Creating the .diameter method
   {
       double finalDiameter = radius * 2; //Finds Diameter by multiplying radius by 2
       return finalDiameter; //returns the radius to the whatever is running it.
   }
}