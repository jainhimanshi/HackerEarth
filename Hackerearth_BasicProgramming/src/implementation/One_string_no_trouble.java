package implementation;
/*
	A string  is called a good string if and only if two consecutive letters are not the same. For example, abcab  and cda   are good while abaa  and accba are not.
	You are given a string s . Among all the good substrings of s ,print the size of the longest one.
	Input format
	A single line that contains a string  ().
	Output format
	Print an integer that denotes the size of the longest good substring of s.
	SAMPLE INPUT 
	ab
	SAMPLE OUTPUT 
	2
	Explanation
The complete string is good so the answer is 2 .*/

import java.util.Scanner;
public class One_string_no_trouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		check(s);
	}
	
	static  void check(String s) {
		int count=0;
		int max=0;
		for(int i=1;i<s.length();i++){
		char ch =s.charAt(i-1);
		char ch1=s.charAt(i);
		if(ch!=ch1){
			count++;
			if(max<count)
				max=count;
			}
		else
			count=0;
		}
		System.out.println(max+1);	
	}
}
