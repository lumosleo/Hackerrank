import java.util.Scanner;

public class Solution{


	public static String reverse(String s){
		char[] input = s.toCharArray();
		int begin = 0;
		int end = s.length()-1;
		for(;begin<end;){
			char temp = input[begin];
			input[begin] = input[end];
			input[end] = temp;
			begin++;
			end--;
			
		}
		
		return new String(input);

	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inputStr = in.next();
		if(inputStr.equals(reverse(inputStr)))
			System.out.println("Yes");
		else
			System.out.println("No");	
	}

}
