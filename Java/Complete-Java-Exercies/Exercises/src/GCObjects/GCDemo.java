package GCObjects;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GCDemo {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Before Birth of tatha ... " + r.freeMemory());
		GrandFather tatha = new GrandFather();
		System.out.println("After Birth of tatha ...." + r.freeMemory());
		SoftReference<GrandFather> soft = new SoftReference<GrandFather>(tatha);
//		WeakReference<GrandFather> weak = new WeakReference<GrandFather>(tatha);
		tatha = null;
//		System.out.println(tatha.getGold());
		System.out.println("After death of tatha ... "+ r.freeMemory());
		System.out.println("kariyam ....");
		r.gc();
		System.out.println("After kariyam ...." + r.freeMemory());
		tatha = soft.get();
		System.out.println(tatha.getGold());
	}
}
class GrandFather {
	String age;
	private String gold = "Gold under the Banyan Tree ....";
	public GrandFather() {
		for(int i=0;i<1000;i++) {
			age = new String(i+"");
		}
	}
	public String getGold() {
		return gold;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize is Called");
		System.out.println(getGold());
	}
}