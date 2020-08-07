package basics_of_IO;
/*
 *You are required to enter a word that consists
 *of  and  that denote the number of Zs and Os respectively. 
 *The input word is considered similar to word zoo if.
Determine if the entered word is similar to word zoo.
For example, words such as zzoooo and zzzoooooo are similar to word zoo 
but not the words such as zzooo and zzzooooo.
Input format
First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be .
Output format
Print Yes if the input word can be considered as the string zoo otherwise, print No.*/

/*Approach :*
 Run an array upon string,if char is z,increase z count else o count.
 check whether 2*x=y or not ?
 * */ 
import java.util.*;

public class Zoos {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		s.toLowerCase();
        check(s);
	}
	
	static void check(String s) {
		char[] arr=s.toCharArray();
		int xcount=0;
		int i=0;
		while(arr[i]!='o') {
			xcount++;
			i++;
		}
		int ycount=s.length()-xcount;
		if(2*xcount==ycount)
			System.out.print("Yes");
		else
			System.out.print("No");
	}

}
