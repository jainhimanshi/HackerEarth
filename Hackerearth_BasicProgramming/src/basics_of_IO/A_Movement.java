package basics_of_IO;
/* An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point  of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward.
Determine, what is the minimum number of steps he need to make in order to get to his friend's house.
Input
First and the only line contain the integer  which denotes the position of his friend's house.
Output
Output contains a single line denoting the minimum number of steps.
SAMPLE INPUT 
26
SAMPLE OUTPUT 
6
Explanation
For  = 26, elephant can move as 5-5-5-5-5-1
Hence he needed 6 steps to reach at position 26.*/

import java.util.Scanner;
public class A_Movement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		cal(n);
	}
	static void cal(int n) {
		int count=0;
		
		if(n>=5) {
		count=count+n/5;
		n=n%5;}
		
		if(n==1)
			count=count+1;
		if(n==2)
			count=count+1;
		if(n==3)
			count=count+1;
		if(n==4)
			count=count+1;
		
		System.out.print(count);
	}

}
