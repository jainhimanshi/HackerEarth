package operators;

import java.util.Scanner;
public class Going_to_office {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double D=scan.nextInt();
		int OC=scan.nextInt();
		int OF=scan.nextInt();
		int OD=scan.nextInt();
		double  CS=scan.nextInt();
		int CB=scan.nextInt();
		int CM=scan.nextInt();
		int CD=scan.nextInt();
		
		double cost_online=(OC+(D-OF)*OD);
		double cost_offline=(CB+((Math.floor(D/CS))*CM)+(D*CD));
		
		if((cost_offline>cost_online)||(cost_offline==cost_online))
			System.out.print("Online Taxi");
		else
			System.out.print("Classic Taxi");
	}
}
