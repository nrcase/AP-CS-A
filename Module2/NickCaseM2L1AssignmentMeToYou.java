
/*Program Name: "From Me to You"
Assignment: M2L1 Assignment
Author: Nick Case
Date: 9/2/19
Version: 1.0
Program Description: This program prints out a series of strings of texts. The text is an address line and a "To" line and a message.
What I learned from this program: I learned how to display outputs, to create blank lines, to document my code well, to create the skeleton for java programs from memory
What difficulties did I have and how I solved them:
I forgot to put the semicolons at the end and it wouldn't compile, but the syntax checker alerted me and I fixed it.
I had to figure how skip a line in order to get the formatting right for the output. I ended up using just a bunch of spaces being displayed to show the skipped line.
*/

public class NickCaseM2L1AssignmentMeToYou
{
    public static void main(String[] args)
    {
        System.out.println("From Bill Smith"); //Starts  Display Sender Information
        System.out.println("Address: Dell Computer, Bldg 13"); 
        System.out.println("Date: April 12,2005"); //End Display Sender Information
        System.out.println("                   "); // Blank Space to seperate
        System.out.println("To: Jack Jones"); //Display Reciever Information
        System.out.println("                   "); //Blank Space to seperate
        System.out.println("Message: Help! I'm trapped inside a computer!"); //Display Message
    } 
       
}
/* Sample Output:
 * 
" From Bill Smith
Address: Dell Computer, Bldg 13
Date: April 12,2005
                   
To: Jack Jones
                   
Message: Help! I'm trapped inside a computer!"*/