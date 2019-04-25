package day3;

public class ClassDemo {
}
class Pepsi {
	class CocaCola extends Cola {
		public void method() {
			System.out.println("Cola made by cola");
		}
	}
	public void method() {
		Cola cola = new CocaCola();
		cola.method();
	}
}
class ABC {
	public void method() {
		Cola coal = new Pepsi() . new CocaCola();
	}
}
class ClassA {
	class ClassB {
		public void method(int i, char c) {
		}
	}
	public void method() {
	}
}

class ClassC extends ClassA{
	ClassB d = new ClassA() .new ClassB();
}
abstract class Cola { abstract void method();}