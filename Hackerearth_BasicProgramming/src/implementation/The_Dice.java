package implementation;
/*There are   number of girls and they rolled a dice in turns one after another.
If the number on the dice is , then the dice will be rolled again until she get a number other than .
Since you know the sequence of numbers which the dice shows when rolled each time, you have to find what is the total number of girls or if the sequence is invalid.
Input format
A single line that contains a string   denoting the sequence of numbers the dice rolls on written as string.
Output format
If the sequence is valid print the number of girls  
If the sequence is invalid print 
SAMPLE INPUT 
3662123
SAMPLE OUTPUT 
5
Explanation
The second person rolls the dice 3  times so the number of people will be 5.
*/

import java.util.Scanner;
public class The_Dice {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int res=check(s);
		System.out.print(res);
	}
	static int check(String s) {
		if(s.charAt(s.length()-1)=='6')
			return -1;
		else {
		int x=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='6') {
				x++;}
		}
			return x;
		}
	}
}
