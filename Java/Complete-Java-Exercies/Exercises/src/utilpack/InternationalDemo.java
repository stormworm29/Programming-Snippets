package utilpack;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalDemo {
	public static void main(String[] args) {
		Locale loc = Locale.ENGLISH;
		Integer i = 1_5_0_0_0_974;
//		System.out.println(i);
		NumberFormat numberformatter  = NumberFormat.getNumberInstance(loc);
		System.out.println(String.format("Locale: %s; int: %s", loc , numberformatter.format(i)));
		NumberFormat currencyformatter = NumberFormat.getCurrencyInstance(new Locale("en","us"));
		System.out.println(String.format("Locale: %s;currency: %s", loc, currencyformatter.format(i)));
		
		DateFormat dateformatter = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
		Date d = new Date();
		System.out.println(String.format("Locale: %s; Date: %s", loc , dateformatter.format(d)));
		String pattern = "EEE, MMMM d, yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern, loc);
		System.out.println(String.format("Locale: %s; custom date format: %s", loc, sdf.format(d)));
		
	}
}
