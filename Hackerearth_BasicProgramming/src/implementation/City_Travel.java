package implementation;
/*You are going from City A to City B. The distance between A and B is  km. In the most days, you can go at most  km one day. But there are  exceptions, in the  th day, you can go at most  km. You need to find out the minimum number of days required to reach city  from city . 
Input Format
First line contains three integers, .
The  (i+1)th line contains two integers .
It's guaranteed any two T are different. Note that  is not sorted.
Output Format
One integer represents the answer.
SAMPLE INPUT 
21 5 2
2 4
4 8
SAMPLE OUTPUT 
4
Explanation
In the first day, you walked km 5
In the second day, you walked km 4
In the third day, you walked km 5
In the fourth day, you walked 7 km and arrived.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class City_Travel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for(int i=0; i<n; i++) {
		st = new StringTokenizer(br.readLine());
		arr1[i] = Integer.parseInt(st.nextToken());
		arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		//Bubble sort for make sure we have ascending order on the daycount
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr1[j]>arr1[j+1]) {
					int tmp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = tmp;
					tmp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = tmp;
				}}}
		
		int sum=0;
		int i=0;
		int start=0;
		while(sum<s) {
			i++;
			if(n>start&&arr1[start]==i) {
				sum=sum+arr2[start];
				start++;}
			else
				sum=sum+x;
		}
		System.out.println(i);
	}
}