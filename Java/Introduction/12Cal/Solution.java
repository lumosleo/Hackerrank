import java.util.Scanner;
import java.util.Calendar;

public class Solution{
	public static void main(String[] args){
		
		String week[] = {
		"SUNDAY",
		"MONDAY",
		"TUESDAY",
		"WEDNESDAY",
		"THURSDAY",
		"FRIDAY",
		"SATURDAY"};

		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)-1]);
	}

}
