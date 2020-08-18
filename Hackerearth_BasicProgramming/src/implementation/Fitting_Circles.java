package implementation;
/*
You are given a rectangle of length  and width a and b. You are required to determine a circle that contains the maximum circumference that fits inside the rectangle. This type of circle is called a big circle. Your task is to determine the maximum number of big circles that can fit inside the rectangle.
Input format
First line: An integer  denoting the number of test cases
First line of each test case: Integers  and 
Output format
For each test case, print the answer on a new line denoting the maximum number of big circles that can fit in the provided rectangle.  
*/
import java.util.Scanner;

public class Fitting_Circles {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=1;i<=t;i++) {
		int a=scan.nextInt();
		int b=scan.nextInt();
		number(a,b);}
	}
	static void number(int a,int b) {
		int r,longer;
		if(a>b) {
			longer=a;
			r=b;}
		else {
			longer=b;
			r=a;}
		
		int n=longer/r;
		System.out.println(n);
	}
}
