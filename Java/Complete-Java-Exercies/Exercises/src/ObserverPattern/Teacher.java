package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer{
	@Override
	public void update(Observable o, Object msg) {
		bhago((String)msg);
	}
	public void bhago(String msg) {
		System.out.println("teacher is running ... " + msg);
	}
}
