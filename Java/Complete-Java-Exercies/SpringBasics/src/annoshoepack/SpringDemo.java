package annoshoepack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo {
	public static void main(String[] args) {
		try {
		ApplicationContext actx = new ClassPathXmlApplicationContext("annoconfig.xml");
		Seller shop = (Seller) actx.getBean("lss");
		Customer cust = new Customer(13);
		Shoe shoe = shop.sellShoe(cust);
		System.out.println(shoe);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
