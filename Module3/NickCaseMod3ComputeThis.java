/*
Program Name: Compute This
Assignment: Module Three Lesson Five, Practice Assignment One
Author: Nick Case
Date: 9/16/19
Version: 1.0
Program Description: This program does various different advanced math calculations using the Math class.
What I learned from this program: how to use all the different parts of the Math class like, abs, sqrt, round,ceiling, etc..; and how to use those classes inside a System.out.println
What difficulties did I have and how I solved them: I had trouble remebering the correct syntax for round and power so I went back to the notes and check.
I ran the program and the absoulute value wasn't working so I looked back at the code and I had put in the wrong variable, so I switched the y to a z.
 */
public class NickCaseMod3ComputeThis
{
    public static void main(String[] args)
    {
        int x,y,z; //Declaring Variables
        double w;
        x=3; // Setting Variables
        y=-5;
        z=0;
        w=17.5;
        System.out.println ("x= " +x); // Displaying the base values of x,y,z, and w
        System.out.println ("y= " +y);
        System.out.println ("z= " +z);
        System.out.println ("w= " +w);
        z= Math.abs(y); // Set absolute value of y to z
        System.out.println ("z is the absolute value of y and is " + z); //Displaying Z that is now set to abs of y
        System.out.println ("The square root of w is "+ Math.sqrt(w)); //Square Root of W displayed
        System.out.println ("x raised to the power of z is " + Math.pow(x,z)); //X raised to the power of z (3^5)
        System.out.println ( Math.max(x,y) + " is the max of x and y."); //Between x and y, x is higher
        System.out.println ( Math.min(x,y) + " is the min of x and y."); //Between x and y, y is lower 
        System.out.println ("If you round w, you get " + Math.round(w)); // Rounding W
        System.out.println ("The floor value of w is " + Math.floor(w));  // Floor value of w (17.5) is 17.0
        System.out.println ("The ceiling value of w is " + Math.ceil(w));  //Ceiling value of w (17.5) is 18.0
        System.out.println ("A random number between 1 and 10 is " + Math.random()*10); // An algorithm chooses a "random" number between 0 and 1 and then it is mutiplied by 10 in order to make a random number between 0 and 10.
        
    }
}

/* Sample Output
x= 3
y= -5
z= 0
w= 17.5
z is the absolute value of y and is 5
The square root of w is 4.183300132670378
x raised to the power of z is 243.0
3 is the max of x and y.
-5 is the min of x and y.
If you round w, you get 18
The floor value of w is 17.0
The ceiling value of w is 18.0
A random number between 1 and 10 is 9.409928992290709 (this number will change each time)
 */