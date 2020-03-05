/*Program Name: College Inflation
Assignment: Module 6, Lesson 6, Assignment 2
Author: Nick Case
Date: 12/2/19
Version: 1.0
Program Description: This program tracks the inflation of college prices and how much the salary offsets it
What I learned from this program: how to use a large for loop, reminder on how loops work
What difficulties did I have and how I solved them: No problems, was pretty straight forward, took a lot of planning to get started
*/

public class NickCaseMod6CollegeInflation
{
    public static void main(String [] args)
    {
        double tuition = 4000, room = 9500, shortage = 0, total = 0, tuitionFinal = 0, roomFinal = 0, costFinal = 0, salaryFinal = 0, shortageFinal = 0; //Declaring Variables
        double salary = 14000;

        System.out.println("Year \t" + "Tuition \t\t" + "Rm&Bd\t\t" + "Total Cost \t" + "Salary \t\t" + "Excess/Shortage"); //Creating Headings
        System.out.println("1\t\t" + "4000.00\t\t\t" + "9500.00\t\t" + "13500.00\t" + "1400.00\t\t" + "500.00"); //Printing the first year
        for (int years = 2; years <= 4 ; years++) //Doing the math for her years in college
        {
         System.out.print(years + "\t\t");

         tuition = (tuition * 1.15); //finding tuition increase
         tuitionFinal = tuitionFinal + tuition; //finding total tuition
         System.out.printf("%.2f", tuition); //printing and formatting
         System.out.print("\t\t\t");

        room = (room * 1.10); //finding room increase
        roomFinal = roomFinal + room; //finding total rooming fees
        System.out.printf("%.2f",room); //printing and formatting
        System.out.print("\t");

        total = tuition + room; //finding total
        costFinal = costFinal + total; // finding overall total cost
        System.out.printf("%.2f", total); //printing and formatting
        System.out.print("\t");

        salary = salary * 1.04; //finding salary increase
        salaryFinal = salaryFinal + salary; //finding total salary increase
        System.out.printf("%.2f", salary); //printing and formatting
        System.out.print("\t");

        shortage = salary - total; //finding the shortage or excess
        shortageFinal = shortageFinal + shortage; //getting the overall shortage or excess
        System.out.printf("%.2f", shortage); //printing and formatting

        System.out.println(); //starting a new row each year

        }

        System.out.printf("Total\t" + tuitionFinal + "\t\t\t" + roomFinal + "\t\t" + costFinal + "\t\t" + salaryFinal + "\t" + "%.2f",shortageFinal); //Printing out the final, overall totals with formatting

    }
}

/* Sample Output:

Year 	Tuition 		Rm&Bd		Total Cost 	Salary 		Excess/Shortage
1		4000.00			9500.00		13500.00	1400.00		500.00
2		4600.00			10450.00	15050.00	14560.00	-490.00
3		5290.00			11495.00	16785.00	15142.40	-1642.60
4		6083.50			12644.50	18728.00	15748.10	-2979.90
Total	15973.5			34589.5		50563.0		45450.496	-5112.50

 */
