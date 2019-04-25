package day1;

public class Extwentyfour {
	public static void main(String[] args) {
		quad q = new quad(5,6,7);
		System.out.println(q.func(3));
	}
}
class quad {
	static int a,b,c;
	quad() {
		a=b=c=1;
	}
	quad(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	int extractora() {
		return a;
	}
	int extractorb() {
		return b;
	}
	int extractorc() {
		return c;
	}
	void override(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	int func(int x) {
		int result = 0;
		result = (a*((x)^2)) + (b*(x)) + (c);
		return result;
	}
	
}
