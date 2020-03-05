/*Program Name: Turn on the Lights!
Assignment: Module 4, Lesson 3, Assignment 1
Author: Nick Case
Date: 9/27/19
Version: 1.0
Program Description: This program calculates the price of an electric bill showing all the individual parts along with the final and the amount you have to pay if it is late.
What I learned from this program: how to use fmt.format(), how to use Double.parseDouble(), importing Java packages, more practice with escape sequences, more practice with Scanner class
What difficulties did I have and how I solved them: When I put 997 in as the input, I got an error saying that it was too large for the program to handle so I looked back over my program and realized that I had set the price to 4.25 per KWH instead of 0.0425. Once I corrected that number in the constant, it worked.
I wanted to use NumberFormat to round, but I forgot the syntax so I went back to the video in the notes and saw there the rights syntax and then I put into my program.
*/
import java.io.*; //Importing Nessecary packages for Scanner and NumberFormat
import java.util.*;
import java.text.*;
public class NickCaseMod4Lights
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in); //Creating Scanner object
        
        final double energyPerHour = 0.0425; //Declaring Constants
        final double surchargeCost = 0.1;
        final double cityTaxCost = 0.03;
        final double lateFeeCostAndFinal = 1.04;
        
        NumberFormat fmt = NumberFormat.getNumberInstance(); //Setting fmt.format up to rournd to 2 decimal places
        fmt.setMaximumFractionDigits(2);
        fmt.setMinimumFractionDigits(2);
        
        System.out.print ("Enter KWH used: ");
        int energyUsed = inputScanner.nextInt(); //Getting input
        
        double baseCharge = energyUsed * energyPerHour; //Finding the Base Charge and then rounding
        String baseChargeString = fmt.format(baseCharge);
        double baseChargeFinal = Double.parseDouble(baseChargeString);
        
        double surcharge = baseCharge * surchargeCost; //Finding the Surcharge and then rounding
        String surchargeString = fmt.format(surcharge);
        double surchargeFinal = Double.parseDouble(surchargeString);
        
        double cityTax = baseCharge  * cityTaxCost; //Finding the City Tax and then rounding
        String cityTaxString = fmt.format(cityTax);
        double cityTaxFinal = Double.parseDouble(cityTaxString);
        
        double finalCost = baseChargeFinal + surchargeFinal + cityTaxFinal; //Finding the final total and the rounding
        String roundedPrice = fmt.format(finalCost);
        double finalRoundedPrice = Double.parseDouble(roundedPrice);
        
        double lateTotal = (finalRoundedPrice) * lateFeeCostAndFinal; //Finding the late final cost and rounding
        String lateTotalString = fmt.format(lateTotal);
        double lateTotalFinal = Double.parseDouble(lateTotalString);
        
        System.out.println ("\n\t\t APCS Electric");
        System.out.println ("---------------------------------------------------");
        System.out.println ("Kilowatts Used \t " + energyUsed + " @ " + "$ " + energyPerHour); //Printing out how much used and price per KWH
        System.out.println ("---------------------------------------------------");
        System.out.println ("Base Charge \t\t" + "$ " + baseChargeFinal); //Print Base Charge
        System.out.println ("Surcharge \t\t" + "$ " + surchargeFinal); //Print Surcharge
        System.out.println ("Citytax \t\t" + "$ " + cityTaxFinal + "\n\t\t\t" + "-------"); //Print Citytax
        System.out.println ("Pay this amount \t" + "$ " + finalRoundedPrice); //Print Final
        System.out.printf ("\n After May 20th Pay \t" +"$ %.2f" ,   lateTotalFinal); //Print Late
        
    }
}
/*
Enter KWH used: 997

		 APCS Electric
---------------------------------------------------
Kilowatts Used 	 997 @ $ 0.0425
---------------------------------------------------
Base Charge 		$ 42.37
Surcharge 		$ 4.24
Citytax 		$ 1.27
			-------
Pay this amount 	$ 47.88

 After May 20th Pay 	$ 49.80
 
 I think the math in the assignment sheet is a little off. I got a different final amount, but I have double checked my math many times.
 */
