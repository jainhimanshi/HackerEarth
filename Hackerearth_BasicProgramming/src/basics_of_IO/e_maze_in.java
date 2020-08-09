package basics_of_IO;
/*
Ankit is in maze. The command center sent him a string 
which decodes to come out from the maze. He is initially 
at (0, 0). String contains L, R, U, D denoting left, right,
up and down. In each command he will traverse 1 unit
distance in the respective direction.
example if he is at (2, 0)and command is L he will go to (1,0).
Input:Input contains a single string.
Output:Print the final point where he came out.*/

import java.util.*; 
public class e_maze_in {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
    path(s.toCharArray());
	}
	static void path(char[] arr) {
		int rl=0;
		int ud=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='L')
				rl=rl-1;
			else if(arr[i]=='R')
				rl=rl+1;
			else if(arr[i]=='U')
				ud=ud+1;
			else if(arr[i]=='D')
				ud=ud-1;
		}
		System.out.println(rl+" "+ud);
	}

}
