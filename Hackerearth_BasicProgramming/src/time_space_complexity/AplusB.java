package time_space_complexity;
/*Problem Description
Given a series of integer pairs A and B, output the sum of  A and B .
Input Format
Each line contains two integers,A and B. One input file may contain several pairs  P where 0<=P<=12.
Output Format
Output a single integer per line - The sum of A and B .*/
import java.math.BigInteger;
import java.util.Scanner;
public class AplusB {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextBigInteger().add(scan.nextBigInteger()));
		}
	}
}
