package day1;

public class Extwentythree {
	protected static int a = 20;
	
	public static void main(String[] args) {
		System.out.println("main");
		All a = new All();
		a.func();
	}
}

class All extends Extwentythree {
	public static void func() {
		System.out.println(a+20);
	}
}
