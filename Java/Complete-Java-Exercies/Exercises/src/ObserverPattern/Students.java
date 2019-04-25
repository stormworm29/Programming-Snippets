package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class Students implements Observer{
	@Override
	public void update(Observable o, Object msg) {
		bhago((String)msg);
	}
	public void bhago(String msg) {
		System.out.println("Student is running ... " + msg);
	}
}
