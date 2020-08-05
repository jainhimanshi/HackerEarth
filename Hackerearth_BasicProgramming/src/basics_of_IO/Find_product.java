package basics_of_IO;
/**
 You have been given an array A of size N consisting of
 positive integers. You need to find and print the
 product of all the number in this array Modulo .
Input Format:
The first line contains a single integer N denoting the 
size of the array. The next line contains N space separated
integers denoting the elements of the array
Output Format:
Print a single integer denoting the product of all the 
elements of the array Modulo 10^9+7 .
 * */

import java.util.*;
public class Find_product {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		long [] arr=new long[N];
		for(int i=0;i<N;i++)
			arr[i]=scan.nextInt();
        long result=findprod(arr);
        System.out.println(result);
	}

	static long findprod(long[] arr) {
		long ans=1;
		for(int i=0;i<arr.length;i++) {
		ans=(arr[i]*ans)%1000000007;
		}
		return ans;
	}
}
