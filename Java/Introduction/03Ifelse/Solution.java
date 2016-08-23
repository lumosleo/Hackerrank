import java.util.Scanner;
public class Solution{
	public static void main(String[] str){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		if(a%2 != 0)//if odd
			System.out.println("Weird");
	
		if(a%2 == 0){//if even
			if(a>=2 && a<=5){ 
				System.out.println("Not Weird");
			}
			else if(a>=6 && a<=20){
				System.out.println("Weird");
			}
			else{
				System.out.println("Not Weird");
			}
		}

	}	

}
