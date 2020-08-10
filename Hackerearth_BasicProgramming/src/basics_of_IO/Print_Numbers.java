package basics_of_IO;
/*Given N numbers in the input. Print these numbers in the same order as they come in input.
Input:
First line contains integer N - denoting total count of numbers that are to be printed.
Second line contains N space separated integers.
Output:
Print the numbers in input.*/

import java.util.*;
public class Print_Numbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
