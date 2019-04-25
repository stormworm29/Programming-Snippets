package exceptiontest;

public class DogExceptionDemo {
	
}

abstract class DogException extends Exception {
	abstract public void visit();
}
class DogBiteException extends DogException {
	String msg;
	public DogBiteException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The DogBiteException : " + msg;
	}
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
class DogBarkException extends DogException {
	String msg;
	public DogBarkException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The DogBarkException : " + msg;
	}
	@Override
	public void visit() {
		new Handler911().handle(this);
	}
}
abstract class Item { }
class StickItem extends Item {
	public StickItem() throws DogException{
		throw new DogBarkException("bla bla bla ...");
	}
}
class StoneItem extends Item {
	public StoneItem() throws DogException{
		throw new DogBiteException("you beat I bite ...");
	}
}
class Dog {
	public void play(String item) throws Exception{
		Item i = (Item)Class.forName("exceptiontest."+ item + "Item").newInstance();
	}
}
