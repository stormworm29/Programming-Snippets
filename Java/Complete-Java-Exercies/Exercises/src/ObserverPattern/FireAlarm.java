package ObserverPattern;

import java.util.Observable;

public class FireAlarm extends Observable{
	public void setFire() {
		setChanged();
		notifyObservers("fire in the mountain run run run.....");
	}
}
