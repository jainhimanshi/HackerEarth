package basics_of_IO;

/**
 * You have been given a String S. You need to find and 
 * print whether this string is a palindrome or not. 
 * If yes, print "YES" (without quotes), 
 * else print "NO" (without quotes).
Input Format
The first and only line of input contains the String S. 
The String shall consist of lowercase English alphabets only.
Output Format
Print the required answer on a single line.
*/
import java.util.*;
public class Palindromic_string {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		s.toLowerCase();
        char[] rev=checkpalindrome(s.toCharArray(),0,s.length()-1);
        //System.out.println(String.valueOf(rev));
        if(s.equals(String.valueOf(rev)))
        		System.out.println("YES");
        else
        	System.out.println("NO");
	}

	static char[] checkpalindrome(char[] arr,int start,int end) {
		if(start>=end) {
			//System.out.println(arr);
			return arr;}
		else {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			checkpalindrome(arr, start+1, end-1);
		}
		return arr;
	}
}
