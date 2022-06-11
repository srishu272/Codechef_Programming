/*
Age Limit
Problem Code: AGELIMIT
Contest Code: START42

Problem
Chef wants to appear in a competitive exam. To take the exam, there are following requirements:

Minimum age limit is X (i.e. Age should be greater than or equal to X).
Age should be strictly less than Y.
Chef's current Age is A. Find whether he is currently eligible to take the exam or not.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three integers X,Y, and A as mentioned in the statement.
Output Format
For each test case, output YES if Chef is eligible to give the exam, NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1≤T≤1000
20≤X<Y≤40
10≤A≤50


Sample 1:
Input
5
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28

Output
YES
NO
YES
NO
YES

Explanation:
Test case 1: The age of Chef is 30. His age satisfies the minimum age limit as 30≥21. Also, it is less than the upper limit as 30<34. Thus, Chef is eligible to take the exam.

Test case 2: The age of Chef is 31. His age satisfies the minimum age limit as 31≥25. But, it is not less than the upper limit as 31≮31. Thus, Chef is not eligible to take the exam.

Test case 3: The age of Chef is 25. His age satisfies the minimum age limit as 25≥22. Also, it is less than the upper limit as 25<29. Thus, Chef is eligible to take the exam.

Test case 4: The age of Chef is 15. His age does not satisfy the minimum age limit as 15<20. Thus, Chef is not eligible to take the exam.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AGELIMIT
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
            int A = scan.nextInt();

            if((A >= X)&&(A < Y))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
