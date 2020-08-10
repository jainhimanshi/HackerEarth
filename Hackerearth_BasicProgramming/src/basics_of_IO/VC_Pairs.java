package basics_of_IO;
/*
 Max has a string S with length N. He needs to find the 
 number of indices i (1≤i≤N−11≤i≤N−1) such that the i-th 
 character of this string is a consonant and the i+1th 
 character is a vowel. However,she is busy, so she asks for 
 your help.
 Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains a single string S with length N.
Output
For each test case, print a single line containing one 
integer ― the number of occurrences of a vowel immediately
 after a consonant*/

import java.util.Scanner;
public class VC_Pairs {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int T=scan.nextInt();
	
	for(int i=0;i<T;i++) {
	int N=scan.nextInt();
	String s=scan.next();
	checkpair(s.toCharArray());}
	}
	
	static void checkpair(char[] arr){
		int count=0;
			for(int i=0;i<arr.length-1;i++) 
			{
				if(!((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u'))) {
					if((arr[i+1]=='a')||(arr[i+1]=='e')||(arr[i+1]=='i')||(arr[i+1]=='o')||(arr[i+1]=='u')) 
						count++;
			}
			}
			System.out.println(count);
	}

}
