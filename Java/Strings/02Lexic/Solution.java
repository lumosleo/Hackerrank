import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String inputStr = in.next();
        int n = in.nextInt();
        String initStr = inputStr.substring(0,n);
        String minStr = initStr;
        String maxStr = initStr;
        for(int i = 1;i<inputStr.length()-n+1;i++){
            String tempStr = inputStr.substring(i,i+n);
            if(minStr.compareTo(tempStr)>=0)
                minStr = tempStr;
            if(maxStr.compareTo(tempStr)<0)
                maxStr = tempStr;
        }
        System.out.println(minStr);
        System.out.println(maxStr);
            
    }
}
