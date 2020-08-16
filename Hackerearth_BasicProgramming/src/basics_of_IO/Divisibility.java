package basics_of_IO;
/*You are provided an array A of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by 10.
Note: View the sample explanation section for more clarification.
Input format
First line: A single integer  denoting the size of array 
Second line:  space-separated integers.
Output format
If the number is divisible by 10, then print . Otherwise, print .*/

import java.util.Scanner;
public class Divisibility {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	int [] arr=new int[N];
	for(int  i=0;i<N;i++) 
		arr[i]=scan.nextInt();
	check(arr,N);
	}

	static void check(int[] arr,int N) {
		 if(arr[N-1]%10==0) 
		       System.out.println("Yes"); 
		       else 
		       System.out.println("No"); 
	}
}
