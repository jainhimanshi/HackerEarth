package basics_of_IO;
/*
There are 7 floors in BH3 and only 2 lifts. Initially Lift
A is at the ground floor and Lift B at the top floor. 
Whenever someone calls the lift from N th floor, the lift 
closest to that floor comes to pick him up. If both the 
lifts are at equidistant from the N th floor, them the lift
 from the lower floor comes up.
INPUT
First line contains a integer T denoting the number of test 
cases.
Next T lines contains a single integer N denoting the floor
from which lift is called.
OUTPUT
Output T lines containing one character "A" if the first 
lift goes to N th floor or "B" for the second lift.*/

import java.util.Scanner;
public class Lift_Queries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long T=scan.nextInt();
		int [] arr=new int[7];
		 int a=0;
		int b=7;
		for(int i=0;i<T;i++) {
			int N=scan.nextInt();
			if(Math.abs(N-a)<Math.abs(N-b)) {
				System.out.println("A");
				a=N;
				}
			else if(Math.abs(N-b)<Math.abs(N-a)){
				System.out.println("B");
				b=N;
			}
			else if(Math.abs(N-a)==Math.abs(N-b))
				if(a<b) {
					System.out.println("A");
					a=N;
				}
				else {
					System.out.println("B");
					b=N;
				}			
		}
	}
}
