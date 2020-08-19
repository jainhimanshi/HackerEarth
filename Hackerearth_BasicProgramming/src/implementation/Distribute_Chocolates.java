package implementation;
/*You have  number of chocolates that you want to distribute between your  students. The intelligence level of the students is not the same, therefore, you decide to distribute the chocolates in such a way that a smarter student gets strictly more chocolates than the ones who are less smarter.
The difference between the chocolates received by any two adjacent students must be exactly one. Formally, if the least intelligent student gets  chocolates, then others must get . At the same time, your task is to minimize the number of chocolates that are left (if any) after distributing those among students. Determine the minimum number of chocolates left.
Note
It is mandatory to give chocolates to everyone if it is possible to do so. In other words, it is not possible that some students are getting chocolates and others are not.
Input format
First line: T denoting the number of test cases  
For each test case (next  lines):
First line: Two space-separated integers  and 
Output format 
For each test case, print the minimum number of chocolates left in a new line.*/
/*SAMPLE INPUT 
2
20 3
13 5
SAMPLE OUTPUT 
2
13
Explanation
In the first test case the 3 sutdents will get 5, 6, 7 chocolates. This will make the total count to 18. Thus 20 - 18 = 2 chocolates remain.
In the second test case, there is no valid way to distribute the chocolates. So all the chocolates remain.*/
import java.util.Scanner;
public class Distribute_Chocolates {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	long t=scan.nextLong();
	for(int i=1;i<=t;i++) {
		long c=scan.nextLong();
		long n=scan.nextLong();
		long res=dist(c,n);
		System.out.println(res);
	}
	}
	
	static long dist(long c,long n) {
		if(c==n)
			return c;
		else {
		long minreq=(n*(n+1))/2;
		if(c<minreq)
			return c;
		else {
			return((c-minreq)%n);
			}
		}
	}
}
