package basics_of_IO;
/*
Patlu and Motu works in a building construction,they have to
put some number of bricks N from one place to another, 
and started doing their work. They decided , they end up
 with a fun challenge who will put the last brick.
They to follow a simple rule, In the i'th round, 
Patlu puts i bricks whereas Motu puts ix2 bricks.
There are only N bricks, you need to help find the 
challenge result to find who put the last brick.
Input:
First line contains an integer N.
Output:
Output "Patlu" (without the quotes) if Patlu puts the last
bricks ,"Motu"(without the quotes) otherwise.*/

import java.util.*;
public class Bricks_Game {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		check(N);
	}
	static void check(int N) {
		int i=1;
		while(N>0) {
		int patlu=i;
		N=N-patlu;
		if(N<=0) {
			System.out.println("Patlu");
		    return;}
		int motu=2*i;
		N=N-motu;
		i++;
		if(N<=0) {
			System.out.println("Motu");
		    return;}
	}
	}
}

