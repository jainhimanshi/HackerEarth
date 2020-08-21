package implementation;
/*You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.
Input Format
The first line of the input consists of an integer . The next line contains space-separated integers contained in the array.
Output Format
Print a single value equal to the sum of the elements in the array.
Constraints
1<=N<=10 0<=a[i]<=10^10
SAMPLE INPUT 
5
1000000001 1000000002 1000000003 1000000004 1000000005
SAMPLE OUTPUT 
5000000015*/
import java.math.BigInteger;
import java.util.Scanner;
public class Array_sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		BigInteger[] arr=new BigInteger[n];
		for(int i=0;i<n;i++) 
			arr[i]=scan.nextBigInteger();
		sum(arr,n);
	}
	static void sum(BigInteger[] arr,int n) {
		BigInteger sum=BigInteger.valueOf(0);
		for(int i=0;i<n;i++) 
			sum=sum.add(arr[i]);
		System.out.print(sum);
	}

}
