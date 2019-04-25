package utilpack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reeflect {
	private int num;
	public Reeflect() {
		num = 1;
		System.out.println("object created");
	}
	public Reeflect(int newNum) {
		System.out.println("yoyoy");
		num = newNum;
	}
	@yearsLived(byear=1997,age=18)
	public void print() {
		System.out.println("value of num is : " + num);
	}
	public static void main(String[] args) throws Exception{
		Class cls = Class.forName("utilpack.Reeflect");
		Constructor cons = cls.getConstructor(int.class);
		Object obj = cons.newInstance(78);
		Field f = cls.getDeclaredField("num");
		System.out.println(obj);
		Method  printMeth = cls.getMethod("print");
		yearsLived anno = printMeth.getAnnotation(yearsLived.class);
		printMeth.invoke(obj);
		System.out.println(anno.age());
		
		
	}
}
