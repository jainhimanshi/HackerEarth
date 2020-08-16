package basics_of_IO;
/*Alice got a number written in seven segment format where each segment was creatted used a matchstick.
Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.
Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks that she currently possess.Help Alice out by telling her that number.
Input Format:
First line contains T (test cases).
Next T lines contain a Number N.
Output Format:
Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to generate N.*/

import java.util.Scanner;
public class Seven_Segment_Display {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=1;i<=t;i++) {
			String s=scan.next();
			long sum=check(s);
			printMaxNumber(sum);
			System.out.println();
		}
	}
	
	static long check(String s) {
	 long sum=0;
	 for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='1')	
	 sum=sum+2;
	if(s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='5')
		 sum=sum+5;
	if(s.charAt(i)=='4')
		 sum=sum+4;
	if(s.charAt(i)=='6'||s.charAt(i)=='0'||s.charAt(i)=='9')
		 sum=sum+6;
	if(s.charAt(i)=='7')
		 sum=sum+3;
	if(s.charAt(i)=='8') 
		 sum=sum+7;
	 }
	return sum;
	}
	
	static void printMaxNumber(long n) 
	{ 
    // If n is odd 
    if (n % 2 != 0) { 
        // use 3 three segment to print 7 
        System.out.print("7"); 
        // remaining to print 1 
        for (int i = 0; i < (n - 3) / 2; i++) 
            System.out.print("1"); 
    } 
    // If n is even 
    else { 
        // print n/2 1s. 
        for (int i = 0; i < n / 2; i++) 
            System.out.print("1"); 
    	} 
	}	
}
