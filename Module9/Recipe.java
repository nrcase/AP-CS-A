//Creating this quickly after realizing that the video needs the class to follow, but didn't really end up using it.
public class Recipe
{
    public Recipe(String theName)
    {
        String name = theName;
    }

    public void setServings(Circle xx) //Doesn't do anything, takes Circle object
    {

    }

    public double getRetailCost() //gets RetailCost
    {
        int x = 13;
        double tempCost = pricePerCalorie(x) * calories + cost;
        return tempCost;
    }

    private double pricePerCalorie(int z)// just gives a int, doesn't acutally do anything
    {

        return 15.21;
    }

    public int calories; //Declaring variables
    public int carbs;
    public int fat;
    private double cost;
}
