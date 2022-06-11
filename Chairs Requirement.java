/*
Chairs Requirement 
Problem Code: CHAIRS_
Chef's coding class is very famous in Chefland.

This year X students joined his class and each student will require one chair to sit on. Chef already has Y chairs in his class. Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.

Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers X and Y — the number of students in the class and the number of chairs Chef already has.

Output Format
For each test case, output the minimum number of extra chairs Chef must buy so that every student gets one chair.

Constraints
1≤T≤1000
0≤X,Y≤100

Sample Input 1 
4
20 14
41 41
35 0
50 100

Sample Output 1 
6
0
35
0

Explanation
Test case 1: There are 20 students in the class and Chef has 14 chairs already. Therefore Chef must buy 6 more chairs.
Test case 2: There are 41 students in the class and Chef already has exactly 41 chairs. Therefore Chef does not need to buy any more chairs.
Test case 3: There are 35 students in the class and Chef has no chairs initially. Therefore Chef must buy 35 chairs.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHAIRS_
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while(T-- >0)
        {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            if(X>Y)
            System.out.println(X-Y);
            else 
            System.out.println("0");
        }
	}
}
