import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}

class myRegex{
    public static String pattern = "((([2]?[012345]?[0123456]?)|([01]?[0123456789]?[0123456789]))[.]){3}(([2]?[012345]?[0123456]?)|([01]?[0123456789]?[0123456789]))";
}
