package basics_of_IO;
/*Sussutu is a world-renowned magician. And recently, 
he was blessed with the power to remove EXACTLY ONE element 
from an array.
Given, an array A (index starting from 0) with N elements.
Now, Sussutu CAN remove only that element which makes
 the sum of ALL the remaining elements exactly divisible 
 by 7.Throughout his life, Sussutu was so busy with magic 
 that he could never get along with maths. Your task is to 
 help Sussutu find the first array index of the smallest 
 element he CAN remove.
Input:
The first line contains a single integer N.
Next line contains N space separated integers Ak,0 < k < N.
Output:
Print a single line containing one integer, the first array index of the smallest element he CAN remove, and -1 if there is no such element that he can remove!*/

import java.util.Scanner;
public class Its_Magic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) 
			arr[i]=scan.nextInt();
		int ans=magic(arr);
		if(ans==-1)
			System.out.print(-1);
		else
			System.out.print(ans);
	}
	static int magic(int [] arr) {
		long sum=0;
		int res=-1;
		int resindex=-1;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		for(int i=0;i<arr.length;i++) {
			int arrint=arr[i];
			if((sum-arr[i])%7==0) {
				if(res==-1) {
				res=arr[i];
				resindex=i;
				}
				else {
					if(arr[i]<res) {
						res=arr[i];
						resindex=i;
					}
				}
			}
		}
		return resindex;
	}
}
