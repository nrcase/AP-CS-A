/*Program Name: Sieve Numbers
Assignment: Module 10, Lesson 2, Assignment 1
Author: Nick Case
Date: 2/4/2020
Version: 1.0
Program Description: This program finds and organizes numbers through the Sieve sort using object arrays
What I learned from this program: how to use object arrays, how to create object, how to do loops within loops, when to use nested loops
What difficulties did I have and how I solved them: I wasn't sure how implement the idea of crossing out numbers and then I realized that I can create a boolean that is false for being crossed out and true for being fine and then have it be an instance variable inside the objects.
*/

public class NickCaseMod10Prime
{
    public static void main(String [] args)
    {
        int fullValue = 1000; //Declaring variables
        int stoppingValue = fullValue / 2;
        int line = 0;

        Number objectArray[] = new Number[fullValue + 1]; //Creating number array

        for (int arrayIndex = 1; arrayIndex <= fullValue; arrayIndex++)// Creating the objects and storing a number in it and then storing it within the array.
        {
            objectArray[arrayIndex] = new Number(arrayIndex);
        }

        objectArray[1].setNotCrossedOut(false); //Setting 1 to false

        for (int count = 1; count <= stoppingValue; count++) //while the second number is less than 500, increases the second number, that doesn't change until the first one hits a 1000
        {
            if (objectArray[count].isNotCrossedOut()) //if the object's number is not crossed out
            {
                for (int count2 = count + 1; count2 <= fullValue; count2++ ) //while the first number is less than 1000, increases the number that is being modulus, 1 % 1, 2 % 1, 3 % 1,
                {
                    if (objectArray[count2].getCurrentNumber() % objectArray[count].getCurrentNumber() == 0) //if the first number modulus the second number is 0,
                    {
                        objectArray[count2].setNotCrossedOut(false); //set second number within the object to being crossed out
                    }
                }
            }
        }

        for (int count3 = 1; count3 <= fullValue; count3++) //for loop to print out the numbers that are not crossed out
        {
            if (objectArray[count3].isNotCrossedOut()) //if not crossed out
            {
                System.out.printf("%3d ",objectArray[count3].getCurrentNumber()); //print current number and align right with a width of 3 spaces
                line++;

                if (line == 15) //if statement with line incrementing above in order to create rows
                {
                    System.out.println("");
                    line = 0;
                }
            }
        }

    }
}
/* Sample Output:

  2   3   5   7  11  13  17  19  23  29  31  37  41  43  47
 53  59  61  67  71  73  79  83  89  97 101 103 107 109 113
127 131 137 139 149 151 157 163 167 173 179 181 191 193 197
199 211 223 227 229 233 239 241 251 257 263 269 271 277 281
283 293 307 311 313 317 331 337 347 349 353 359 367 373 379
383 389 397 401 409 419 421 431 433 439 443 449 457 461 463
467 479 487 491 499 503 509 521 523 541 547 557 563 569 571
577 587 593 599 601 607 613 617 619 631 641 643 647 653 659
661 673 677 683 691 701 709 719 727 733 739 743 751 757 761
769 773 787 797 809 811 821 823 827 829 839 853 857 859 863
877 881 883 887 907 911 919 929 937 941 947 953 967 971 977
983 991 997

 */
