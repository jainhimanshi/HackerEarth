package basics_of_IO;

/*Roy wants to upload a pic.
 * Only L*L can be uploaded.
 * Roy has N photos of various dimension.(W*H where w=width,h=height)
 * When any photo is uploaded following events may occur:
[1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
[2] If width and height, both are large enough and
(a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
(b) else user is prompted to crop it. Print "CROP IT" in this case.
 *
 *Given L, N, W and H as input, print appropriate text as output.
Input:
First line contains L.
Second line contains N, number of photos.
Following N lines each contains two space separated integers W and H.
Output:
Print appropriate text for each photo in a new line.

SAMPLE INPUT 
180
3
640 480
120 300
180 180

SAMPLE OUTPUT 
CROP IT
UPLOAD ANOTHER
ACCEPTED
 * */
import java.util.*;
public class Roy_and_Profile_Picture {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int L=scan.nextInt();
		int N=scan.nextInt();
		for(int i=0;i<N;i++) {
			int W=scan.nextInt();
			int H=scan.nextInt();
			checkphoto(W,H,L);
		}
	}
	static void checkphoto(int W,int H,int L) {
		if(W<L||H<L)
			System.out.println("UPLOAD ANOTHER");
		else {
			if((H==L&&W==L)||W==H)
				System.out.println("ACCEPTED");
			else if(W>L||H>L)
				System.out.println("CROP IT");
		}
	}

}
