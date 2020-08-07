package basics_of_IO;

import java.util.*;
public class Cost_of_ballons {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	int zerocount=0;
	int onecount=0;
	int min=0;
	
	for(int i=0;i<t;i++) {
		int cost_green=scan.nextInt();
		int cost_pur=scan.nextInt();
		int n=scan.nextInt();
		
		for(int j=1;j<=n;j++) {
			int prob1=scan.nextInt();
			int prob2=scan.nextInt();
			if(prob1==0)
				zerocount++;
			else
				onecount++;
			if(prob2==0)
				zerocount++;
			else
				onecount++;
		}
	  if(zerocount>onecount)
		  min=zerocount*cost_green+onecount*cost_pur;
	  else
		  min=zerocount*cost_pur+onecount*cost_green;
	}
	System.out.print(min);
	}
}
