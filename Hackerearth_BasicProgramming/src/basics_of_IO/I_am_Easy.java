package basics_of_IO;
/*
 This is an easy problem. 
All you need to do is to print the first 10 multiples of the number given in input.
Input:
An integer N, whose first 10 multiples need to be printed.
Output:
First 10 multiples of number given in input*/

import java.util.*;
public class I_am_Easy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		multiple(n);
	}
	static void multiple(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}

}
