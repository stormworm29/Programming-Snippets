package Politician;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Police {
	public static void arrest(Object obj) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = obj.getClass();
		String className = cls.getName();
		System.out.println("Class Name : " + className);
		Method methodcall = cls.getDeclaredMethod("secretAssets");
		Method methodcall1 = cls.getDeclaredMethod("assets");
		Field field = cls.getDeclaredField("name");
		Field field1 = cls.getDeclaredField("secretName");
		field1.setAccessible(true); 
		System.out.println(field.get(obj));
		System.out.println(field1.get(obj));
		methodcall.setAccessible(true);
		methodcall.invoke(cls);
		methodcall1.invoke(cls);
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Politician p = new Politician();
		Police.arrest(p);
	}
}
