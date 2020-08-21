package implementation;
/*	You are given the binary representation of a number. You must consider the highest number of set bits in the binary representation to complete your task. For example, 23  is represented as 10111  in binary and it contains four set bits (1-bits). You are also given a number  and your task is to determine the number N that is less than or equal to N  and contains the maximum number of set bits in its binary representation. 
	In other words, print a number  that is less than or equal to  such that the number of set bits in he binary representation of  must be maximum
	Input format
	First line: An integer T  denoting the number of test cases
	For each test case:
	First line: An integer  N
	Output format
	For each test case t, print the answer on a new line denoting a number K  that is less than or equal to  such that the number of set bits in the binary representation of K  must be maximum.  
	SAMPLE INPUT 
	1
	345
	SAMPLE OUTPUT 
	255
	Explanation
	The number 255 (< 345) has most number of set bits.
*/
import java.util.Scanner;
public class Set_numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++) {
			int n=scan.nextInt();
			dectobin(n);
		}
	}
	static void dectobin(int n) {
		String s="";
		int a=n;
		while(a>0) {
			int rem=a%2;
			s=rem+s;
			a=a/2;
		}
		//System.out.println(s);
		int countofdig=s.length();
		form(s.length(),n);
	}
	static void form(int len,int n) {
		String num="";
		for(int i=1;i<=len;i++) {
		num=num+'1';}
		//System.out.println("num is "+num+"n is"+n);
		
		int finalnum=bintodec(num);
		//System.out.print("final dec is "+finalnum);
		
		if(finalnum>n)
			form(len-1,n);
		else {
			System.out.println(finalnum);
			return;
			}
	}
	
	 static int bintodec(String num) {
		 int dec=0;
		for(int i=0;i<num.length();i++)
			dec=Integer.parseInt(num,2);
		return dec;
	}

}
