/*Program Name: For Loop
Assignment: Module 6, Lesson 2, Practice Assignment 1
Author: Nick Case
Date: 10/30/19
Version: 1.0
Program Description: This program prints out all the numbers from 100 to 0
What I learned from this program: how to use for loop
What difficulties did I have and how I solved them: I wasn't getting any output and then I realized that I put the wrong equality sign in. After I switched it, I got the output I was looking for.
*/

public class NickCaseMod6ForLoop
{
    public static void main(String [] args)
    {
        //int sum = 0; Declaring Variable
        for (int j = 100; j >= 0 ; j--) //Do below with j starting at 100 and decreasing by 1 each time the loop is run until it is less than or equal to 0
        {
            //sum = sum + j; //adding current j to the sum of all the past j values
            System.out.println(j); //print J
            //System.out.println(sum) Printing sum each time the loop runs

        }
        //System.out.println(sum); printing out the sum in the end
    }
}

/* Sample Output:

100
99
98
97
96
95
94
93
92
91
90
89
88
87
86
85
84
83
82
81
80
79
78
77
76
75
74
73
72
71
70
69
68
67
66
65
64
63
62
61
60
59
58
57
56
55
54
53
52
51
50
49
48
47
46
45
44
43
42
41
40
39
38
37
36
35
34
33
32
31
30
29
28
27
26
25
24
23
22
21
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
0

 */