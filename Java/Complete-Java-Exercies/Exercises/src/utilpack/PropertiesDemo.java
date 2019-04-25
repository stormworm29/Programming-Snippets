package utilpack;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.put("a1","ramu");
		prop.get("a1");
		
		prop.load(new FileInputStream("config.properties"));
		System.out.println(prop.get("a1"));
//		Locale locale = Locale.getDefault();
//		System.out.println(locale);
		Locale locale = new Locale("ta");
		
		ResourceBundle rb = ResourceBundle.getBundle("dictionary", locale);
		System.out.println(rb.getString("hello2"));
		ResourceBundle rb2 = ResourceBundle.getBundle("utilpack.Dictionary",locale);
		System.out.println(rb2.getString("hello"));
	}
}
