//package utilpack;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//
//import java.lang.reflect.Proxy;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//class A{}
//public class ProxyDemo {
//    
//    public static Object getObject(Object o[]) {
//    Class c[] = getInterfaces();
//    Object object = Proxy.newProxyInstance(A.class.getClassLoader(), c, new Mix(o));
//    }
//    
//    private static List<Class> v = new <Class>();
//    public static void setInterface(Class c) {
//        v.add(c);
//    }
//    
//    public static Class[] getInterfaces() {
//        int i=0;
//        int size = v.size();
//        Class[] c = new Class[size];
//        Iterator<Class> en = v.iterator();
//        while(en.hasNext()) {
//            c[i++] = en.next();
//        }
//        return c;
//    }
//    public static void main(String[] args) {
//		setInterface(Sample.class);
//		Object o = getObject(new Object[] { new SampleImpl() });
//		Sample s = (Sample) o;
//		s.test();
//	}
//}
//
//class Mix implements InvocationHandler {
//	Object obj[];
//	public Mix(Object obj[]) {
//		this.obj = obj;
//	}
//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println("invoke method called ...");
//		Object o = null;
//		for(int i=0;i<obj.length;i++) {
//			try {
//				o = method.invoke(obj[i], args);
//			}
//			catch(Exception e) {
//				
//			}
//			return 0;
//		}
//	}
//}