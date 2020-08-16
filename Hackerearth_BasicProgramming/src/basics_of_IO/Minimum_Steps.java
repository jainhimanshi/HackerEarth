package basics_of_IO;

/*There are three integers k,m,n. You have to convert the number k to m by performing the given operations:
Multiply k by n
 Decrease k by 2.
 Decrease k by 1.
You have to perform the above operations to convert the integer from k to m and find the minimum steps.
Note: You can perform the operations in any order.
Input : -
First-line contains the number of test cases T.
The next T line contains three space-separated integers k, m, and n.
Output : -
Print minimum no. of steps as output in a new line for each test case.
*/
import java.util.Scanner;
public class Minimum_Steps {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=1;i<=t;i++) {
			long k=scan.nextInt();
			long m=scan.nextInt();
			long n=scan.nextInt();
			check(k,m,n);
		}
	}
		static void check(long k,long m,long n) {
			long count=0;
			if(k>m) {
				while(k!=m) {
					if(k%2==0) {
						k=k-2;
						count++;}
					else {
						k=k-1;
						count++;}
				}
			}
			else if(k<m) {
				while(k!=m) {
					while(k<m) {
						k=k*n;
						count++;}
					if(k%2==0) {
						k=k-2;
						count++;}
					else {
						k=k-1;
						count++;}
				}
			}
			System.out.println(count);
		}
}