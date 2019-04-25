package transpack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
public static void main(String[] args)throws Exception {
	
	ConfigurableApplicationContext ctx=new FileSystemXmlApplicationContext("config.xml");
	
	Controller tm=(Controller)ctx.getBean("advisedcontroller");
	
	tm.doBusiness();
 }
}
