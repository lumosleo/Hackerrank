import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int N = in.nextInt();
            System.out.println(N*(N-1)/2);
//because easch of the Nusers can shake hands with the (N-1) other users. And two people make one handshake hence the divide by 2 
        }
    }
}

