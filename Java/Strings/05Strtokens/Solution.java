import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String pattern = "([a-zA-Z])+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        int count=0;
        while(m.find()){
            count++;
        }
        System.out.println(count);
        m = r.matcher(s);
        while(m.find()){
            System.out.println(m.group(0));
        }

        // Write your code here.
    }
}

