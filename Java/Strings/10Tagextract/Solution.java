//most important concept here is to note the use of negative logic is everything apart from ">" and "<" is allowed

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases-- > 0){
         String line = in.nextLine();
         String templine = line;
         String pattern  = "<(.+)>(.[^<>]+)</\\1>";
          Pattern r = Pattern.compile(pattern);
          Matcher m = r.matcher(line);
          boolean notfound = true;
          while(m.find()){
              System.out.println(m.group(2));
              notfound = false;
          }
          if(notfound){
              System.out.println("None");
          }
      }
   }
}

