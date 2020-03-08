/*Program Name: Array Lists
Assignment: Module 11, Lesson 6, Practice Assignment 1
Author: Nick Case
Date: 3/2/20
Version: 1.0
Program Description: This program tests out ArrayLists, Iterators and ListIterators
What I learned from this program: how to use and create ArrayLists, Iterators, ListIterators
What difficulties did I have and how I solved them: N/A, just followed the video. 
*/

import java.util.*;

public class NickCaseMod11ArrayLists
{
    public static void main(String [] args)
    {
        /*ArrayList<Integer> list = new ArrayList<Integer>(); Create Array List of Integers
        list.add(23, 24); adding to ArrayList
        list.remove(23); Removing from ArrayList
        list.get(2); getting Index from ArrayList

        Iterator iterator = list.iterator(); making Iterator object
        ListIterator listIterator = list.listIterator(); making ListIterator object

        iterator.hasNext();  return boolean if iterator has next
        iterator.next(); iterator return next
        iterator.remove(); remove at next object

        listIterator.hasPrevious(); has previous data
        listIterator.add(4); add data
        listIterator.set(5); set data
        listIterator.previous();  get previous data
        */

        List lst = new ArrayList(); //create List type ArrayList
        ListIterator itr = lst.listIterator(); //Creating ListIterator for above list

        /*for (itr.next(); itr.hasPrevious(); itr.next()) loop to go through the entire ArrayList
        {
            //Something
        }*/

        ArrayList<String> aryList = new ArrayList<String>(); //Arrat list for String
        aryList.add("hello"); //adding hello
        aryList.remove("goodbye"); //adding goodbye
        //Iterator itr2 = aryList.iterator(); creating regular iterator
        //String s = (String) itr2.next(); getting next object then casting to String and then setting it to s
        Iterator<String> it2 = aryList.iterator(); //creating an iterator with a string type
        String s = it2.next(); //getting the next object with no casting and setting it to s

    }
}
/* Sample Output:


(Nothing is printing)

 */