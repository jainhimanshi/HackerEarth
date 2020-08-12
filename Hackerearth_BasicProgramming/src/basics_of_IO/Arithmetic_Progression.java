package basics_of_IO;
/*
You will be given three numbers A,B,C .You can perform 
the following operation on these numbers any number of 
times.You can take any integer from A, B, C and you can 
add or substract 1 from it.
Each operation cost 1sec of time(say). Now you have to
determine the minimum time required to change those
numbers into an Arithmetic Progression. 
i.e B-A=C-B
Input :
First line input contains T denoting number of test cases.
Next T lines contains space seperated integers A,B,C
Output :
For each test case, print a single line containing one integer — the minimum time require to change A,B,C into an arithmetic progression.*/

import java.util.Scanner;
import java.lang.*;
public class Arithmetic_Progression {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=1;i<=T;i++) {
			long a=scan.nextInt();
			long  b=scan.nextInt();
			long  c=scan.nextInt();
			series(a,b,c);
			}
	}
	static void series(long a,long  b,long c) {
	    long count=0;
		long x=(a+c-(2*b))/2;
		b=b+x;
		count=count+Math.abs(x);
		
		long y=(2*b)-a-c;
		a=a+y;
		count=count+Math.abs(y);
		
		long z=(2*b)-a-c;
		c=c+z;
		count=count+Math.abs(z);
	
		System.out.println(count);
}
}
