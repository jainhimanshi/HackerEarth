package basics_of_IO;
/*Aditya is fond of ladders. Everyday he goes through pictures of ladders online but unfortunately today he ran out of ladder pictures online. Write a program to print “ladder with N steps”, which he can use to get his daily dose of ladder love.
INPUT:
Input contains integer N, the number of steps in the ladder
OUTPUT:
Print the ladder with the gap between two side rails being 3 spaces(“   “).
Check the sample output for format of printing the ladder.*/

import java.util.Scanner;
public class Ladderophilia {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printpattern(n);
	}
	static void printpattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2;j++) {
			System.out.print("*");
			System.out.print("   ");
			System.out.print("*");
			System.out.println();}
			System.out.print("*****");	
			System.out.println();
		}
		for(int j=1;j<=2;j++) {
			System.out.print("*");
			System.out.print("   ");
			System.out.print("*");
			System.out.println();}
	}

}
