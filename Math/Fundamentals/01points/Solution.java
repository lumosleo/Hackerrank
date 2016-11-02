import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	Scanner in = new Scanner(System.in);
	int total = in.nextInt();
	int px =0 ,qx=0,py=0,qy=0,rx =0,ry =0;
	for(int i=0;i<total;i++){
		px = in.nextInt();
		py = in.nextInt();
		qx = in.nextInt();
		qy = in.nextInt();
		rx = 2*qx - px;
		ry = 2*qy - py;
		System.out.println(rx + " "+ ry);
	}

    }
}
