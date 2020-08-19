package implementation;
/*Little Jhool always wanted to have some psychic powers so that he could showoff his skills, and magic to people and impress them. (Specially, his girlfriend Big Jhool!) But, in spite all his efforts, hardwork, dedication, Googling, watching youtube videos he couldn't garner any psychic abilities!
He knew everyone was making fun of him, so to stop all of that - he came up with a smart plan. Anyone who came to him to know about their future, he asked them to write a binary number for him - and then, he smartly told them if the future for that person had good in store, or bad.
The algorithm which Little Jhool follows is, as following:
If the binary number written by the person has six consecutive 0 or 1 , or , his future is bad.
Otherwise, he says that their future is good.
Input format:
Single line contains a binary number.
Output format:
You need to print "Good luck!" (Without quotes, and WITH exclamation mark!) if the Jhool is going to tell them that they're going to have a good time. Else, print "Sorry, sorry!" if the person is going to be told that he'll have a hard time!*/
/*SAMPLE INPUT 
0001111110
SAMPLE OUTPUT 
Sorry, sorry!*/
import java.util.Scanner;
public class Little_Jhool_Psychic_powers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int res=check(s);
		if(res==-1)
			System.out.print("Good luck!");
		else
			System.out.print("Sorry, sorry!");
	}
	static int check(String s) {
		int zerocount=0,onecount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') {
				onecount=0;
				zerocount++;
				if(zerocount==6) {
					zerocount=0;
					return 1;}
				}
			else if(s.charAt(i)=='1') {
				zerocount=0;
				onecount++;
				if(onecount==6) {
					onecount=0;
					return 1;}
			}
		}
		return -1;
	}

}
