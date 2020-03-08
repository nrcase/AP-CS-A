/*Program Name: Array Example
Assignment: Module 10, Lesson 4, Practice Activity 1
Author: Nick Case
Date: 2/10/20
Version: 1.0
Program Description: This program edits a array already made by replacing one index with a 0 and then replacing all with 0s
What I learned from this program: how to edit arrays, why arrays can be edited
What difficulties did I have and how I solved them: No problems, pretty straight forward.
*/

public class NickCaseMod10ArrayExample
{
        public static void main ( String[] args )     // 1.
        {
            ChangeArray cng = new ChangeArray();        // Create Change Array object

            int[] value = {27, 19, 34, 5, 12} ;         // Create Array

            System.out.println( "Before:" );            // Printing before
            cng.print( value );

            cng.zeroElt( value, 0 ); // Changing number at 0th index to 0
            cng.zeroAll(value);// changing all values to 0
            System.out.println( "After:" );             // Printing after
            cng.print( value );


        }
    }

class ChangeArray
{
    void print ( int[] x ) //method to print out all the elements inside a array
    {
        for ( int j=0; j < x.length; j++ )
            System.out.print( x[j] + " " );
        System.out.println( );
    }

    void zeroElt ( int[] x, int elt )             // method to change a specific index of an array to 0
    {
        if ( elt < x.length )                       // 7.
            x[ elt ] = 0;                             // 8.
    }

    void zeroAll ( int[] ar ) //method to change all numbers to 0 in an array
    {
        for ( int j=0; j < ar.length; j++ )
            ar[j] = 0;
    }
}

/*

Directions: In this practice activity, you will create and make changes to the Array Example program discussed in the lesson.

    1. Copy and paste the following code into BlueJ.
       // Array Example
//
class ChangeArray
{
  void print ( int[] x )
  {
    for ( int j=0; j < x.length; j++ )
      System.out.print( x[j] + " " );
    System.out.println( );
  }

  void zeroElt ( int[] x, int elt )             // 6.
  {
    if ( elt < x.length )                       // 7.
      x[ elt ] = 0;                             // 8.
  }
}

class ChangeTest
{
  public static void main ( String[] args )     // 1.
  {
    ChangeArray cng = new ChangeArray();        // 2.

    int[] value = {27, 19, 34, 5, 12} ;         // 3.

    System.out.println( "Before:" );            // 4.
    cng.print( value );

    cng.zeroElt( value, 0 );                    // 5.
    System.out.println( "After:" );             // 9.
    cng.print( value );
  }
}


       2. Did the zeroElt() method change one of the array's elements?

        Yes

      3. Since the method zeroElt() has a reference to the array, can it change individual array elements?

      Yes because an array is an object and therefore has a direct reference not indirect like a variable

4. If main() had the following method call, what would happen to the array?
    cng.zeroElt( value, 4 );

    The number at the fourth index would be turned into a zero

5. Add the following method in BlueJ

        // Make all the elements zero.
  void zeroAll ( int[] ar )
  {
    for ( int j=0; j < ar.length; j++ )
      ar[j] = 0;
  }

}
    6. Will the j in zeroAll() and the j in print() interfere with each other?

    No, because they are instance variables inside the methods. They only apply inside of their own method.

Sample Output:

Before:
27 19 34 5 12
After:
0 0 0 0 0


 */