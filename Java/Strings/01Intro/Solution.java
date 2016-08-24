import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)<=0)
            System.out.println("No");
        else
            System.out.println("Yes");
        char A0 = Character.toUpperCase(A.charAt(0));
        char B0 = Character.toUpperCase(B.charAt(0));
        System.out.println(A0+A.substring(1) + " " + B0+B.substring(1));
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
