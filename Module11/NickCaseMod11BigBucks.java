/*Program Name: Big Bucks
Assignment: Module 11, Lesson 6, Assignment 1
Author: Nick Case
Date: 3/3/20
Version: 1.0
Program Description: This program creates bankAccount objects and stores them inside an ArrayList and then finds the highest balance account and prints it out
What I learned from this program: how to use enhanced for loop, how to use ArrayLists, why use an ArrayList
What difficulties did I have and how I solved them: I was having trouble making sure that the loop would exit when someone typed exit no matter the case. I realized that I can set the input to lowercase inside the conditional for the if statement. That way if they actually enter a name, it won't be affected by the .toLowerCase
*/

import java.util.*;

public class NickCaseMod11BigBucks
{
    public static void main(String [] args)
    {
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>(20); //create ArrayList
        Scanner userInput = new Scanner(System.in); //Create Scanner

        String nameChoice = ""; //Declaring Variables
        double highestMoney = 0; //These two for finding highest balance
        String highestName = "";

        do
            {
                System.out.print("Please enter the name to whom the account belongs ('Exit' to abort) ");
                nameChoice = userInput.nextLine(); //getting name

                if (!nameChoice.toLowerCase().equals("exit")) //if choice is not exit
                {
                    System.out.print("Please enter the amount of the deposit: "); //get the deposit amount
                    double deposit = Double.parseDouble(userInput.nextLine());

                    System.out.println();

                    BankAccount account = new BankAccount(nameChoice, deposit); //make bank account object with that info
                    bankAccounts.add(account); //add that new account to the ArrayList
                }
            }
        while (!nameChoice.toLowerCase().equals("exit")); //do while the choice does not equal exit

        for (BankAccount temp : bankAccounts) //looping through the Arraylist and setting each one to temp
        {
            if (temp.balance > highestMoney) //if the current balance is greater than the previous highest
            {
                highestMoney = temp.balance; //set new highest
                highestName = temp.name; //get name
            }
        }

        System.out.println("\nThe account with the largest balance belongs to " + highestName); //Print Name and balance of highest balance account
        System.out.println("The amount is " + highestMoney);

    }
}

/* Sample Output:

Please enter the name to whom the account belongs ('Exit' to abort) Jim Jones
Please enter the amount of the deposit: 186.22

Please enter the name to whom the account belongs ('Exit' to abort) Bill Gates
Please enter the amount of the deposit: 102.15

Please enter the name to whom the account belongs ('Exit' to abort) Helen Hunt
Please enter the amount of the deposit: 1034.02

Please enter the name to whom the account belongs ('Exit' to abort) Charles Manson
Please enter the amount of the deposit: 870.85

Please enter the name to whom the account belongs ('Exit' to abort) Exit

The account with the largest balance belongs to Helen Hunt
The amount is 1034.02

 */
