package basics_of_IO;
/*
 You are given a number N. You can perform the following operations on N any number of times.
> If N is even, divide N by 2.
> If N is odd, replace N with 3N+1.
Your task is to find out, for a given N, if it is possible to reach the number 1 after performing the above two valid operations on N any number of times.
INPUT:
First-line contains T denoting the number of test cases.
Next T lines contain just one integer, N.
OUTPUT:
Print "YES" (without the quotes) if it is possible to reach 1 for the given N. Else print "NO"(without quotes).*/
/*
 Constraints:
1<= T <=100
2<= N <= 10100,000
*/
import java.math.BigInteger;
import java.util.Scanner;
public class Conject_It {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int tc = s.nextInt();  
       for(int i = 0; i < tc; i++) { 
         BigInteger n = new BigInteger(s.next());  
         BigInteger zero = new BigInteger("0"); 
         BigInteger one = new BigInteger("1"); 
         BigInteger two = new BigInteger("2"); 
         BigInteger three = new BigInteger("3"); 
            while(n.compareTo(one) == 1) { 
             if(n.mod(two).equals(zero)) { 
              n = n.divide(two); 
             } else { 
              n = n.multiply(three).add(one);  
             } 
            } 
            System.out.println(n.equals(one)? "YES" : "NO");  
       } 
	}
}

	
