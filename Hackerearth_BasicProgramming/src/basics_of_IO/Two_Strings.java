package basics_of_IO;
/*Given two strings of equal length, you have to tell whether they both strings are identical.
Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.
Input :
First line, contains an intger 'T' denoting no. of test cases.
Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
Output:
For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.*/

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Two_Strings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=1;i<=t;i++) {
		String s1=scan.next();
		String s2=scan.next();
		boolean res=check(s1.toCharArray(),s2.toCharArray());
		if(res==true)
			System.out.println("YES");
		else
			System.out.println("NO");
		}	
	}
	
	static boolean check(char[] arr1,char[] arr2) {
		int count=0;
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				count=map.get(arr1[i]);
				map.put(arr1[i],count+1);}
			else
				map.put(arr1[i],1);
			}
		
			for(int i=0;i<arr2.length;i++) {
				if(map.containsKey(arr2[i])) {
					count=map.get(arr2[i]);
				   map.put(arr2[i],count-1);}
				else
					return false;
			}
			
			for(Entry<Character,Integer>entry:map.entrySet()) {
				if(entry.getValue()!=0)
					return false;
			}
			return true;
	}
}
