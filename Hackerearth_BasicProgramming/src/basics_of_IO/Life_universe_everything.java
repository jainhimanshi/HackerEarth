package basics_of_IO;
/*
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.*/

import java.util.Scanner;
public class Life_universe_everything {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(1==1) {
			int i=scan.nextInt();
			if(i!=42) {
			System.out.println(i);
			continue;
			}
			else
				return;
		}
	}
}
