package implementation;
/*You like the sound of rain only if the sound ranges from  to  units. Every cloud makes  unit of sound. Determine the minimum and the maximum number of clouds that can produce the sound in the provided range.
Input format
First line: One integer  denoting the number of test cases
Next  lines: Three integers  and  denoting the provided range of the rain sound and the units of sound produced by each cloud
Output format
In  lines, print two space-separated integers that represent the minimum and the maximum number of the clouds that can produce the sound in the provided range.
Note: Print -1 -1 if no answer is available.
SAMPLE INPUT 
3
5 10 3
7 12 4
50 60 1
SAMPLE OUTPUT 
2 3
2 3
50 60*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Rain_Sound {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	//StringTokenizer st=new StringTokenizer(br.readLine());
	int t=Integer.parseInt(br.readLine());
	
	for(int i=1;i<=t;i++) {
		//StringTokenizer st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		maxmin(l, r, s);
		}
	}
	//In java, when we perform division using int variables then by default we get floor() value.
	//For ceil() value we have to perform division using float variables.
	//For lower limit use ceil() and for upper limit floor().
	static void maxmin(double l,double r,double s) {
		int min=(int)Math.ceil(l/s);
		int max=(int)Math.floor(r/s);
		if(min>max) System.out.println("-1 -1");
		else
		System.out.println(min+" "+max);
	}
}

/*static void maxmin(int l,int r,int s) {
	int i=1;
	int max=0;
	int maxindex=-1;
	int min=0;
	int minindex=-1;
	while(1==1) {
		int sum=s*i;
		if((sum)<l)
			i++;
		else if(sum>r)
			break;
		else if (((sum)>=l)&&((sum)<=r)) {
			if(minindex==-1) {
				minindex=i;
				min=sum;}
			if(sum>max) {
				max=sum;
				maxindex=i;}
			i++;
		}
	}
	System.out.println(minindex+" "+maxindex);
}*/
	