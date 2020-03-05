/*Program Name: Space Conversion
Assignment: Module 10, Lesson 4, Assignment 1
Author: Nick Case
Date: 2/13/20
Version: 1.0
Program Description: This program takes your weight and then converts it to your weight on another planet using methods and arrays
What I learned from this program: how to use arrays in methods
What difficulties did I have and how I solved them: I kept getting an error when putting my main array inside of the method, then I remembered that you don't need the brackets, just the name as a parameter within the method. 
*/

import java.util.Scanner;

public class NickCaseMod10Space
{
    public static void main(String [] args)
    {
        double[] planetConversion = new double[8]; //Creating array to hold conversions
        Scanner userInput = new Scanner(System.in); //Creating Scanner
        double finalWeight;
        int choice = 0;

        planetConversion[0] = .38; //Setting the conversion rates for all the planets into the array
        planetConversion[1] = .91;
        planetConversion[2] = .38;
        planetConversion[3] = 2.36;
        planetConversion[4] = .91;
        planetConversion[5] = 1.12;
        planetConversion[6] = .89;
        planetConversion[7] = .06;

        while (choice != 9) //Do while the user does not choose to exit
        {
             // Printing the Menu
            System.out.println("\nConvert your weight on earth to: ");
            System.out.println("1. \t\t Mercury");
            System.out.println("2. \t\t Venus");
            System.out.println("3. \t\t Uranus");
            System.out.println("4. \t\t Mars");
            System.out.println("5. \t\t Jupiter");
            System.out.println("6. \t\t Saturn");
            System.out.println("7. \t\t Neptune");
            System.out.println("8. \t\t Pluto");
            System.out.println("9. \t\t Quit");

            System.out.print("Select a destination by number (or 9 to quit): "); //Getting user Input
            choice = userInput.nextInt();

            if (choice == 1) //if choice is (number selected corresponds with the menu above)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.mercuryWeight(planetConversion, weight);  //convert weight
                System.out.printf("Your weight on Mercury would be %.2f pounds ", finalWeight); //Print final weight
                System.out.println("");

            }
            else if (choice == 2)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.venusWeight(planetConversion, weight); //convert weight
                System.out.printf("Your weight on Venus would be %.1f pounds ", finalWeight); //Print final weight
                System.out.println("");
            }
            else if (choice == 3)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.uranusWeight(planetConversion, weight); //convert weight
                System.out.printf("Your weight on Uranus would be %.1f pounds", finalWeight); //Print final weight
                System.out.println("");
            }
            else if (choice == 4)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.marsWeight(planetConversion, weight); //convert weight
                System.out.printf("Your weight on Mars would be %.1f pounds", finalWeight); //Print final weight
                System.out.println("");
            }
            else if (choice == 5)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.jupiterWeight(planetConversion, weight); //convert weight
                System.out.printf("Your weight on Jupiter would be %.1f pounds", finalWeight); //Print final weight
                System.out.println("");
            }
            else if (choice == 6)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.saturnWeight(planetConversion, weight); //convert weight
                System.out.printf("Your weight on Saturn would be %.1f pounds", finalWeight); //Print final weight
                System.out.println("");
            }
            else if (choice == 7)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.neptuneWeight(planetConversion, weight); //convert weight
                System.out.printf("Your weight on Neptune would be %.1f pounds", finalWeight); //Print final weight
                System.out.println("");
            }
            else if (choice == 8)
            {
                System.out.print("Enter your weight: ");
                int weight = userInput.nextInt(); //Get weight

                finalWeight = Weight.plutoWeight(planetConversion, weight); //convert weight
                System.out.printf("Your weight on Pluto would be %.1f pounds", finalWeight); //Print final weight
                System.out.println("");
            }
            else if (choice == 9) //Selecting exit
            {
                System.out.print("Exiting");
                System.exit(1); //Exiting
            }
            else //Invalid answer, sends you back to try again
            {
                System.out.println("Error--Invalid Destination \n");
            }
        }
    }
}
/* Sample Output:

Convert your weight on earth to:
1. 		 Mercury
2. 		 Venus
3. 		 Uranus
4. 		 Mars
5. 		 Jupiter
6. 		 Saturn
7. 		 Neptune
8. 		 Pluto
9. 		 Quit
Select a destination by number (or 9 to quit): 7
Enter your weight: 160
Your weight on Neptune would be 179.2 pounds

Convert your weight on earth to:
1. 		 Mercury
2. 		 Venus
3. 		 Uranus
4. 		 Mars
5. 		 Jupiter
6. 		 Saturn
7. 		 Neptune
8. 		 Pluto
9. 		 Quit
Select a destination by number (or 9 to quit): 11
Error--Invalid Destination


Convert your weight on earth to:
1. 		 Mercury
2. 		 Venus
3. 		 Uranus
4. 		 Mars
5. 		 Jupiter
6. 		 Saturn
7. 		 Neptune
8. 		 Pluto
9. 		 Quit
Select a destination by number (or 9 to quit): 3
Enter your weight: 12
Your weight on Uranus would be 10.7 pounds

Convert your weight on earth to:
1. 		 Mercury
2. 		 Venus
3. 		 Uranus
4. 		 Mars
5. 		 Jupiter
6. 		 Saturn
7. 		 Neptune
8. 		 Pluto
9. 		 Quit
Select a destination by number (or 9 to quit): 4
Enter your weight: 180
Your weight on Mars would be 68.4 pounds

Convert your weight on earth to:
1. 		 Mercury
2. 		 Venus
3. 		 Uranus
4. 		 Mars
5. 		 Jupiter
6. 		 Saturn
7. 		 Neptune
8. 		 Pluto
9. 		 Quit
Select a destination by number (or 9 to quit): 5
Enter your weight: 98765432
Your weight on Jupiter would be 233086419.5 pounds

Convert your weight on earth to:
1. 		 Mercury
2. 		 Venus
3. 		 Uranus
4. 		 Mars
5. 		 Jupiter
6. 		 Saturn
7. 		 Neptune
8. 		 Pluto
9. 		 Quit
Select a destination by number (or 9 to quit): 9
Exiting


 */
