package day2_2;

import day2.AccessDemo;

public class day2_2 extends AccessDemo {
	private int pri;
	protected int pro;
	public int pub;
	int nomod;
	public void method() {
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(pub);
		System.out.println(nomod);
	}
}
class AccessDemoDiffSubClass {
	AccessDemo obj = new AccessDemo();
	public void method() {
		//System.out.println(obj.pri);
		//System.out.println(obj.pro);
		System.out.println(obj.pub);
		//System.out.println(obj.nomod);
	}
}