package factorypack;

public class ShoeException extends Exception{
	String msg;
	public ShoeException() {
		// TODO Auto-generated constructor stub
	}
	public ShoeException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The Exception error is  : " + msg;
	}
}
