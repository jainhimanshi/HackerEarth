package basics_of_IO;
/*3 numbers are given in input. Output the maximum of these numbers.*/

import java.util.Scanner;
public class Back_to_school {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int m=scan.nextInt();
		int n=scan.nextInt();
		max(t,n,m);
	}
	static void max(int t,int n,int m) {
		int max=t;
		if(n>t)
			max=n;
		else if (m>t)
			max=m;
		System.out.println(max);
	}
}
