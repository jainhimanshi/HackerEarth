package implementation;
/*Given two integers X and K, find the largest number that can be formed by changing digits at atmost K places in the number X.
Input:
First line of the input contains two integers X and K separated by a single space.
Output:
Print the largest number formed in a single line.*/
/*Approach :
1.Take integer x,k.
2.Replace first k digits in x by 9.
*/
import java.util.Arrays;
import java.util.Scanner;
public class Digit_Problem {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	int k=scan.nextInt();
	//for(int i=0;i<s.length();i++)
	//System.out.println(s.charAt(i));
	number(s.toCharArray(),k);
	}
	
	static void number(char[] arr,int k) {
		if(k==0)
			System.out.println(arr);
		else {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='9') {
				arr[i]='9';
				k--;
			}
			if(k==0) {
			System.out.println(arr);
				return;}
			}	
		}
	}
}
