import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int B,H;
    public static boolean flag = true;
    public static Scanner in = new Scanner(System.in);
static {
    
    try{

    B = in.nextInt();
    H = in.nextInt();
    if(B<1 || H<1){
        flag=false;
        throw new Exception();
    }
    }
    catch(Exception e){
        System.out.println(e+": Breadth and height must be positive");
    }
    
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

