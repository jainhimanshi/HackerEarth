package basics_of_IO;
/*
 You have been given a positive integer N. 
 You need to find and print the Factorial of this number. 
 The Factorial of a positive integer N refers to the product
 of all number in the range from 1 to N. You can read more 
 about the factorial of a number here.

Input Format:
The first and only line of the input contains a single 
integer N denoting the number whose factorial you need to 
find.
Output Format
Output a single line denoting the factorial of the number N.
 * */
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int result=factorial(n);
		System.out.println(result);
	}
	static int factorial(int n) {
		if(n==1||n==0)
			return 1;
		else {
			return n*factorial(n-1);
		}
	}

}
