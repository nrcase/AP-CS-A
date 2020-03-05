/*Program Name: Counting Numbers
Assignment: Module 5, Lesson 10, Assignment 1
Author: Nick Case
Date: 10/22/19
Version: 1.0
Program Description: This program reads integers from a text file, displays them all and counts how many are in total, how many are above or equal to 500 and how many are below 500 and then displays those results.
What I learned from this program: how to read a file, how to create a counter, how to use a while statement, how to use if else with inequalities
What difficulties did I have and how I solved them: I was having trouble getting the file to be read so I went back to the lesson where we learned that and looked over the notes and then put the correct syntax in and then it worked.
*/

import java.io.*;
import java.util.*;

public class NickCaseMod5CountingNumbers
{
    public static void main(String [] args) throws IOException
    {
        File file = new File("/Users/nickcase/Desktop/TextText.txt"); //Creating File Object
        Scanner sc = new Scanner(file); //Creating Scanner to read file
        int number, greaterAndEqual = 0, lessThan = 0, allNumbers = 0; //Declaring variables

        while (sc.hasNextInt()) //while the file has integers
        {
            System.out.println(sc.nextInt()); //print each of the integers

            number = sc.nextInt(); //assign number to the number grabbed from the file

            if (number < 500) //If number is less than 500
            {
                lessThan ++; //add one to less than counter
                allNumbers ++; //add one to all number counter
            }
            else //If not
            {
                greaterAndEqual ++; //add one to the greater than or equal to counter
                allNumbers ++; //add one to all number counter
            }
        }
        System.out.println("\n The number of numbers less than 500 is " + lessThan); //Print less than counter
        System.out.println("The number of numbers greater than or equal to 500 is " + greaterAndEqual); //Print greater than and equal to counter
        System.out.println("The total number of numbers is " + allNumbers); //Print all number counter
    }
}

/* Sample Output:

388
868
239
687
426
854
37
957
734
133
953
374
159
228
513
477
333
846
654
615
740
580
631
666
931
242
220
669
75
63
476
625
482
968
85
707
692
278
230
596
253
268
144
869
436
575
833
449
868
820
783
717
606
278
881
216
399
107
857
462
368
813
386
584
544
664
763
684
938
186
962
780
560
133
64
487
550
999
49
879
578
554
790
34
880
975
460
349
485
620
379
366
513
321
235
582
740
738
238
274
689
945
796
717
66
772
971
511
826
326
835
730
51
536
156
511
399
353
654
919
841
109
927
950
79
518
121
17
751
263
910
564
113
203
339
707
362
436
79
57
209
755
252
617
217
999
165
858
33
778
684
183
529
311
398
330
511
251
306
687
752
920
858
729
45
329
319
921
572
418
116
831
571
203
225
461
666
672
446
394
446
717
1
350
55
392
523
502
129
204
222
13
451
585
642
763
581
717
245
588
736
526
785
393
585
574
229
537
519
799
837
861
164
316
95
678
165
405
802
424
145
456
604
416
877
60
399
934
269
534
155
271
203
323
407
795
125
707
827
583
396
930
490
669
555
798
690
90
981
235

 The number of numbers less than 500 is 143
The number of numbers greater than or equal to 500 is 107
The total number of numbers is 250

 */
