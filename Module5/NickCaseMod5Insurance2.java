import java.util.*;
public class NickCaseMod5Insurance2
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in); //Creating Scanner object
        int insurance = 0;

        System.out.print("Driver age = ");
        int driverAge = userInput.nextInt(); //Getting integer input from user
        if (driverAge == 25) //If driver age is 25, then insurance is 500
        {
            insurance = 500;
        }
        if (driverAge >= 16 && driverAge < 18) //If the driver age is between 16 and 18 (including 16, not 18), take the age and multiply it by 88.
        {
            insurance = driverAge * 88;
        }
        if (driverAge >= 18 && driverAge < 25) //If the driver age is between 18 and 25 (including 18, not 25), take the age and multiply it by 72.
        {
            insurance = driverAge * 72;
        }
        System.out.println("Insurance cost = " + insurance);
    }
}
