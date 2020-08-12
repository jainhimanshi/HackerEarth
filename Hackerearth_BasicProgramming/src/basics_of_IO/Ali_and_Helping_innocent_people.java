package basics_of_IO;
/*
Arpasland has surrounded by attackers. A truck enters
 the city. The driver claims the load is food and 
 medicine from Iranians. Ali is one of the soldiers in 
 Arpasland. He doubts about the truck, maybe it's from 
 the siege. He knows that a tag is valid if the sum of 
 every two consecutive digits of it is even and its 
 letter is not a vowel. Determine if the tag of the 
 truck is valid or not.
We consider the letters "A","E","I","O","U","Y" to be
vowels for this problem.
Input Format
The first line contains a string of length 9. 
The format is "DDXDDD-DD", where D stands for a digit
(non zero) and X is an uppercase english letter.
Output Format
Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)*/

import java.util.Scanner;
public class Ali_and_Helping_innocent_people {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	check(s);
	}
	
	static void check(String str) {
		
         int a=Character.getNumericValue(str.charAt(0)); 
         int b=Character.getNumericValue(str.charAt(1)); 
         int c=Character.getNumericValue(str.charAt(3)); 
             int d=Character.getNumericValue(str.charAt(4)); 
             int e=Character.getNumericValue(str.charAt(5)); 
             int f=Character.getNumericValue(str.charAt(7)); 
             int g=Character.getNumericValue(str.charAt(8)); 
  
             if((str.charAt(2)!='A' && str.charAt(2)!='E'&&str.charAt(2)!='I' && str.charAt(2)!='O'&&str.charAt(2)!='U' &&str.charAt(2)!='Y' ) && 
                 ((a+b)%2==0 && 
                 (c+d)%2==0 && 
                 (d+e)%2==0 && 
                 (f+g)%2==0 )){ 
                System.out.println("valid"); 
             } 
             else 
                 System.out.println("invalid"); 
    } 
}
