package factorypack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		try {
		ShoeShop shop = ctx.getBean("shop",ShoeShop.class);
		Customer cust = ctx.getBean("customer",Customer.class);
//		System.out.println(cust.getName());
//		System.out.println(cust.getId());
		Shoe shoe = shop.sellShoe(cust);
		System.out.println(shop);
		shop.dummy();
		Seller shop1 = (Seller)ctx.getBean("advicedshop");
		Customer cust1 = new Customer(13);
		cust.setName("gladstoneabraham");
		Shoe shoe1 = shop1.sellShoe(cust);
//		shop1.sellShoe(cust);
		System.out.println(shoe1);
		Purchase p = (Purchase) shop1;
		p.buyShoe();
		} catch(Exception e) { }
		ctx.close();
	
	}
}
