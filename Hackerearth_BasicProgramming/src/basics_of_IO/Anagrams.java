package basics_of_IO;
/*
 Given two strings, a and b , that may or may not be of the same length, 
 determine the minimum number of character deletions required to make a 
 and b anagrams.Any characters can be deleted from either of the strings.
 Input=a,b strings
 Output=count of char required to make them anagram.
 */

/*Approach : 
1.Take a new int array.
2.Now,traverse first string and make 1 in array for all char.
3.Now ,traverse s2 string and and make 0 in array for all char.
4.Now sum up the array.
You will only get sum of char that needs to be deleted.
*/

import java.util.*;
public class Anagrams {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	for(int i=0;i<t;i++) {
	String a=scan.next();
	a.toLowerCase();
	String b=scan.next();
	b.toLowerCase();
	check(a,b);}
	}
	
	static void check(String a,String b) {
		int[] arr=new int[256]; 
	       int count=0; 
	       for(char c:a.toCharArray()){ 
	           int index=(int) c; 
	           arr[index]++; 
	       } 
	       for(char c:b.toCharArray()){ 
	           int index=(int) c; 
	           arr[index]--; 
	       } 
	       for(int i=0;i<256;i++){ 
	           count=count+Math.abs(arr[i]); 
	       } 
	       System.out.println(count); 
	}

}
