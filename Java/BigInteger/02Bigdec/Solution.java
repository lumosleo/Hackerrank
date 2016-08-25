import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        //Write your code here

        BigDecimal bDec[] = new BigDecimal[n];
        for(int i=0;i<n;i++){
            bDec[i] = new BigDecimal(s[i]);
        }
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            str[i] = s[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(bDec[j].compareTo(bDec[j+1]) == 1){
                    BigDecimal swap = bDec[j+1];
                    bDec[j+1] = bDec[j];
                    bDec[j] = swap;
                    
                    String x = str[j+1];
                    str[j+1] = str[j];
                    str[j] = x;
                }
            }
        }
        Collections.reverse(Arrays.asList(str));
        for(int i=0;i<n;i++){
            s[i] = str[i];
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
