public class Recipe
{
    public Recipe(String theName) //Creates object
    {
        name = theName;
    }

    public void setServings(int x) //sets Servings
    {
        //code
    }

    public double getRetailCost() //gets retail cost
    {
        //code
        int x = 13;
        double tempCost = pricePerCalorie(x) * calories + cost;
        return tempCost;
    }

    private double pricePerCalorie(int z) //gets price per Calorie to use inside this class
    {
        //code
        return 15.21;
    }

    public int calories; //intializing variables for methods and the class
    public int carbs;
    public int fat;
    private double cost;
    public String name;
}
