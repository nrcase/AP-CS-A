/*Program Name: Concert Calculations
Assignment: Module 8, Lesson 2, Assignment 1
Author: Nick Case
Date: 12/10/19
Version: 1.0
Program Description: This program finds statistics about concert tickets sold using methods
What I learned from this program: how to create methods, how to use methods to simplify code
What difficulties did I have and how I solved them: I wasn't sure how to do the percent money lost and then I went back and read the Assignment sheet and then realized that I needed an if statement to determine which cost per ticket to use. After finding that out, the rest of the method was easy and allowed me to finish the program.
*/

import java.util.Scanner;

public class NickCaseMod8ConcertRun
{
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in); //creating Scanner
        int capacity, phonePricePer, phoneSales, venueSales, venuePricePer, ticketsToSell;

        System.out.print("What is the capacity of the venue? "); //Getting input
        capacity = userInput.nextInt();

        System.out.print("What is the price per ticket sold by phone? $");
        phonePricePer = userInput.nextInt();

        System.out.print("What is the number of phone sales? ");
        phoneSales = userInput.nextInt();

        System.out.print("What is the price per ticket sold at the venue? $");
        venuePricePer = userInput.nextInt();

        System.out.print("What is the number of venue ticket sales? ");
        venueSales = userInput.nextInt();

        System.out.print("What is the number to tickets to sell? "); //End Getting input
        ticketsToSell = userInput.nextInt();

        System.out.println("\n Total Tickets Sold: " + numberSoldTotal(venueSales, phoneSales)); //Doing methods to do respective actions, see string inside println for info
        System.out.println("Tickets left:" + ticketsLeft(venueSales,phoneSales,capacity));
        System.out.println("Phone Sales vs. Venue Sales: " + phoneSalesPercent(phoneSales, capacity) + " vs. " + venueSalesPercent(venueSales, capacity) );
        System.out.println("Percent capacity usage is "  + percentCapacity(venueSales, phoneSales, capacity) + " or " + (percentCapacity(venueSales, phoneSales, capacity) * 100));
        System.out.println("Phone Sales: $" + phoneMoneyTotal(phoneSales, phonePricePer));
        System.out.println("Venue Sales: $" + venueMoneyTotal(venueSales, venuePricePer));
        System.out.println("Total Sales: $" + ticketSalesTotal(venueSales, phoneSales, venuePricePer, phonePricePer));
        System.out.println("Lost revenue based on the lowest price ticket: $" + lostRevenue(venueSales, phoneSales, capacity, venuePricePer, phonePricePer)); //End of printing methods


    }

    public static int ticketSalesTotal (int venueSold, int phoneSold, int venueCost, int phoneCost)  //Finding total money made
    {
        int finalSales;
        finalSales = (venueCost * venueSold) + (phoneCost * phoneSold);
        return finalSales;
    }

    public static int numberSoldTotal(int venueTotal, int phoneTotal) //Finding Tickets sold final
    {
        int finalTotal;
        finalTotal = venueTotal + phoneTotal;
        return finalTotal;
    }

    public static int phoneMoneyTotal(int phoneSold, int phonePerCost) // Money made from phone sales
    {
        int totalPhone;
        totalPhone = phoneSold * phonePerCost;
        return totalPhone;
    }

    public  static int venueMoneyTotal(int venueSold, int venuePerCost) //Money made from Venue
    {
        int totalVenue;
        totalVenue = venueSold * venuePerCost;
        return totalVenue;
    }

    public static double percentCapacity(int venueSold, int phoneSold, int capacity) //finding the percent of the place that is filled
    {
        double percentUsage;
        percentUsage = (double) (venueSold + phoneSold) / capacity; //total sold divided by capacity
        return percentUsage;
    }

    public static int ticketsLeft(int venueSold, int phoneSold, int capacity) //Tickets not sold
    {
        int ticketLeft;
        ticketLeft = capacity - (venueSold + phoneSold); // Capacity - total Sold
        return  ticketLeft;
    }

    public static double phoneSalesPercent( int phoneSold, int capacity) //what percent of sales were phone?
    {
        double phoneSalesPercent;
        phoneSalesPercent = (double) phoneSold / capacity; //finding percent sold that is phone sold.
        return phoneSalesPercent;
    }

    public static double venueSalesPercent(int venueSold, int capacity) //what percent of sales were at the venue
    {
        double venueSalesPercent;
        venueSalesPercent = (double) venueSold / capacity; //finding percent sold that is venue sold
        return venueSalesPercent;
    }

    public static int lostRevenue(int venueSales, int phoneSales, int capacity, int venuePerCost, int phonePerCost) //finding the lost revenue
    {
        int finalLost = 0;
        if (venuePerCost > phonePerCost) //if the venue cost is greater than phone cost
        {
            finalLost = phonePerCost * (capacity - (phoneSales + venueSales)); // find the tickets not sold and then * phone cost
        }
        else if (phonePerCost > venuePerCost) //if phone cost is greater than venue cost
        {
            finalLost = venuePerCost * (capacity - (phoneSales + venueSales)); // find the tickets not sold and then * venue cost
        }
        else // if equal
        {
            System.out.println("The price per ticket is the same");
            finalLost = venuePerCost * (capacity - (phoneSales + venueSales)); //find tickets not sold and then just multiply because both ticket values are the same.
        }
        return finalLost;
    }
/* Sample Output:

What is the capacity of the venue? 2000
What is the price per ticket sold by phone? $18
What is the number of phone sales? 600
What is the price per ticket sold at the venue? $25
What is the number of venue ticket sales? 250
What is the number to tickets to sell? 1000

 Total Tickets Sold: 850
Tickets left:1150
Phone Sales vs. Venue Sales: 0.3 vs. 0.125
Percent capacity usage is 0.425 or 42.5
Phone Sales: $10800
Venue Sales: $6250
Total Sales: $17050
Lost revenue based on the lowest price ticket: $20700

 */
}
