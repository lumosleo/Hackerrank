import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 	
	Scanner in = new Scanner(System.in);
	int total = in.nextInt();
	for(int i =0;i<total;i++){
		int temp = in.nextInt();
		System.out.println(temp+1);
	}       
    }
}
