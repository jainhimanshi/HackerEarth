package implementation;
/*
Gary likes to solve problems of array, but he doesn't like problems that involve queries. His school teacher gave him an assignment full of problems but one of them involve queries. Can you help Gary in solving that problem so that he can go and play with his friends? The problem is :
Given an Array A consisting of N positive integers, you have to answer Q queries on it. Queries can be of the two types: * 1 X Y - Update X at location Y in the array. * 2 L R - Print the sum of range [L, R], i.e. Both L and R are inclusive. 
Input:
    The first line contains two space separated integers N(Length of Array) and Q(Queries).
    Next Line contains N space separated integers denoting array A.
    Next Q Line contains 3 space separated integers for each line, as described above
Output: Answer to the each query of type 2 in a new line, only when range is valid, otherwise ouput `-1`
SAMPLE INPUT 
5 5
2 3 4 8 9
1 0 3
2 0 1
2 0 4
1 2 5
2 0 3
SAMPLE OUTPUT 
6
27
19
Explanation
After First query:
   Array becomes 3 3 4 8 9
After Second query:
    Sum of range [0, 1] i.e. A[0]+A[1] is 6
After Third query
    Sum of range [0, 4] is 27
After Fourth query:
    Array becomes 3 3 5 8 9
After Fifth query :Sum of range [0, 3] is 19
 * */
import java.util.Scanner;
public class Array_Insert {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		int q=scan.nextInt();
		
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		
		for(int i=1;i<=q;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			arr=calc(a,b,c,arr);
		}
	}
	static int[] calc(int a,int b,int c,int[] arr) {
		if(a==1) {
			arr[b]=c;
			return arr;
		}
		else if(a==2){
			int sum=0;
			for(int i=b;i<=c;i++) {
				if((i>=arr.length)||i<0) {
					System.out.print(-1);
					return arr;}
				sum=sum+arr[i];}
			System.out.println(sum);
			return arr;
		}
		return arr;
	}
}
