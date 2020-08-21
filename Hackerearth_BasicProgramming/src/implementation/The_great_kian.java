package implementation;
/*The great Kian is looking for a smart prime minister. He's looking for a guy who can solve the OLP (Old Legendary Problem). OLP is an old problem (obviously) that no one was able to solve it yet (like P=NP)
	But still, you want to be the prime minister really bad. So here's the problem:
	Given the sequence a1, a2, ..., an find the three values a1 + a4 + a7 + ..., a2 + a5 + a8 + ... and a3 + a6 + a9 + ... (these summations go on while the indexes are valid).
	Input
	The first line of input contains a single integer n (1 ≤ n ≤ 105).
	The second line contains n integers a1, a2, ..., an separated by space (1 ≤ ai ≤ 109).
	Output
Print three values in one line (the answers).*/
import java.util.Scanner;
public class The_great_kian {

	public static void main(String[] args) throws StackOverflowError {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long []arr=new long[n];
		for(int i=0;i<n;i++) 
			arr[i]=scan.nextLong();
		check(arr,n);
	}
	static void check(long[] arr, int n) {
		long sum1=0;
		for(int i=0;i<n;i=i+3) {
			sum1=arr[i]+sum1;
		}
		long sum2=0;
		for(int i=1;i<n;i=i+3) {
			sum2=arr[i]+sum2;
		}
		long  sum3=0;
		for(int i=2;i<n;i=i+3) {
			sum3=arr[i]+sum3;
		}
		System.out.print(sum1+" "+sum2+" "+sum3);
	}
}
