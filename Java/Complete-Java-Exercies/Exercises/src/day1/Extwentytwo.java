package day1;

public class Extwentytwo {
	public static void main(String[] args) {
		A a = new A();
//		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.d);
		System.out.println(a.c);
		a.fun1();
		a.fun3();
//		a.fun2();
		a.fun4();
	}
}
class A {
	private int a;
	protected int b;
	public int c;
	int d;
	public void fun1() {}
	private void fun2() {}
	protected void fun3() {}
	void fun4() {}
}