package springpack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBasics {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		PaintBrush brush = ctx.getBean("brush", PaintBrush.class);
		Paint paint = brush.getPaint();
		paint.doPaint();
	}
}
