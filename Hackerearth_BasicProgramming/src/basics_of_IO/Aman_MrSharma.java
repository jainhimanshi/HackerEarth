package basics_of_IO;
/*On a distant planet far away from Earth lives a boy named Aman.He loves to run everyday.But his running distance is directly affected by how much horlicks his mother mixed in his milk today.If his mother has mixed x grams of horlicks,then Aman will be capable of running 100*x meters at most on that day.
Aman's instructor, Mr.Sharma ,is a very strict yet very caring.Everyday he asks Aman to run around a circle of radius r once.If Aman is able to complete the circle,he would get a toffee.
Note:Take value of pie=22/7.
INPUT:
First line contains d,no of days Aman goes to his instructor.Next d lines each contain r,radius of circle and x,amount of horlicks.
OUTPUT:
Print total number of toffees.Aman would finally have at the end of d days.*/

import java.util.Scanner;
public class Aman_MrSharma {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long days=scan.nextLong();
		long toffee=0;
		for(int i=1;i<=days;i++) {
			long rad=scan.nextLong();
			long x=scan.nextLong();
			double circledis=2*(22/7.0)*rad;
			if((100.0*x)>=circledis)
				toffee++;
		}
		System.out.print(toffee);
	}
}
