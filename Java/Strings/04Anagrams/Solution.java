import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution{

	public static boolean isAnagram(String a,String b){
		a = a.toLowerCase();
		b = b.toLowerCase();	
	
		if(a.length() != b.length())
			return false;
		Map <Character, Integer> str1 = new HashMap <Character, Integer>();
		Map <Character, Integer> str2 = new HashMap <Character, Integer>();
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		
		for(int i=0;i<a.length();i++){
			str1.put(charA[i],0);	
			str2.put(charB[i],0);	
		}
		for(int j=0;j<a.length();j++){
			str1.put(charA[j],str1.get(charA[j])+1);
			str2.put(charB[j],str2.get(charB[j])+1);
		}

		for(int i=0;i<a.length();i++){
			if(str1.get(charA[i]) != str2.get(charA[i]))
				return false;
		}

		return true;

	}



	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		in.close();
		boolean ret = isAnagram(a,b);
		System.out.println((ret)?"Anagrams":"Not Anagrams");
		

	}


}
