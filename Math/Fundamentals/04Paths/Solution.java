import java.io.*;
import java.util.*;

public class Solution {

    public static int gcd(int a,int b){
	int rem;
	while(a!=0){
		rem = b%a;
		b = a;
		a = rem;
	}
		return b;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	Scanner in = new Scanner(System.in);
	int total = in.nextInt();
	int a=0,b=0,x=0,y=0;
	for(int i=0;i<total;i++){
		a = in.nextInt();
		b = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();
		if(gcd(a,b) == gcd(x,y)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	} 
   }
}
