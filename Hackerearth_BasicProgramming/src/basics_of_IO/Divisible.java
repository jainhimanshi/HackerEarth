package basics_of_IO;
/*You are given an array  of size  that contains integers. Here,  is an even number. You are required to perform the following operations:
Divide the array of numbers in two equal halves
Note: Here, two equal parts of a test case are created by dividing the array into two equal parts.
Take the first digit of the numbers that are available in the first half of the array (first 50% of the test case)
Take the last digit of the numbers that are available in the second half of the array (second 50% of the test case)
Generate a number by using the digits that have been selected in the above steps
Your task is to determine whether the newly-generated number is divisible by .
Input format
First line: A single integer  denoting the size of array 
Second line:  space-separated integers denoting the elements of array 
Output format
If the newly-generated number is divisible by , then print . Otherwise, print .*/

import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int [] arr=new int[N];
		for(int  i=0;i<N;i++) 
			arr[i]=scan.nextInt();
		int res1=checkfirst(arr,0,(arr.length-1)/2);
		//System.out.print(res1);
		int res2=checklast(arr,((arr.length-1)/2)+1,arr.length-1);
		//System.out.print(res2);
		int res=res1+res2;
		//System.out.println(res);
		if(res%11==0)
			System.out.print("OUI");
		else
			System.out.print("NON");
		
		}
	 
		static int checklast(int[] arr,int start,int end) {
			int sum=0;
			for(int i=start;i<=end;i++) {
			int n=arr[i];
			int dig=n%10;
			if(i%2!=0)
				sum=sum-dig;
			else
				sum=sum+dig;
			}
			return sum;
		}
		
		static int checkfirst(int[] arr,int start,int end) {
			int sum=0,dig=0;
			for(int i=start;i<=end;i++) {
			int n=arr[i];
			while(n>0) {
			dig=n%10;
			n=n/10;
			}
			if(i%2==0)
				sum=sum+dig;
			else
				sum=sum-dig;
			}
			return sum;
		}
	}