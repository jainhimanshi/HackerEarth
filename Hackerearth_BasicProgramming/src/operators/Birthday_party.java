package operators;
/*	Mr. X's birthday is in next month. This time he is planning to invite N of his friends. He wants to distribute some chocolates to all of his friends after party. He went to a shop to buy a packet of chocolates.
	At chocolate shop, each packet is having different number of chocolates. He wants to buy such a packet which contains number of chocolates, which can be distributed equally among all of his friends.
	Help Mr. X to buy such a packet.
	
	Input:
	First line contains T, number of test cases.
	Each test case contains two integers, N and M. where is N is number of friends and M is number number of chocolates in a packet.
	
	Output:
In each test case output "Yes" if he can buy that packet and "No" if he can't buy that packet.*/
import java.util.Scanner;
public class Birthday_party {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=1;i<=t;i++) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			dist(n,m);
		}
	}
	static void dist(double n,double m) {
		if(m%n==0)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
