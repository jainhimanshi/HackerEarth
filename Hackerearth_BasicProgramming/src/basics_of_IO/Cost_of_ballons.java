package basics_of_IO;
/*You are conducting a contest at your college. This contest consists of two problems and  participants. You know the problem that a candidate will solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:

Use green-colored balloons for the first problem and purple-colored balloons for the second problem
Use purple-colored balloons for the first problem and green-colored balloons for the second problem
You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.
 * */
import java.util.*;
public class Cost_of_ballons {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	int min;
	int P1,P2;
	
	for(int i=1;i<=t;i++) {
		P1=P2=0;
		int cost_green=scan.nextInt();
		int cost_pur=scan.nextInt();
		int n=scan.nextInt();
		
		for(int j=1;j<=n;j++) {
			int prob1=scan.nextInt();
			if(prob1==1)
				P1++;
			int prob2=scan.nextInt();
			if(prob2==1)
				P2++;
		}
		
		 int min1=P1*cost_green+P2*cost_pur;
      int  min2=P1*cost_pur+P2*cost_green;
      if(min1<min2)
    	  min=min1;
      else
    	  min=min2;
	System.out.println(min);
	}
	}
}
