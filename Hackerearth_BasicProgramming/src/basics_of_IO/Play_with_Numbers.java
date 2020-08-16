package basics_of_IO;
/*
You are given an array of n numbers and q queries. For each query you have to print the floor of the expected value(mean) of the subarray from L to R.
First line contains two integers N and Q denoting number of array elements and number of queries.
Next line contains N space seperated integers denoting array elements.
Next Q lines contain two integers L and R(indices of the array).
print a single integer denoting the answer.*/

/*import java.util.Scanner;
public class Play_with_Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int Q=scan.nextInt();
		
		int [] arr=new int[N];
		
		arr[0]=scan.nextInt();
		for(int i=1;i<N;i++) {
			arr[i]=arr[i-1]+scan.nextInt();
		}
		
		for(int i=0;i<Q;i++) {
			int L=scan.nextInt();
			int R=scan.nextInt();
			cal(arr,L-1,R-1);
		}
	}
	static void cal(int[] arr,int l,int r) {
		int sum=arr[r]-arr[l];
		System.out.println((int)(Math.floor((sum)/((r-l)+1))));
	}
}*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Play_with_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 

        StringTokenizer st = new StringTokenizer(br.readLine()); 
        long n=Integer.parseInt(st.nextToken()); 
        long qry=Integer.parseInt(st.nextToken()); 
        long arr[]=new long[(int) n];
        st = new StringTokenizer(br.readLine()); 

        // read every number, adding with previous all numbers and store in the array index
        arr[0] = Integer.parseInt(st.nextToken()); 
        for (int i = 1; i <n ; i++) {
            arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j <qry ; j++) {
            long sum=0;
            double ans=0;
            st = new StringTokenizer(br.readLine()); 
            int L=Integer.parseInt(st.nextToken()); 
            int R=Integer.parseInt(st.nextToken()); 

            // check if the value 1 then don't subtract left value (as in that case there won't be any left value
            // otherwise subtract just left most value from the array
            if (L == 1) {
                sum=arr[R-1]/(R-L+1);
            } else {
                sum=(arr[R-1] - arr[L-2])/(R-L+1);
            }
            ans=Math.floor(sum);
            System.out.println((int) ans);
        }
    }
}
