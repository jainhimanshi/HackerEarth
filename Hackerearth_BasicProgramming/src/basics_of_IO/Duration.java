package basics_of_IO;
/*
Rahul is a very busy persion he dont wan't to waste his 
time . He keeps account of duration of each and every 
work. Now he don't even get time to calculate duration 
of works, So your job is to count the durations for 
each work and give it to rahul.
Input:
First line will be given by N number of works
Next N line will be given SH,SM,EH and EM  each 
separated by space(SH=starting hr, SM=starting min, 
EH=ending hr, EM=ending min)
Output:
N lines with duration HH MM(hours and minutes separated 
by space)*/
import java.util.Scanner;
public class Duration {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=1;i<=T;i++) {
			int SH=scan.nextInt();
			int SM=scan.nextInt();
			int EH=scan.nextInt();
			int EM=scan.nextInt();
			calc(SH,SM,EH,EM);
		}	
	}
		static void calc(int SH,int SM,int EH,int EM) {
			int ST=SH*60+SM;
			int ET=EH*60+EM;
			
			int diff=ET-ST;
			int FH=diff/60;
			int FM=(diff-(FH*60));
			
			System.out.println(FH+" "+FM);
		}
}
