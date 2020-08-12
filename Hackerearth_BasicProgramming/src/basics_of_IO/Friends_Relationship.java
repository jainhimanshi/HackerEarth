package basics_of_IO;
/*
 Jack is your friend and Sophia is his girlfriend. But due
 to some unknown reason ( unknown for us, they know it) 
 Sophia started hating to Jack. Now, Jack is in big trouble
 but he has a solution, He knows that if he will gift T 
 patterns of a particular type ( For pattern observation 
 see the sample test cases) then Sophia will start loving 
 again to Jack. But Jack is depressed now and need your 
 help to gift her that type patterns of '*' and '#' of N 
 lines. So, it's your responsibility to save your friend's
 relationship.
 Input :
First Line contains T i.e. number of test case.
Each of the next T lines contain an integer N.
Output:
For each test case print the pattern of N lines then 
after a blank line.
Example : SAMPLE INPUT 
1
2
SAMPLE OUTPUT 
*##*
****
*/
import java.util.*;
public class Friends_Relationship {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=1;i<=T;i++) {
			int N=scan.nextInt();
			pattern(N);
			}
	}
	static void pattern(int N) {
		int i=1;
		
		for(int n=1;n<=N;n++) {
			
			for(int j=1;j<=i;j++) 
			System.out.print("*");
			
			for(int k=1;k<=Math.abs(2*(N-i));k++)
				System.out.print("#");
			
			for(int m=1;m<=i;m++) 
				System.out.print("*");
		
			System.out.println();
			i++;
		}
	}
}
