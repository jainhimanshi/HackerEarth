package basics_of_IO;
/*
 Goki recently had a breakup, so he wants to have some more friends in his life. Goki has N people who he can be friends with, so he decides to choose among them according to their skills set Yi(1<=i<=n). He wants atleast X skills in his friends.
Help Goki find his friends.

 INPUT
First line of the input contains an integer N denoting the number of people.

Next line contains a single integer X - denoting the minimum skill required to be Goki's friend. 

Next n lines contain one integer Y - denoting the skill of ith person.

OUTPUT
For each person print if he can be friend with Goki. 'YES' (without quotes) if he can be friends with Goki else 'NO' (without quotes).*/
import java.util.Scanner;
public class Goki_and_breakup {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int x=scan.nextInt();
	for(int i=1;i<=n;i++) {
		int y=scan.nextInt();
		check(y,x);
	}
	}
	static void check(int y,int x) {
		if(y>=x)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
