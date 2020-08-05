package basics_of_IO;

import java.util.*;
public class Seating_arrangement {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=0;i<T;i++) {
		int n=scan.nextInt();
		check(n);}
	}
	
	static void check(int num) {
		int n=num%12;
		if(n==1)
			System.out.println(num+11+" "+"WS");
		else if(n==2)
			System.out.println(num+9+" "+"MS");
		else if(n==3)
			System.out.println(num+7+" "+"AS");
		else if(n==4)
			System.out.println(num+5+" "+"AS");
		else if(n==5)
			System.out.println(num+3+" "+"MS");
		else if(n==6)
				System.out.println(num+1+" "+"WS");
		else if(n==7)
			System.out.println(num-1+" "+"WS");
		else if(n==8)
			System.out.println(num-3+" "+"MS");
		else if(n==9)
			System.out.println(num-5+" "+"AS");
		else if(n==10)
			System.out.println(num-7+" "+"AS");
		else if(n==11)
			System.out.println(num-9+" "+"MS");
		else if(n==12||n==0)
			System.out.println(num-11+" "+"WS");
	}

}
